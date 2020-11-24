package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Web Speech API interface represents a voice that the system supports. Every SpeechSynthesisVoice has its own relative speech service including information about language, name and URI. */
@js.native
trait SpeechSynthesisVoice extends js.Object {
  
  val default: scala.Boolean = js.native
  
  val lang: java.lang.String = js.native
  
  val localService: scala.Boolean = js.native
  
  val name: java.lang.String = js.native
  
  val voiceURI: java.lang.String = js.native
}
object SpeechSynthesisVoice {
  
  @scala.inline
  def apply(
    default: scala.Boolean,
    lang: java.lang.String,
    localService: scala.Boolean,
    name: java.lang.String,
    voiceURI: java.lang.String
  ): SpeechSynthesisVoice = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], localService = localService.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], voiceURI = voiceURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechSynthesisVoice]
  }
  
  @scala.inline
  implicit class SpeechSynthesisVoiceOps[Self <: SpeechSynthesisVoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefault(value: scala.Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: java.lang.String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalService(value: scala.Boolean): Self = this.set("localService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceURI(value: java.lang.String): Self = this.set("voiceURI", value.asInstanceOf[js.Any])
  }
}
