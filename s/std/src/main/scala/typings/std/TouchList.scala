package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList)
  */
@js.native
trait TouchList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[Touch] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/item) */
  /* standard dom */
  def item(index: Double): Touch | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Touch]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TouchList/length) */
  /* standard dom */
  val length: Double = js.native
}
