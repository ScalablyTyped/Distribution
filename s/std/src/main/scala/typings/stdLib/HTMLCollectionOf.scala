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
    item: js.Function1[scala.Double, T | scala.Null],
    iterator: js.Function0[IterableIterator[T]],
    length: scala.Double,
    namedItem: js.Function1[java.lang.String, T | scala.Null]
  ): HTMLCollectionOf[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item")(item)
    __obj.updateDynamic("iterator")(iterator)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("namedItem")(namedItem)
    __obj.asInstanceOf[HTMLCollectionOf[T]]
  }
}

