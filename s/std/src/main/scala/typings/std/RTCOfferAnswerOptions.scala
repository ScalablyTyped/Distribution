package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCOfferAnswerOptions extends StObject {
  
  var voiceActivityDetection: js.UndefOr[scala.Boolean] = js.native
}
object RTCOfferAnswerOptions {
  
  @scala.inline
  def apply(): RTCOfferAnswerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCOfferAnswerOptions]
  }
  
  @scala.inline
  implicit class RTCOfferAnswerOptionsMutableBuilder[Self <: RTCOfferAnswerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVoiceActivityDetection(value: scala.Boolean): Self = StObject.set(x, "voiceActivityDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceActivityDetectionUndefined: Self = StObject.set(x, "voiceActivityDetection", js.undefined)
  }
}
