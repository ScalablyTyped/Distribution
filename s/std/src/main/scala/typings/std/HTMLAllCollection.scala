package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAllCollection) */
@js.native
trait HTMLAllCollection
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[Element] {
  
  /**
    * Returns the item with index index from the collection (determined by tree order).
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAllCollection/item)
    */
  /* standard dom */
  def item(): HTMLCollection | Element | Null = js.native
  def item(nameOrIndex: java.lang.String): HTMLCollection | Element | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]] = js.native
  
  /**
    * Returns the number of elements in the collection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAllCollection/length)
    */
  /* standard dom */
  val length: Double = js.native
  
  /**
    * Returns the item with ID or name name from the collection.
    *
    * If there are multiple matching items, then an HTMLCollection object containing all those elements is returned.
    *
    * Only button, form, iframe, input, map, meta, object, select, and textarea elements can have a name for the purpose of this method; their name is given by the value of their name attribute.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAllCollection/namedItem)
    */
  /* standard dom */
  def namedItem(name: java.lang.String): HTMLCollection | Element | Null = js.native
}
