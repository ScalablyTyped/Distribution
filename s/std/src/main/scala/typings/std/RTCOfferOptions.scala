package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCOfferOptions extends RTCOfferAnswerOptions {
  var iceRestart: js.UndefOr[scala.Boolean] = js.native
  var offerToReceiveAudio: js.UndefOr[scala.Boolean] = js.native
  var offerToReceiveVideo: js.UndefOr[scala.Boolean] = js.native
}

object RTCOfferOptions {
  @scala.inline
  def apply(): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferOptions]
  }
  @scala.inline
  implicit class RTCOfferOptionsOps[Self <: RTCOfferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIceRestart(value: scala.Boolean): Self = this.set("iceRestart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIceRestart: Self = this.set("iceRestart", js.undefined)
    @scala.inline
    def setOfferToReceiveAudio(value: scala.Boolean): Self = this.set("offerToReceiveAudio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferToReceiveAudio: Self = this.set("offerToReceiveAudio", js.undefined)
    @scala.inline
    def setOfferToReceiveVideo(value: scala.Boolean): Self = this.set("offerToReceiveVideo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferToReceiveVideo: Self = this.set("offerToReceiveVideo", js.undefined)
  }
  
}

