package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCOfferOptions extends RTCOfferAnswerOptions {
  var iceRestart: js.UndefOr[scala.Boolean] = js.undefined
  var offerToReceiveAudio: js.UndefOr[scala.Boolean] = js.undefined
  var offerToReceiveVideo: js.UndefOr[scala.Boolean] = js.undefined
}

object RTCOfferOptions {
  @scala.inline
  def apply(
    iceRestart: js.UndefOr[scala.Boolean] = js.undefined,
    offerToReceiveAudio: js.UndefOr[scala.Boolean] = js.undefined,
    offerToReceiveVideo: js.UndefOr[scala.Boolean] = js.undefined,
    voiceActivityDetection: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(iceRestart)) __obj.updateDynamic("iceRestart")(iceRestart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offerToReceiveAudio)) __obj.updateDynamic("offerToReceiveAudio")(offerToReceiveAudio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offerToReceiveVideo)) __obj.updateDynamic("offerToReceiveVideo")(offerToReceiveVideo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(voiceActivityDetection)) __obj.updateDynamic("voiceActivityDetection")(voiceActivityDetection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOfferOptions]
  }
}

