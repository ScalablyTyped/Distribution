package typings.raspiDashPeripheral.raspiDashPeripheralMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raspi-peripheral", "Peripheral")
@js.native
class Peripheral protected () extends EventEmitter {
  def this(pins: String) = this()
  def this(pins: js.Array[String | Double]) = this()
  def this(pins: Double) = this()
  var _alive: js.Any = js.native
  var _pins: js.Any = js.native
  val alive: Boolean = js.native
  val pins: js.Array[Double] = js.native
  def destroy(): Unit = js.native
  def validateAlive(): Unit = js.native
}

