package typings.rcComponentMiniDecimal

import typings.rcComponentMiniDecimal.esInterfaceMod.DecimalClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esBigIntDecimalMod {
  
  @JSImport("@rc-component/mini-decimal/es/BigIntDecimal", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BigIntDecimal {
    def this(value: String) = this()
    def this(value: Double) = this()
  }
  
  @js.native
  trait BigIntDecimal
    extends StObject
       with DecimalClass {
    
    /**
      * @private Align BigIntDecimal with same decimal length. e.g. 12.3 + 5 = 1230000
      * This is used for add function only.
      */
    def alignDecimal(decimalLength: Double): js.BigInt = js.native
    
    /* private */ var cal: Any = js.native
    
    var decimal: js.BigInt = js.native
    
    /** BigInt will convert `0009` to `9`. We need record the len of decimal */
    var decimalLen: Double = js.native
    
    var empty: Boolean = js.native
    
    /**
      * @private get decimal string
      */
    def getDecimalStr(): String = js.native
    
    /* private */ var getIntegerStr: Any = js.native
    
    /* private */ var getMark: Any = js.native
    
    var integer: js.BigInt = js.native
    
    var nan: Boolean = js.native
    
    var negative: Boolean = js.native
    
    var origin: String = js.native
  }
}
