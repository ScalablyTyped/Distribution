package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechSynthesisErrorEventInit extends SpeechSynthesisEventInit {
  
  var error: SpeechSynthesisErrorCode = js.native
}
object SpeechSynthesisErrorEventInit {
  
  @scala.inline
  def apply(error: SpeechSynthesisErrorCode, utterance: SpeechSynthesisUtterance): SpeechSynthesisErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], utterance = utterance.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisErrorEventInit]
  }
  
  @scala.inline
  implicit class SpeechSynthesisErrorEventInitMutableBuilder[Self <: SpeechSynthesisErrorEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: SpeechSynthesisErrorCode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
