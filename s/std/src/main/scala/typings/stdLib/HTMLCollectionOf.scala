package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCollectionOf[T /* <: Element */] extends HTMLCollectionBase {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator_HTMLCollectionOf: js.Function0[IterableIterator[T]]
  def namedItem(name: java.lang.String): T | scala.Null
}

object HTMLCollectionOf {
  @scala.inline
  def apply[T /* <: Element */](
    item: scala.Double => T | scala.Null,
    iterator: () => IterableIterator[T],
    length: scala.Double,
    namedItem: java.lang.String => T | scala.Null
  ): HTMLCollectionOf[T] = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), iterator = js.Any.fromFunction0(iterator), length = length, namedItem = js.Any.fromFunction1(namedItem))
  
    __obj.asInstanceOf[HTMLCollectionOf[T]]
  }
}

