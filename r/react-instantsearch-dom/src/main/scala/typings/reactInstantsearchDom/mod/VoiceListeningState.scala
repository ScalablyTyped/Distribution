package typings.reactInstantsearchDom.mod

import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`audio-capture`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`bad-grammar`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`language-not-supported`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`no-speech`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`not-allowed`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`service-not-allowed`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.aborted
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.network
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceListeningState extends StObject {
  
  var errorCode: js.UndefOr[
    `no-speech` | aborted | `audio-capture` | network | `not-allowed` | `service-not-allowed` | `bad-grammar` | `language-not-supported`
  ] = js.undefined
  
  var isSpeechFinal: Boolean
  
  var status: Status
  
  var transcript: String
}
object VoiceListeningState {
  
  inline def apply(isSpeechFinal: Boolean, status: Status, transcript: String): VoiceListeningState = {
    val __obj = js.Dynamic.literal(isSpeechFinal = isSpeechFinal.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceListeningState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceListeningState] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(
      value: `no-speech` | aborted | `audio-capture` | network | `not-allowed` | `service-not-allowed` | `bad-grammar` | `language-not-supported`
    ): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setIsSpeechFinal(value: Boolean): Self = StObject.set(x, "isSpeechFinal", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
  }
}
