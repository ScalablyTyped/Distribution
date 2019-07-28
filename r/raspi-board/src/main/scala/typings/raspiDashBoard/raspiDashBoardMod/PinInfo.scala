package typings.raspiDashBoard.raspiDashBoardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PinInfo extends js.Object {
  var gpio: Double
  var peripherals: js.Array[String]
  var pins: js.Array[String]
}

object PinInfo {
  @scala.inline
  def apply(gpio: Double, peripherals: js.Array[String], pins: js.Array[String]): PinInfo = {
    val __obj = js.Dynamic.literal(gpio = gpio, peripherals = peripherals, pins = pins)
  
    __obj.asInstanceOf[PinInfo]
  }
}

