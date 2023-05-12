package typings.rcComponentMiniDecimal

import typings.rcComponentMiniDecimal.anon.DecimalStr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esNumberUtilMod {
  
  @JSImport("@rc-component/mini-decimal/es/numberUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNumberPrecision(number: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberPrecision")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getNumberPrecision(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberPrecision")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isE(number: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isE")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isE(number: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isE")(number.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def num2str(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("num2str")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trimNumber(numStr: String): DecimalStr = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNumber")(numStr.asInstanceOf[js.Any]).asInstanceOf[DecimalStr]
  
  inline def validateNumber(num: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validateNumber(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
