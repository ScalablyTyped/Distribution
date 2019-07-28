package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEventInit[T] extends EventInit {
  var detail: js.UndefOr[T] = js.undefined
}

object CustomEventInit {
  @scala.inline
  def apply[T](
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    detail: T = null
  ): CustomEventInit[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEventInit[T]]
  }
}

