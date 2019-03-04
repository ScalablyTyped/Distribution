package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

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
  var cellKey: java.lang.String
  /**
    * The row where the drag began.
    */
  var fromRow: scala.Double
  /**
    * The row where the drag ended.
    */
  var toRow: scala.Double
  /**
    * The value of the cell that was dragged.
    */
  var value: js.Any
}

object CellDragEvent {
  @scala.inline
  def apply(cellKey: java.lang.String, fromRow: scala.Double, toRow: scala.Double, value: js.Any): CellDragEvent = {
    val __obj = js.Dynamic.literal(cellKey = cellKey, fromRow = fromRow, toRow = toRow, value = value)
  
    __obj.asInstanceOf[CellDragEvent]
  }
}

