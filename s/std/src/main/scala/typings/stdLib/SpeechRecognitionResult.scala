package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeechRecognitionResult
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SpeechRecognitionAlternative] {
  val isFinal: scala.Boolean
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionAlternative]]
  val length: scala.Double
  def item(index: scala.Double): SpeechRecognitionAlternative
}

@JSGlobal("SpeechRecognitionResult")
@js.native
class SpeechRecognitionResultCls () extends SpeechRecognitionResult {
  /* CompleteClass */
  override val isFinal: scala.Boolean = js.native
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[SpeechRecognitionAlternative]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def item(index: scala.Double): SpeechRecognitionAlternative = js.native
}

@JSGlobal("SpeechRecognitionResult")
@js.native
object SpeechRecognitionResult
  extends org.scalablytyped.runtime.Instantiable0[SpeechRecognitionResult]

