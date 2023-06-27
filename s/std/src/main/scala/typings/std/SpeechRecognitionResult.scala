package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult) */
@js.native
trait SpeechRecognitionResult
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[SpeechRecognitionAlternative] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/isFinal) */
  /* standard dom */
  val isFinal: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/item) */
  /* standard dom */
  def item(index: Double): SpeechRecognitionAlternative = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionAlternative]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SpeechRecognitionResult/length) */
  /* standard dom */
  val length: Double = js.native
}
