package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionAlternative extends js.Object {
  val confidence: Double
  val transcript: java.lang.String
}

object SpeechRecognitionAlternative {
  @scala.inline
  def apply(confidence: Double, transcript: java.lang.String): SpeechRecognitionAlternative = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], transcript = transcript.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpeechRecognitionAlternative]
  }
}

