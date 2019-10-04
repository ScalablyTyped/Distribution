package typings.atStardustDashUiReactDashComponentDashEventDashListener

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capture extends js.Object {
  var capture: js.UndefOr[scala.Nothing] = js.undefined
  var listener: js.UndefOr[scala.Nothing] = js.undefined
  var targetRef: js.UndefOr[scala.Nothing] = js.undefined
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_Capture {
  @scala.inline
  def apply(
    capture: js.UndefOr[scala.Nothing] = js.undefined,
    listener: js.UndefOr[scala.Nothing] = js.undefined,
    targetRef: js.UndefOr[scala.Nothing] = js.undefined,
    `type`: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Capture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (!js.isUndefined(listener)) __obj.updateDynamic("listener")(listener)
    if (!js.isUndefined(targetRef)) __obj.updateDynamic("targetRef")(targetRef)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Capture]
  }
}

