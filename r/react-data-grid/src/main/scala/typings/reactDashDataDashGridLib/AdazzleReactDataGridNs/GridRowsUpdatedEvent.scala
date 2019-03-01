package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

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
  var action: reactDashDataDashGridLib.reactDashDataDashGridLibStrings.cellUpdate | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.cellDrag | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.columnFill | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.copyPaste
  /**
    * The key of the column where the event occurred.
    */
  var cellKey: java.lang.String
  /**
    * The top row affected by the event.
    */
  var fromRow: scala.Double
  /**
    * The bottom row affected by the event.
    */
  var toRow: scala.Double
  /**
    * The columns that were updated and their values.
    */
  var updated: T
}

object GridRowsUpdatedEvent {
  @scala.inline
  def apply[T](
    action: reactDashDataDashGridLib.reactDashDataDashGridLibStrings.cellUpdate | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.cellDrag | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.columnFill | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.copyPaste,
    cellKey: java.lang.String,
    fromRow: scala.Double,
    toRow: scala.Double,
    updated: T
  ): GridRowsUpdatedEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("cellKey")(cellKey)
    __obj.updateDynamic("fromRow")(fromRow)
    __obj.updateDynamic("toRow")(toRow)
    __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowsUpdatedEvent[T]]
  }
}

