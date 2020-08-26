package typings.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a row update. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
@js.native
trait RowUpdateEvent[T] extends js.Object {
  /**
    * The name of the column that was updated.
    */
  var cellKey: String = js.native
  /**
    * The name of the key pressed to trigger the event ('Tab', 'Enter', etc.).
    */
  var key: String = js.native
  /**
    * The index of the updated row.
    */
  var rowIdx: Double = js.native
  /**
    * The columns that were updated and their values.
    */
  var updated: T = js.native
}

object RowUpdateEvent {
  @scala.inline
  def apply[T](cellKey: String, key: String, rowIdx: Double, updated: T): RowUpdateEvent[T] = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowUpdateEvent[T]]
  }
  @scala.inline
  implicit class RowUpdateEventOps[Self <: RowUpdateEvent[_], T] (val x: Self with RowUpdateEvent[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCellKey(value: String): Self = this.set("cellKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIdx(value: Double): Self = this.set("rowIdx", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: T): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
  
}

