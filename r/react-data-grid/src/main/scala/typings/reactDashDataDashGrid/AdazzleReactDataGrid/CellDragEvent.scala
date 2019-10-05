package typings.reactDashDataDashGrid.AdazzleReactDataGrid

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
    val __obj = js.Dynamic.literal(cellKey = cellKey, fromRow = fromRow, toRow = toRow, value = value)
  
    __obj.asInstanceOf[CellDragEvent]
  }
}

