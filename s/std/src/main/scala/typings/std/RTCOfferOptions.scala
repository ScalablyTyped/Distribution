package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOfferOptions
  extends StObject
     with RTCOfferAnswerOptions {
  
  var iceRestart: js.UndefOr[scala.Boolean] = js.undefined
  
  var offerToReceiveAudio: js.UndefOr[scala.Boolean] = js.undefined
  
  var offerToReceiveVideo: js.UndefOr[scala.Boolean] = js.undefined
}
object RTCOfferOptions {
  
  inline def apply(): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferOptions]
  }
  
  extension [Self <: RTCOfferOptions](x: Self) {
    
    inline def setIceRestart(value: scala.Boolean): Self = StObject.set(x, "iceRestart", value.asInstanceOf[js.Any])
    
    inline def setIceRestartUndefined: Self = StObject.set(x, "iceRestart", js.undefined)
    
    inline def setOfferToReceiveAudio(value: scala.Boolean): Self = StObject.set(x, "offerToReceiveAudio", value.asInstanceOf[js.Any])
    
    inline def setOfferToReceiveAudioUndefined: Self = StObject.set(x, "offerToReceiveAudio", js.undefined)
    
    inline def setOfferToReceiveVideo(value: scala.Boolean): Self = StObject.set(x, "offerToReceiveVideo", value.asInstanceOf[js.Any])
    
    inline def setOfferToReceiveVideoUndefined: Self = StObject.set(x, "offerToReceiveVideo", js.undefined)
  }
}
