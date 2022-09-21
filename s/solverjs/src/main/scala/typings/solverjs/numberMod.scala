package typings.solverjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberMod {
  
  @JSImport("solverjs/number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def binToDec(bin: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("binToDec")(bin.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def binToHex(bin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("binToHex")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def binToOct(bin: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("binToOct")(bin.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decToBin(dec: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decToBin")(dec.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decToHex(dec: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decToHex")(dec.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decToOct(dec: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decToOct")(dec.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToBin(hex: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBin")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToDec(hex: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToDec")(hex.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hexToOct(hex: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToOct")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def octToBin(oct: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("octToBin")(oct.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def octToDec(oct: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("octToDec")(oct.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def octToHex(oct: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("octToHex")(oct.asInstanceOf[js.Any]).asInstanceOf[String]
}
