package typings.reactDataGrid.AdazzleReactDataGrid

import typings.reactDataGrid.reactDataGridStrings.cellDrag
import typings.reactDataGrid.reactDataGridStrings.cellUpdate
import typings.reactDataGrid.reactDataGridStrings.columnFill
import typings.reactDataGrid.reactDataGridStrings.copyPaste
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about some update to the grid's contents. Generic event type returns untyped row, use parameterized type with the row type as the parameter
  * @default T = any
  */
@js.native
trait GridRowsUpdatedEvent[T] extends js.Object {
  /**
    * The action that occurred to trigger this event.
    * One of 'cellUpdate', 'cellDrag', 'columnFill', or 'copyPaste'.
    */
  var action: cellUpdate | cellDrag | columnFill | copyPaste = js.native
  /**
    * The key of the column where the event occurred.
    */
  var cellKey: String = js.native
  /**
    * The top row affected by the event.
    */
  var fromRow: Double = js.native
  /**
    * The bottom row affected by the event.
    */
  var toRow: Double = js.native
  /**
    * The columns that were updated and their values.
    */
  var updated: T = js.native
}

object GridRowsUpdatedEvent {
  @scala.inline
  def apply[T](
    action: cellUpdate | cellDrag | columnFill | copyPaste,
    cellKey: String,
    fromRow: Double,
    toRow: Double,
    updated: T
  ): GridRowsUpdatedEvent[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowsUpdatedEvent[T]]
  }
  @scala.inline
  implicit class GridRowsUpdatedEventOps[Self <: GridRowsUpdatedEvent[_], T] (val x: Self with GridRowsUpdatedEvent[T]) extends AnyVal {
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
    def setAction(value: cellUpdate | cellDrag | columnFill | copyPaste): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellKey(value: String): Self = this.set("cellKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromRow(value: Double): Self = this.set("fromRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setToRow(value: Double): Self = this.set("toRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: T): Self = this.set("updated", value.asInstanceOf[js.Any])
  }
  
}

