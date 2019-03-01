package typings
package raspiDashPwmLib.raspiDashPwmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var frequency: js.UndefOr[scala.Double] = js.undefined
  var pin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Config {
  @scala.inline
  def apply(frequency: scala.Int | scala.Double = null, pin: scala.Double | java.lang.String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (pin != null) __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

