package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This Web Speech API interface represents a voice that the system supports. Every SpeechSynthesisVoice has its own relative speech service including information about language, name and URI. */
trait SpeechSynthesisVoice extends js.Object {
  val default: scala.Boolean
  val lang: java.lang.String
  val localService: scala.Boolean
  val name: java.lang.String
  val voiceURI: java.lang.String
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
}

