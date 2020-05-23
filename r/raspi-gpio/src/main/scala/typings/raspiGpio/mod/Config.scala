package typings.raspiGpio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var pin: Double | String
  var pullResistor: js.UndefOr[Double] = js.undefined
}

object Config {
  @scala.inline
  def apply(pin: Double | String, pullResistor: js.UndefOr[Double] = js.undefined): Config = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (!js.isUndefined(pullResistor)) __obj.updateDynamic("pullResistor")(pullResistor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

