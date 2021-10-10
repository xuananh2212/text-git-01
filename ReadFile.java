package bai_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;


public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("arr.txt");
//        System.out.println("đây có phải tệp hay không: " + file.isFile());
//        System.out.println("đây có phải thư mục hay không : "+ file.isDirectory());
//        System.out.println("tệp này có thể đọc được không: " + file.canRead());
//        System.out.println("tệp này có thể  ghi được không : "+ file.canWrite());
//        System.out.println("tên của tệp : "+ file.getName());
//        System.out.println("đường dẫn : " + file.getAbsolutePath());
//        System.out.println("kích thước :"+ file.length());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println("có tồn tai: "+ file.exists());
        Scanner readFile = new Scanner(file);

//        while(readFile.hasNextLine()){
//
//            var line = readFile.nextLine();
//            System.out.println(line);
//        }
//        readFile.close();
        if (readFile.hasNextInt()) {
            var n = readFile.nextInt();
            int[] number = new int[n];
            int i = 0;
            while (readFile.hasNextInt()) {

                number[i++] = readFile.nextInt();


            }
           xuatMang(number);
        }

        readFile.close();

    }

    private static void xuatMang(int[] number) {
        for(int i = 0 ;i< number.length; i++){

            System.out.print(number[i] +" ");


        }
    }


}
