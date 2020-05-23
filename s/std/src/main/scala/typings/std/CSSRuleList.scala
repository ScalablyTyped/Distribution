package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects. */
@js.native
trait CSSRuleList extends /* index */ NumberDictionary[CSSRule] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSRule]] = js.native
  val length: Double = js.native
  def item(index: Double): CSSRule | Null = js.native
}

