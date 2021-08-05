package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCAnswerOptions extends StObject {
  
  var voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
}
object RTCAnswerOptions {
  
  inline def apply(): RTCAnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCAnswerOptions]
  }
  
  extension [Self <: RTCAnswerOptions](x: Self) {
    
    inline def setVoiceActivityDetection(value: Boolean): Self = StObject.set(x, "voiceActivityDetection", value.asInstanceOf[js.Any])
    
    inline def setVoiceActivityDetectionUndefined: Self = StObject.set(x, "voiceActivityDetection", js.undefined)
  }
}
