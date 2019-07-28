package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusEventInit extends UIEventInit {
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.undefined
}

object FocusEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    detail: Int | Double = null,
    relatedTarget: EventTarget = null,
    view: Window = null
  ): FocusEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[FocusEventInit]
  }
}

