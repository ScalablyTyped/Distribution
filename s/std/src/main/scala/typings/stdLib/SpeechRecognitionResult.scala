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
object SpeechRecognitionResult
  extends org.scalablytyped.runtime.Instantiable0[SpeechRecognitionResult]

