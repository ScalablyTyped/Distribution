package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionResultList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[SpeechRecognitionResult] {
  
  /* standard dom */
  def item(index: Double): SpeechRecognitionResult = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionResult]] = js.native
  
  /* standard dom */
  val length: Double = js.native
}
