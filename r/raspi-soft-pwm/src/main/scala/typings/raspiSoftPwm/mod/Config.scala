package typings.raspiSoftPwm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var frequency: js.UndefOr[Double] = js.undefined
  var pin: Double | String
  var range: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(pin: Double | String, frequency: Int | Double = null, range: Int | Double = null): Config = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

