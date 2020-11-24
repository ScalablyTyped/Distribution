package typings.reactSpeechRecognition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalTranscript extends js.Object {
  
  var finalTranscript: String = js.native
  
  var interimTranscript: String = js.native
  
  var listening: Boolean = js.native
  
  def resetTranscript(): Unit = js.native
  
  var transcript: String = js.native
}
object FinalTranscript {
  
  @scala.inline
  def apply(
    finalTranscript: String,
    interimTranscript: String,
    listening: Boolean,
    resetTranscript: () => Unit,
    transcript: String
  ): FinalTranscript = {
    val __obj = js.Dynamic.literal(finalTranscript = finalTranscript.asInstanceOf[js.Any], interimTranscript = interimTranscript.asInstanceOf[js.Any], listening = listening.asInstanceOf[js.Any], resetTranscript = js.Any.fromFunction0(resetTranscript), transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalTranscript]
  }
  
  @scala.inline
  implicit class FinalTranscriptOps[Self <: FinalTranscript] (val x: Self) extends AnyVal {
    
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
    def setFinalTranscript(value: String): Self = this.set("finalTranscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterimTranscript(value: String): Self = this.set("interimTranscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListening(value: Boolean): Self = this.set("listening", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetTranscript(value: () => Unit): Self = this.set("resetTranscript", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTranscript(value: String): Self = this.set("transcript", value.asInstanceOf[js.Any])
  }
}
