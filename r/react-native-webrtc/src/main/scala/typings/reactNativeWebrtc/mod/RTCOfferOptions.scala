package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCOfferOptions extends js.Object {
  
  var iceRestart: js.UndefOr[Boolean] = js.native
  
  var offerToReceiveAudio: js.UndefOr[Boolean] = js.native
  
  var offerToReceiveVideo: js.UndefOr[Boolean] = js.native
  
  var voiceActivityDetection: js.UndefOr[Boolean] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIceRestart(value: Boolean): Self = this.set("iceRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceRestart: Self = this.set("iceRestart", js.undefined)
    
    @scala.inline
    def setOfferToReceiveAudio(value: Boolean): Self = this.set("offerToReceiveAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferToReceiveAudio: Self = this.set("offerToReceiveAudio", js.undefined)
    
    @scala.inline
    def setOfferToReceiveVideo(value: Boolean): Self = this.set("offerToReceiveVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferToReceiveVideo: Self = this.set("offerToReceiveVideo", js.undefined)
    
    @scala.inline
    def setVoiceActivityDetection(value: Boolean): Self = this.set("voiceActivityDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceActivityDetection: Self = this.set("voiceActivityDetection", js.undefined)
  }
}
