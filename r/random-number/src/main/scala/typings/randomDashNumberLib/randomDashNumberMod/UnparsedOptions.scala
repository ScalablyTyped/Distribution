package typings
package randomDashNumberLib.randomDashNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnparsedOptions extends js.Object {
  var integer: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object UnparsedOptions {
  @scala.inline
  def apply(
    integer: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null
  ): UnparsedOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(integer)) __obj.updateDynamic("integer")(integer)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnparsedOptions]
  }
}

