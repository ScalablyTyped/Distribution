package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A CSSRuleList is an (indirect-modify only) array-like object containing an ordered collection of CSSRule objects. */
@js.native
trait CSSRuleList
  extends StObject
     with /* index */ NumberDictionary[CSSRule] {
  
  def item(index: Double): CSSRule | Null = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSRule]] = js.native
  
  val length: Double = js.native
}
