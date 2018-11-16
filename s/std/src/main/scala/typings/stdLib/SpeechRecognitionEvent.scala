package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionEvent extends Event {
  val emma: Document | scala.Null = js.native
  val interpretation: js.Any = js.native
  val resultIndex: scala.Double = js.native
  val results: SpeechRecognitionResultList = js.native
}

@JSGlobal("SpeechRecognitionEvent")
@js.native
object SpeechRecognitionEvent
  extends ScalablyTyped.runtime.Instantiable0[SpeechRecognitionEvent]

