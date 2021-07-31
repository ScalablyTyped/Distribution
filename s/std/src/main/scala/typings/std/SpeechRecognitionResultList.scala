package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionResultList
  extends StObject
     with /* index */ NumberDictionary[SpeechRecognitionResult] {
  
  def item(index: Double): SpeechRecognitionResult = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionResult]] = js.native
  
  val length: Double = js.native
}
