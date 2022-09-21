package typings.rpio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object RPIO_ {
    
    /**
      * Return codes for I2C read and write operations.
      */
    @JSGlobal("RPIO.I2cStatusCode")
    @js.native
    object I2cStatusCode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.rpio.RPIO_.I2cStatusCode & Double] = js.native
      
      /* 0x02 */ val ERROR_CLKT: typings.rpio.RPIO_.I2cStatusCode.ERROR_CLKT & Double = js.native
      
      /* 0x04 */ val ERROR_DATA: typings.rpio.RPIO_.I2cStatusCode.ERROR_DATA & Double = js.native
      
      /* 0x01 */ val ERROR_NACK: typings.rpio.RPIO_.I2cStatusCode.ERROR_NACK & Double = js.native
      
      /* 0x00 */ val OK: typings.rpio.RPIO_.I2cStatusCode.OK & Double = js.native
    }
  }
  
  @JSGlobal("rpio")
  @js.native
  def rpio: Rpio = js.native
  inline def rpio_=(x: Rpio): Unit = js.Dynamic.global.updateDynamic("rpio")(x.asInstanceOf[js.Any])
}
