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
class SpeechSynthesisVoiceCls () extends SpeechSynthesisVoice {
  /* CompleteClass */
  override val default: scala.Boolean = js.native
  /* CompleteClass */
  override val lang: java.lang.String = js.native
  /* CompleteClass */
  override val localService: scala.Boolean = js.native
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /* CompleteClass */
  override val voiceURI: java.lang.String = js.native
}

@JSGlobal("SpeechSynthesisVoice")
@js.native
object SpeechSynthesisVoice extends Instantiable0[SpeechSynthesisVoice]

