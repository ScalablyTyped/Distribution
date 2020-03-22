package typings.stardustUiReactComponentEventListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListener extends js.Object {
  var capture: js.UndefOr[scala.Nothing] = js.undefined
  var listener: js.UndefOr[scala.Nothing] = js.undefined
  var targetRef: js.UndefOr[scala.Nothing] = js.undefined
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonListener {
  @scala.inline
  def apply(
    capture: js.UndefOr[scala.Nothing] = js.undefined,
    listener: js.UndefOr[scala.Nothing] = js.undefined,
    targetRef: js.UndefOr[scala.Nothing] = js.undefined,
    `type`: js.UndefOr[scala.Nothing] = js.undefined
  ): AnonListener = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (!js.isUndefined(listener)) __obj.updateDynamic("listener")(listener.asInstanceOf[js.Any])
    if (!js.isUndefined(targetRef)) __obj.updateDynamic("targetRef")(targetRef.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListener]
  }
}

