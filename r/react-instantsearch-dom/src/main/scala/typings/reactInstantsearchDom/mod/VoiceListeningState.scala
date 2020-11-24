package typings.reactInstantsearchDom.mod

import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`audio-capture`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`bad-grammar`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`language-not-supported`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`no-speech`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`not-allowed`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.`service-not-allowed`
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.aborted
import typings.reactInstantsearchDom.reactInstantsearchDomStrings.network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoiceListeningState extends js.Object {
  
  var errorCode: js.UndefOr[
    `no-speech` | aborted | `audio-capture` | network | `not-allowed` | `service-not-allowed` | `bad-grammar` | `language-not-supported`
  ] = js.native
  
  var isSpeechFinal: Boolean = js.native
  
  var status: Status = js.native
  
  var transcript: String = js.native
}
object VoiceListeningState {
  
  @scala.inline
  def apply(isSpeechFinal: Boolean, status: Status, transcript: String): VoiceListeningState = {
    val __obj = js.Dynamic.literal(isSpeechFinal = isSpeechFinal.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceListeningState]
  }
  
  @scala.inline
  implicit class VoiceListeningStateOps[Self <: VoiceListeningState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsSpeechFinal(value: Boolean): Self = this.set("isSpeechFinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranscript(value: String): Self = this.set("transcript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(
      value: `no-speech` | aborted | `audio-capture` | network | `not-allowed` | `service-not-allowed` | `bad-grammar` | `language-not-supported`
    ): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
  }
}
