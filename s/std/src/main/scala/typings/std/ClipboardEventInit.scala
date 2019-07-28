package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClipboardEventInit extends EventInit {
  var clipboardData: js.UndefOr[DataTransfer | Null] = js.undefined
}

object ClipboardEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    clipboardData: DataTransfer = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): ClipboardEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (clipboardData != null) __obj.updateDynamic("clipboardData")(clipboardData)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[ClipboardEventInit]
  }
}

