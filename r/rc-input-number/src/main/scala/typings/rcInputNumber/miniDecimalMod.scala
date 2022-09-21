package typings.rcInputNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miniDecimalMod {
  
  @JSImport("rc-input-number/es/utils/MiniDecimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: ValueType): DecimalClass = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[DecimalClass]
  
  @JSImport("rc-input-number/es/utils/MiniDecimal", "BigIntDecimal")
  @js.native
  open class BigIntDecimal protected ()
    extends StObject
       with DecimalClass {
    def this(value: String) = this()
    def this(value: Double) = this()
    
    /**
      * Align BigIntDecimal with same decimal length. e.g. 12.3 + 5 = 1230000
      * This is used for add function only.
      */
    /* private */ var alignDecimal: Any = js.native
    
    var decimal: js.BigInt = js.native
    
    /** BigInt will convert `0009` to `9`. We need record the len of decimal */
    var decimalLen: Double = js.native
    
    var empty: Boolean = js.native
    
    /* private */ var getDecimalStr: Any = js.native
    
    /* private */ var getIntegerStr: Any = js.native
    
    /* private */ var getMark: Any = js.native
    
    var integer: js.BigInt = js.native
    
    var nan: Boolean = js.native
    
    var negative: Boolean = js.native
    
    var origin: String = js.native
  }
  
  @JSImport("rc-input-number/es/utils/MiniDecimal", "NumberDecimal")
  @js.native
  open class NumberDecimal protected ()
    extends StObject
       with DecimalClass {
    def this(value: ValueType) = this()
    
    var empty: Boolean = js.native
    
    var number: Double = js.native
    
    var origin: String = js.native
  }
  
  inline def toFixed(numStr: String, separatorStr: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toFixed(numStr: String, separatorStr: String, precision: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toFixed(numStr: String, separatorStr: String, precision: Double, cutOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], cutOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def toFixed(numStr: String, separatorStr: String, precision: Unit, cutOnly: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toFixed")(numStr.asInstanceOf[js.Any], separatorStr.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], cutOnly.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @js.native
  trait DecimalClass extends StObject {
    
    def add(value: ValueType): DecimalClass = js.native
    
    def equals(target: DecimalClass): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isInvalidate(): Boolean = js.native
    
    def isNaN(): Boolean = js.native
    
    def lessEquals(target: DecimalClass): Boolean = js.native
    
    def negate(): DecimalClass = js.native
    
    def toNumber(): Double = js.native
    
    def toString(safe: Boolean): String = js.native
  }
  
  type ValueType = String | Double
}
