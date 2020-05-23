package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCOfferAnswerOptions extends js.Object {
  var voiceActivityDetection: js.UndefOr[scala.Boolean] = js.undefined
}

object RTCOfferAnswerOptions {
  @scala.inline
  def apply(voiceActivityDetection: js.UndefOr[scala.Boolean] = js.undefined): RTCOfferAnswerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(voiceActivityDetection)) __obj.updateDynamic("voiceActivityDetection")(voiceActivityDetection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOfferAnswerOptions]
  }
}

