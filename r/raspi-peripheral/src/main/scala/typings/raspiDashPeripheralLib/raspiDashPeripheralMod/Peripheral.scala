package typings
package raspiDashPeripheralLib.raspiDashPeripheralMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-peripheral", "Peripheral")
@js.native
class Peripheral protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(pins: java.lang.String) = this()
  def this(pins: js.Array[java.lang.String | scala.Double]) = this()
  def this(pins: scala.Double) = this()
  var _alive: js.Any = js.native
  var _pins: js.Any = js.native
  val alive: scala.Boolean = js.native
  val pins: js.Array[scala.Double] = js.native
  def destroy(): scala.Unit = js.native
  def validateAlive(): scala.Unit = js.native
}

