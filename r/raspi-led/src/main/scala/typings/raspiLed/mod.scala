package typings.raspiLed

import typings.raspiLed.raspiLedNumbers.`0`
import typings.raspiLed.raspiLedNumbers.`1`
import typings.raspiPeripheral.mod.Peripheral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("raspi-led", "LED")
  @js.native
  class LED () extends Peripheral {
    
    def hasLed(): Boolean = js.native
    
    def read(): `0` | `1` = js.native
    
    @JSName("write")
    def write_0(value: `0`): Unit = js.native
    @JSName("write")
    def write_1(value: `1`): Unit = js.native
  }
  
  @JSImport("raspi-led", "OFF")
  @js.native
  val OFF: /* 0 */ Double = js.native
  
  @JSImport("raspi-led", "ON")
  @js.native
  val ON: /* 1 */ Double = js.native
}
