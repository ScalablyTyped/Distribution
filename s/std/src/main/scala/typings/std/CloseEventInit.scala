package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventInit extends EventInit {
  var code: js.UndefOr[Double] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var wasClean: js.UndefOr[scala.Boolean] = js.undefined
}

object CloseEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    code: js.UndefOr[Double] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    reason: java.lang.String = null,
    wasClean: js.UndefOr[scala.Boolean] = js.undefined
  ): CloseEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (!js.isUndefined(wasClean)) __obj.updateDynamic("wasClean")(wasClean.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseEventInit]
  }
}

