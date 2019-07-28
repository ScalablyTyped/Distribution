package typings.skatejs.typesMod

import typings.std.CustomEventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventOptions
  extends CustomEventInit[js.Any]

object EventOptions {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined,
    detail: js.Any = null
  ): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    __obj.asInstanceOf[EventOptions]
  }
}

