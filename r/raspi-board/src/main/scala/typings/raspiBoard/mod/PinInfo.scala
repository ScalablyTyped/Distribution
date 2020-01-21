package typings.raspiBoard.mod

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
    val __obj = js.Dynamic.literal(gpio = gpio.asInstanceOf[js.Any], peripherals = peripherals.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PinInfo]
  }
}

