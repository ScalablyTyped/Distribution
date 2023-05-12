package typings.rcComponentMiniDecimal

import typings.rcComponentMiniDecimal.anon.DecimalStr
import typings.rcComponentMiniDecimal.esMiniDecimalMod.DecimalClass
import typings.rcComponentMiniDecimal.esMiniDecimalMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rc-component/mini-decimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: ValueType): DecimalClass = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[DecimalClass]
  
  @JSImport("@rc-component/mini-decimal", "BigIntDecimal")
  @js.native
  open class BigIntDecimal protected ()
    extends typings.rcComponentMiniDecimal.esMiniDecimalMod.BigIntDecimal {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  
  @JSImport("@rc-component/mini-decimal", "NumberDecimal")
  @js.native
  open class NumberDecimal protected ()
    extends typings.rcComponentMiniDecimal.esMiniDecimalMod.NumberDecimal {
    def this(value: ValueType) = this()
  }
  
  inline def getNumberPrecision(number: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberPrecision")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getNumberPrecision(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberPrecision")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def num2str(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("num2str")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toFixed(numStr: String, separatorStr: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toFixed(numStr: String, separatorStr: String, precision: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toFixed(numStr: String, separatorStr: String, precision: Double, cutOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], cutOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toFixed(numStr: String, separatorStr: String, precision: Unit, cutOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], cutOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def trimNumber(numStr: String): DecimalStr = ^.asInstanceOf[js.Dynamic].applyDynamic("trimNumber")(numStr.asInstanceOf[js.Any]).asInstanceOf[DecimalStr]
  
  inline def validateNumber(num: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validateNumber(num: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNumber")(num.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
