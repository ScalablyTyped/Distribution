package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechRecognitionResult
  extends StObject
     with /* index */ NumberDictionary[SpeechRecognitionAlternative] {
  
  val isFinal: scala.Boolean = js.native
  
  def item(index: Double): SpeechRecognitionAlternative = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechRecognitionAlternative]] = js.native
  
  val length: Double = js.native
}
