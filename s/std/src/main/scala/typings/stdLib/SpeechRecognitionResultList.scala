package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionResultList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SpeechRecognitionResult] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionResult]]
  val length: scala.Double
  def item(index: scala.Double): SpeechRecognitionResult
}

@JSGlobal("SpeechRecognitionResultList")
@js.native
class SpeechRecognitionResultListCls () extends SpeechRecognitionResultList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[SpeechRecognitionResult]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def item(index: scala.Double): SpeechRecognitionResult = js.native
}

@JSGlobal("SpeechRecognitionResultList")
@js.native
object SpeechRecognitionResultList
  extends org.scalablytyped.runtime.Instantiable0[SpeechRecognitionResultList]

