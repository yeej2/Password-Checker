import java.util.Scanner;

import java.io.*;


public class PasswordMin{

  public static void Min(){


    while(true; i++) {

      i=0
;
      boolean number = false;

      boolean upCharacters = false;

      boolean lowCharacters = false;

      boolean specialChar = false;

      Scanner sc=new Scanner(System.in);


      System.out.println("Please enter a password... ");

      String password=sc.nextLine();


      if(password.length() < 8){

        System.out.println("Your password is not long enough.");

      } else {
        String passwordArray[] = password.split("");


        if(passwordArray[i] >= "A" && passwordArray[i] <= "Z"){

          upCharacters = true;


          } else {

            UpperLettersTest = 1;
            









          }
        if(passwordArray[i] >= "a" && passwordArray[i] <= "z"){

          lowCharacters = true;


          else{

            System.out.println("You have no lowercase letters.");

        else{
        System.out.println("Your password is long enough");

          }

        }

      }

    }

}
