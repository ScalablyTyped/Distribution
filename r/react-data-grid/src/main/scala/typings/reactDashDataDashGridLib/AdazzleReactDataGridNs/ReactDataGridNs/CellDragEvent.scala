package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs.ReactDataGridNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellKey")(cellKey)
    __obj.updateDynamic("fromRow")(fromRow)
    __obj.updateDynamic("toRow")(toRow)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CellDragEvent]
  }
}

