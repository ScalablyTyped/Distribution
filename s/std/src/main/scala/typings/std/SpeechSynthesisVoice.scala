package typings.std

import org.scalablytyped.runtime.Instantiable0
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

@JSGlobal("SpeechSynthesisVoice")
@js.native
object SpeechSynthesisVoice extends Instantiable0[SpeechSynthesisVoice]

