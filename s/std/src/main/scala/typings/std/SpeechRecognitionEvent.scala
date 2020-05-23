package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionEvent extends Event {
  val resultIndex: Double = js.native
  val results: SpeechRecognitionResultList = js.native
}

