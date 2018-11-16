package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SpeechRecognitionResult
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[SpeechRecognitionAlternative] {
  val isFinal: scala.Boolean
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionAlternative]]
  val length: scala.Double
  def item(index: scala.Double): SpeechRecognitionAlternative
}

@JSGlobal("SpeechRecognitionResult")
@js.native
object SpeechRecognitionResult
  extends ScalablyTyped.runtime.Instantiable0[SpeechRecognitionResult]

