package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CSSRuleList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[CSSRule] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSRule]]
  val length: scala.Double
  def item(index: scala.Double): CSSRule | scala.Null
}

@JSGlobal("CSSRuleList")
@js.native
object CSSRuleList
  extends ScalablyTyped.runtime.Instantiable0[CSSRuleList]

