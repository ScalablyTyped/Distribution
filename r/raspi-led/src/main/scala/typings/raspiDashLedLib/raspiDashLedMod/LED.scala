package typings
package raspiDashLedLib.raspiDashLedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-led", "LED")
@js.native
class LED ()
  extends raspiDashPeripheralLib.raspiDashPeripheralMod.Peripheral {
  def hasLed(): scala.Boolean = js.native
  def read(): raspiDashLedLib.raspiDashLedLibNumbers.`0` | raspiDashLedLib.raspiDashLedLibNumbers.`1` = js.native
  @JSName("write")
  def write_0(value: raspiDashLedLib.raspiDashLedLibNumbers.`0`): scala.Unit = js.native
  @JSName("write")
  def write_1(value: raspiDashLedLib.raspiDashLedLibNumbers.`1`): scala.Unit = js.native
}

