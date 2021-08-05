package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCOfferAnswerOptions extends StObject {
  
  var voiceActivityDetection: js.UndefOr[scala.Boolean] = js.undefined
}
object RTCOfferAnswerOptions {
  
  inline def apply(): RTCOfferAnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferAnswerOptions]
  }
  
  extension [Self <: RTCOfferAnswerOptions](x: Self) {
    
    inline def setVoiceActivityDetection(value: scala.Boolean): Self = StObject.set(x, "voiceActivityDetection", value.asInstanceOf[js.Any])
    
    inline def setVoiceActivityDetectionUndefined: Self = StObject.set(x, "voiceActivityDetection", js.undefined)
  }
}
