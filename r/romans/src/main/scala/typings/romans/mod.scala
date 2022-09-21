package typings.romans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("romans", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("romans", "allChars")
  @js.native
  val allChars: js.Array[RomanCharacter] = js.native
  
  @JSImport("romans", "allNumerals")
  @js.native
  val allNumerals: js.Array[RomanNumeral] = js.native
  
  inline def deromanize(romanStr: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deromanize")(romanStr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def romanize(decimal: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("romanize")(decimal.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* keyof romans.anon.C */ /* Rewritten from type alias, can be one of: 
    - typings.romans.romansStrings.M
    - typings.romans.romansStrings.CM
    - typings.romans.romansStrings.D
    - typings.romans.romansStrings.CD
    - typings.romans.romansStrings.C
    - typings.romans.romansStrings.XC
    - typings.romans.romansStrings.L
    - typings.romans.romansStrings.XL
    - typings.romans.romansStrings.X
    - typings.romans.romansStrings.IX
    - typings.romans.romansStrings.V
    - typings.romans.romansStrings.IV
    - typings.romans.romansStrings.I
  */
  trait RomanCharacter extends StObject
  
  /* Inlined {  M :1000,   CM :900,   D :500,   CD :400,   C :100,   XC :90,   L :50,   XL :40,   X :10,   IX :9,   V :5,   IV :4,   I :1}[romans.romans.RomanCharacter] */
  /* Rewritten from type alias, can be one of: 
    - typings.romans.romansNumbers.`400`
    - typings.romans.romansNumbers.`500`
    - typings.romans.romansNumbers.`1000`
    - typings.romans.romansNumbers.`4`
    - typings.romans.romansNumbers.`900`
    - typings.romans.romansNumbers.`5`
    - typings.romans.romansNumbers.`100`
    - typings.romans.romansNumbers.`50`
    - typings.romans.romansNumbers.`10`
    - typings.romans.romansNumbers.`9`
    - typings.romans.romansNumbers.`40`
    - typings.romans.romansNumbers.`90`
    - typings.romans.romansNumbers.`1`
  */
  trait RomanNumeral extends StObject
  object RomanNumeral {
    
    inline def `1`: typings.romans.romansNumbers.`1` = 1.asInstanceOf[typings.romans.romansNumbers.`1`]
    
    inline def `10`: typings.romans.romansNumbers.`10` = 10.asInstanceOf[typings.romans.romansNumbers.`10`]
    
    inline def `100`: typings.romans.romansNumbers.`100` = 100.asInstanceOf[typings.romans.romansNumbers.`100`]
    
    inline def `1000`: typings.romans.romansNumbers.`1000` = 1000.asInstanceOf[typings.romans.romansNumbers.`1000`]
    
    inline def `4`: typings.romans.romansNumbers.`4` = 4.asInstanceOf[typings.romans.romansNumbers.`4`]
    
    inline def `40`: typings.romans.romansNumbers.`40` = 40.asInstanceOf[typings.romans.romansNumbers.`40`]
    
    inline def `400`: typings.romans.romansNumbers.`400` = 400.asInstanceOf[typings.romans.romansNumbers.`400`]
    
    inline def `5`: typings.romans.romansNumbers.`5` = 5.asInstanceOf[typings.romans.romansNumbers.`5`]
    
    inline def `50`: typings.romans.romansNumbers.`50` = 50.asInstanceOf[typings.romans.romansNumbers.`50`]
    
    inline def `500`: typings.romans.romansNumbers.`500` = 500.asInstanceOf[typings.romans.romansNumbers.`500`]
    
    inline def `9`: typings.romans.romansNumbers.`9` = 9.asInstanceOf[typings.romans.romansNumbers.`9`]
    
    inline def `90`: typings.romans.romansNumbers.`90` = 90.asInstanceOf[typings.romans.romansNumbers.`90`]
    
    inline def `900`: typings.romans.romansNumbers.`900` = 900.asInstanceOf[typings.romans.romansNumbers.`900`]
  }
}
