package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a cell drag
  */
trait CellDragEvent extends js.Object {
  /**
    * The name of the column that was dragged.
    */
  var cellKey: String
  /**
    * The row where the drag began.
    */
  var fromRow: Double
  /**
    * The row where the drag ended.
    */
  var toRow: Double
  /**
    * The value of the cell that was dragged.
    */
  var value: js.Any
}

object CellDragEvent {
  @scala.inline
  def apply(cellKey: String, fromRow: Double, toRow: Double, value: js.Any): CellDragEvent = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellDragEvent]
  }
}

