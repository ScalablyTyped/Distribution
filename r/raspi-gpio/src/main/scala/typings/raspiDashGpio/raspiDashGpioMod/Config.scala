package typings.raspiDashGpio.raspiDashGpioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var pin: Double | String
  var pullResistor: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(pin: Double | String, pullResistor: Int | Double = null): Config = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (pullResistor != null) __obj.updateDynamic("pullResistor")(pullResistor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

