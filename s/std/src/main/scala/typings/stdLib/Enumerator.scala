package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows enumerating over a COM collection, which may not have indexed item access.
  */
trait Enumerator[T] extends js.Object {
  /**
    * Returns true if the current item is the last one in the collection, or the collection is empty,
    * or the current item is undefined.
    */
  def atEnd(): scala.Boolean
  /**
    * Returns the current item in the collection
    */
  def item(): T
  /**
    * Resets the current item in the collection to the first item. If there are no items in the collection,
    * the current item is set to undefined.
    */
  def moveFirst(): scala.Unit
  /**
    * Moves the current item to the next item in the collection. If the enumerator is at the end of
    * the collection or the collection is empty, the current item is set to undefined.
    */
  def moveNext(): scala.Unit
}

object Enumerator {
  @scala.inline
  def apply[T](
    atEnd: js.Function0[scala.Boolean],
    item: js.Function0[T],
    moveFirst: js.Function0[scala.Unit],
    moveNext: js.Function0[scala.Unit]
  ): Enumerator[T] = {
    val __obj = js.Dynamic.literal(atEnd = atEnd, item = item, moveFirst = moveFirst, moveNext = moveNext)
  
    __obj.asInstanceOf[Enumerator[T]]
  }
}

