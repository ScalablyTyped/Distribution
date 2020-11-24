package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpeechGrammarList extends /* index */ NumberDictionary[SpeechGrammar] {
  
  def addFromString(string: java.lang.String): Unit = js.native
  def addFromString(string: java.lang.String, weight: Double): Unit = js.native
  
  def addFromURI(src: java.lang.String): Unit = js.native
  def addFromURI(src: java.lang.String, weight: Double): Unit = js.native
  
  def item(index: Double): SpeechGrammar = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechGrammar]] = js.native
  
  val length: Double = js.native
}
