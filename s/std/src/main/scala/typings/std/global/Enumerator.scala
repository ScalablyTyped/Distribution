package typings.std.global

import org.scalablytyped.runtime.TopLevel
import typings.std.EnumeratorConstructor
import typings.std.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Enumerator")
@js.native
class Enumerator[T] protected ()
  extends typings.std.Enumerator[T] {
  def this(collection: js.Any) = this()
  def this(collection: Item[T]) = this()
  def this(safearray: typings.std.SafeArray[T]) = this()
  /**
    * Returns true if the current item is the last one in the collection, or the collection is empty,
    * or the current item is undefined.
    */
  /* CompleteClass */
  override def atEnd(): scala.Boolean = js.native
  /**
    * Returns the current item in the collection
    */
  /* CompleteClass */
  override def item(): T = js.native
  /**
    * Resets the current item in the collection to the first item. If there are no items in the collection,
    * the current item is set to undefined.
    */
  /* CompleteClass */
  override def moveFirst(): Unit = js.native
  /**
    * Moves the current item to the next item in the collection. If the enumerator is at the end of
    * the collection or the collection is empty, the current item is set to undefined.
    */
  /* CompleteClass */
  override def moveNext(): Unit = js.native
}

@JSGlobal("Enumerator")
@js.native
object Enumerator extends TopLevel[EnumeratorConstructor]

