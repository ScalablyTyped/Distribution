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
  
  inline def apply(): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCOfferOptions] (val x: Self) extends AnyVal {
    
    inline def setIceRestart(value: Boolean): Self = StObject.set(x, "iceRestart", value.asInstanceOf[js.Any])
    
    inline def setIceRestartUndefined: Self = StObject.set(x, "iceRestart", js.undefined)
    
    inline def setOfferToReceiveAudio(value: Boolean): Self = StObject.set(x, "offerToReceiveAudio", value.asInstanceOf[js.Any])
    
    inline def setOfferToReceiveAudioUndefined: Self = StObject.set(x, "offerToReceiveAudio", js.undefined)
    
    inline def setOfferToReceiveVideo(value: Boolean): Self = StObject.set(x, "offerToReceiveVideo", value.asInstanceOf[js.Any])
    
    inline def setOfferToReceiveVideoUndefined: Self = StObject.set(x, "offerToReceiveVideo", js.undefined)
    
    inline def setVoiceActivityDetection(value: Boolean): Self = StObject.set(x, "voiceActivityDetection", value.asInstanceOf[js.Any])
    
    inline def setVoiceActivityDetectionUndefined: Self = StObject.set(x, "voiceActivityDetection", js.undefined)
  }
}
