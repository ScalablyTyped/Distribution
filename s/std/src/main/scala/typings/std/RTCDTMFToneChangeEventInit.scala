package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDTMFToneChangeEventInit extends EventInit {
  var tone: java.lang.String
}

object RTCDTMFToneChangeEventInit {
  @scala.inline
  def apply(
    tone: java.lang.String,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCDTMFToneChangeEventInit = {
    val __obj = js.Dynamic.literal(tone = tone)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[RTCDTMFToneChangeEventInit]
  }
}

