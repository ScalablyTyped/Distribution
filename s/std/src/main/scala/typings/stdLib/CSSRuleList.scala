package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSRuleList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[CSSRule] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSRule]]
  val length: scala.Double
  def item(index: scala.Double): CSSRule | scala.Null
}

@JSGlobal("CSSRuleList")
@js.native
class CSSRuleListCls () extends CSSRuleList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[CSSRule]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def item(index: scala.Double): CSSRule | scala.Null = js.native
}

@JSGlobal("CSSRuleList")
@js.native
object CSSRuleList
  extends org.scalablytyped.runtime.Instantiable0[CSSRuleList]

