package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCAnswerOptions extends StObject {
  
  var voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
}
object RTCAnswerOptions {
  
  @scala.inline
  def apply(): RTCAnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCAnswerOptions]
  }
  
  @scala.inline
  implicit class RTCAnswerOptionsMutableBuilder[Self <: RTCAnswerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceActivityDetection(value: Boolean): Self = StObject.set(x, "voiceActivityDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceActivityDetectionUndefined: Self = StObject.set(x, "voiceActivityDetection", js.undefined)
  }
}
