package typings
package raspiDashSoftDashPwmLib.raspiDashSoftDashPwmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var frequency: js.UndefOr[scala.Double] = js.undefined
  var pin: scala.Double | java.lang.String
  var range: js.UndefOr[scala.Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    pin: scala.Double | java.lang.String,
    frequency: scala.Int | scala.Double = null,
    range: scala.Int | scala.Double = null
  ): Config = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

