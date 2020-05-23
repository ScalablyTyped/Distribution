package typings.raspiPwm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var frequency: js.UndefOr[Double] = js.undefined
  var pin: js.UndefOr[Double | String] = js.undefined
}

object Config {
  @scala.inline
  def apply(frequency: js.UndefOr[Double] = js.undefined, pin: Double | String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (pin != null) __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

