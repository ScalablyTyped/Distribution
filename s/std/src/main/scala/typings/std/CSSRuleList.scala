package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList)
  */
@js.native
trait CSSRuleList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[CSSRule] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList/item) */
  /* standard dom */
  def item(index: Double): CSSRule | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSRule]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSRuleList/length) */
  /* standard dom */
  val length: Double = js.native
}
