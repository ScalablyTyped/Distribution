package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechRecognitionResult extends /* index */ NumberDictionary[SpeechRecognitionAlternative] {
  val isFinal: scala.Boolean = js.native
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionAlternative]] = js.native
  val length: Double = js.native
  def item(index: Double): SpeechRecognitionAlternative = js.native
}

