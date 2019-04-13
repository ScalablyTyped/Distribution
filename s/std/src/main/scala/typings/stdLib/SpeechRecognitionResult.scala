package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionResult
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SpeechRecognitionAlternative] {
  val isFinal: scala.Boolean = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionAlternative]] = js.native
  val length: scala.Double = js.native
  def item(index: scala.Double): SpeechRecognitionAlternative = js.native
}

@JSGlobal("SpeechRecognitionResult")
@js.native
class SpeechRecognitionResultCls () extends SpeechRecognitionResult

@JSGlobal("SpeechRecognitionResult")
@js.native
object SpeechRecognitionResult
  extends org.scalablytyped.runtime.Instantiable0[SpeechRecognitionResult]

