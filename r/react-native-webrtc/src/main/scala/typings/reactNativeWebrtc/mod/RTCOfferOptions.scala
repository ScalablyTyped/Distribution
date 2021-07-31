package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOfferOptions extends StObject {
  
  var iceRestart: js.UndefOr[Boolean] = js.undefined
  
  var offerToReceiveAudio: js.UndefOr[Boolean] = js.undefined
  
  var offerToReceiveVideo: js.UndefOr[Boolean] = js.undefined
  
  var voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
}
object RTCOfferOptions {
  
  @scala.inline
  def apply(): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferOptions]
  }
  
  @scala.inline
  implicit class RTCOfferOptionsMutableBuilder[Self <: RTCOfferOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIceRestart(value: Boolean): Self = StObject.set(x, "iceRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceRestartUndefined: Self = StObject.set(x, "iceRestart", js.undefined)
    
    @scala.inline
    def setOfferToReceiveAudio(value: Boolean): Self = StObject.set(x, "offerToReceiveAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferToReceiveAudioUndefined: Self = StObject.set(x, "offerToReceiveAudio", js.undefined)
    
    @scala.inline
    def setOfferToReceiveVideo(value: Boolean): Self = StObject.set(x, "offerToReceiveVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferToReceiveVideoUndefined: Self = StObject.set(x, "offerToReceiveVideo", js.undefined)
    
    @scala.inline
    def setVoiceActivityDetection(value: Boolean): Self = StObject.set(x, "voiceActivityDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceActivityDetectionUndefined: Self = StObject.set(x, "voiceActivityDetection", js.undefined)
  }
}
