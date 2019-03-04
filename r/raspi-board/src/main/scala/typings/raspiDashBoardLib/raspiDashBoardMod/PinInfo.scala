package typings
package raspiDashBoardLib.raspiDashBoardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinInfo extends js.Object {
  var gpio: scala.Double
  var peripherals: js.Array[java.lang.String]
  var pins: js.Array[java.lang.String]
}

object PinInfo {
  @scala.inline
  def apply(gpio: scala.Double, peripherals: js.Array[java.lang.String], pins: js.Array[java.lang.String]): PinInfo = {
    val __obj = js.Dynamic.literal(gpio = gpio, peripherals = peripherals, pins = pins)
  
    __obj.asInstanceOf[PinInfo]
  }
}

