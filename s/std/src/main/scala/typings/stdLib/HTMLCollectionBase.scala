package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLCollection interface represents a generic collection (array-like object similar to arguments) of elements (in document order) and offers methods and properties for selecting from the list. */
trait HTMLCollectionBase
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Element] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Element]]
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: scala.Double
  /**
    * Retrieves an object from various collections.
    */
  def item(index: scala.Double): Element | scala.Null
}

object HTMLCollectionBase {
  @scala.inline
  def apply(
    item: scala.Double => Element | scala.Null,
    iterator: () => IterableIterator[Element],
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[Element] = null
  ): HTMLCollectionBase = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), iterator = js.Any.fromFunction0(iterator), length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[HTMLCollectionBase]
  }
}

