package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechGrammarList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[SpeechGrammar] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[SpeechGrammar]] = js.native
  val length: scala.Double = js.native
  def addFromString(string: java.lang.String): scala.Unit = js.native
  def addFromString(string: java.lang.String, weight: scala.Double): scala.Unit = js.native
  def addFromURI(src: java.lang.String): scala.Unit = js.native
  def addFromURI(src: java.lang.String, weight: scala.Double): scala.Unit = js.native
  def item(index: scala.Double): SpeechGrammar = js.native
}

@JSGlobal("SpeechGrammarList")
@js.native
object SpeechGrammarList
  extends org.scalablytyped.runtime.Instantiable0[SpeechGrammarList]

