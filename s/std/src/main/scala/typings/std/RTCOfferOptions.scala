package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOfferOptions
  extends StObject
     with RTCOfferAnswerOptions {
  
  /* standard dom */
  var iceRestart: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var offerToReceiveAudio: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var offerToReceiveVideo: js.UndefOr[scala.Boolean] = js.undefined
}
object RTCOfferOptions {
  
  inline def apply(): RTCOfferOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCOfferOptions] (val x: Self) extends AnyVal {
    
    inline def setIceRestart(value: scala.Boolean): Self = StObject.set(x, "iceRestart", value.asInstanceOf[js.Any])
    
    inline def setIceRestartUndefined: Self = StObject.set(x, "iceRestart", js.undefined)
    
    inline def setOfferToReceiveAudio(value: scala.Boolean): Self = StObject.set(x, "offerToReceiveAudio", value.asInstanceOf[js.Any])
    
    inline def setOfferToReceiveAudioUndefined: Self = StObject.set(x, "offerToReceiveAudio", js.undefined)
    
    inline def setOfferToReceiveVideo(value: scala.Boolean): Self = StObject.set(x, "offerToReceiveVideo", value.asInstanceOf[js.Any])
    
    inline def setOfferToReceiveVideoUndefined: Self = StObject.set(x, "offerToReceiveVideo", js.undefined)
  }
}
