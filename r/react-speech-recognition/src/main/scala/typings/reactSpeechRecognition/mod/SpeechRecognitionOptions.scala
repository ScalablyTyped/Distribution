package typings.reactSpeechRecognition.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionOptions extends js.Object {
  
  var clearTranscriptOnListen: js.UndefOr[Boolean] = js.native
  
  var commands: js.UndefOr[js.Array[Command]] = js.native
  
  var transcribing: js.UndefOr[Boolean] = js.native
}
object SpeechRecognitionOptions {
  
  @scala.inline
  def apply(): SpeechRecognitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeechRecognitionOptions]
  }
  
  @scala.inline
  implicit class SpeechRecognitionOptionsOps[Self <: SpeechRecognitionOptions] (val x: Self) extends AnyVal {
    
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
    def setClearTranscriptOnListen(value: Boolean): Self = this.set("clearTranscriptOnListen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearTranscriptOnListen: Self = this.set("clearTranscriptOnListen", js.undefined)
    
    @scala.inline
    def setCommandsVarargs(value: Command*): Self = this.set("commands", js.Array(value :_*))
    
    @scala.inline
    def setCommands(value: js.Array[Command]): Self = this.set("commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    
    @scala.inline
    def setTranscribing(value: Boolean): Self = this.set("transcribing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranscribing: Self = this.set("transcribing", js.undefined)
  }
}
