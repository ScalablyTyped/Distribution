package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionError extends Event {
  val error: SpeechRecognitionErrorCode = js.native
  val message: java.lang.String = js.native
}

@JSGlobal("SpeechRecognitionError")
@js.native
object SpeechRecognitionError
  extends ScalablyTyped.runtime.Instantiable0[SpeechRecognitionError]

