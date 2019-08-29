package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This IndexedDB API interface represents a cursor for traversing or iterating over multiple records in a database. It is the same as the IDBCursor, except that it includes the value property. */
@js.native
trait IDBCursorWithValue extends IDBCursor {
  /**
    * Returns the cursor's current value.
    */
  val value: js.Any = js.native
}

@JSGlobal("IDBCursorWithValue")
@js.native
class IDBCursorWithValueCls () extends IDBCursorWithValue

@JSGlobal("IDBCursorWithValue")
@js.native
object IDBCursorWithValue extends Instantiable0[IDBCursorWithValue]

