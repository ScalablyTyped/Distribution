package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class RTCOfferOptionsMutableBuilder[Self <: RTCOfferOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIceRestart(value: scala.Boolean): Self = StObject.set(x, "iceRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceRestartUndefined: Self = StObject.set(x, "iceRestart", js.undefined)
    
    @scala.inline
    def setOfferToReceiveAudio(value: scala.Boolean): Self = StObject.set(x, "offerToReceiveAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferToReceiveAudioUndefined: Self = StObject.set(x, "offerToReceiveAudio", js.undefined)
    
    @scala.inline
    def setOfferToReceiveVideo(value: scala.Boolean): Self = StObject.set(x, "offerToReceiveVideo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferToReceiveVideoUndefined: Self = StObject.set(x, "offerToReceiveVideo", js.undefined)
  }
}
