package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionResultList extends /* index */ NumberDictionary[SpeechRecognitionResult] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionResult]] = js.native
  val length: Double = js.native
  def item(index: Double): SpeechRecognitionResult = js.native
}

@JSGlobal("SpeechRecognitionResultList")
@js.native
class SpeechRecognitionResultListCls () extends SpeechRecognitionResultList

@JSGlobal("SpeechRecognitionResultList")
@js.native
object SpeechRecognitionResultList extends Instantiable0[SpeechRecognitionResultList]

