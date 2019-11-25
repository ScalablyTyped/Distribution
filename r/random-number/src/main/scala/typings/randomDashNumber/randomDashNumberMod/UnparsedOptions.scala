package typings.randomDashNumber.randomDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnparsedOptions extends js.Object {
  var integer: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object UnparsedOptions {
  @scala.inline
  def apply(integer: js.UndefOr[Boolean] = js.undefined, max: Int | Double = null, min: Int | Double = null): UnparsedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(integer)) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnparsedOptions]
  }
}

