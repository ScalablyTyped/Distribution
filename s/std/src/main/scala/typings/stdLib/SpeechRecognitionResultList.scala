package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionResultList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SpeechRecognitionResult] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionResult]] = js.native
  val length: scala.Double = js.native
  def item(index: scala.Double): SpeechRecognitionResult = js.native
}

@JSGlobal("SpeechRecognitionResultList")
@js.native
class SpeechRecognitionResultListCls () extends SpeechRecognitionResultList

@JSGlobal("SpeechRecognitionResultList")
@js.native
object SpeechRecognitionResultList
  extends org.scalablytyped.runtime.Instantiable0[SpeechRecognitionResultList]

