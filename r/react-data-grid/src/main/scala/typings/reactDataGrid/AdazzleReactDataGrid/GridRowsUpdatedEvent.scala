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
trait GridRowsUpdatedEvent[T] extends js.Object {
  /**
    * The action that occurred to trigger this event.
    * One of 'cellUpdate', 'cellDrag', 'columnFill', or 'copyPaste'.
    */
  var action: cellUpdate | cellDrag | columnFill | copyPaste
  /**
    * The key of the column where the event occurred.
    */
  var cellKey: String
  /**
    * The top row affected by the event.
    */
  var fromRow: Double
  /**
    * The bottom row affected by the event.
    */
  var toRow: Double
  /**
    * The columns that were updated and their values.
    */
  var updated: T
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
}

