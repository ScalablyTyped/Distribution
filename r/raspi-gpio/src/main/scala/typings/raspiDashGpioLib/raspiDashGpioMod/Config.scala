package typings
package raspiDashGpioLib.raspiDashGpioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var pin: scala.Double | java.lang.String
  var pullResistor: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(pin: scala.Double | java.lang.String, pullResistor: scala.Int | scala.Double = null): Config = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (pullResistor != null) __obj.updateDynamic("pullResistor")(pullResistor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

