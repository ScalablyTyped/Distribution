package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of StyleSheet.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList)
  */
@js.native
trait StyleSheetList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[CSSStyleSheet] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList/item) */
  /* standard dom */
  def item(index: Double): CSSStyleSheet | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[CSSStyleSheet]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheetList/length) */
  /* standard dom */
  val length: Double = js.native
}
