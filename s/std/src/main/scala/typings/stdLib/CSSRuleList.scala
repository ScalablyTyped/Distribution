package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects. */
@js.native
trait CSSRuleList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[CSSRule] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSRule]] = js.native
  val length: scala.Double = js.native
  def item(index: scala.Double): CSSRule | scala.Null = js.native
}

@JSGlobal("CSSRuleList")
@js.native
class CSSRuleListCls () extends CSSRuleList

@JSGlobal("CSSRuleList")
@js.native
object CSSRuleList
  extends org.scalablytyped.runtime.Instantiable0[CSSRuleList]

