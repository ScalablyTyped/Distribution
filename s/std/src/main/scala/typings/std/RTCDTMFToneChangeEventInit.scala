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
    val __obj = js.Dynamic.literal(tone = tone.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDTMFToneChangeEventInit]
  }
}

