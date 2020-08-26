package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a cell drag
  */
@js.native
trait CellDragEvent extends js.Object {
  /**
    * The name of the column that was dragged.
    */
  var cellKey: String = js.native
  /**
    * The row where the drag began.
    */
  var fromRow: Double = js.native
  /**
    * The row where the drag ended.
    */
  var toRow: Double = js.native
  /**
    * The value of the cell that was dragged.
    */
  var value: js.Any = js.native
}

object CellDragEvent {
  @scala.inline
  def apply(cellKey: String, fromRow: Double, toRow: Double, value: js.Any): CellDragEvent = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDragEvent]
  }
  @scala.inline
  implicit class CellDragEventOps[Self <: CellDragEvent] (val x: Self) extends AnyVal {
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
    def setFromRow(value: Double): Self = this.set("fromRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setToRow(value: Double): Self = this.set("toRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

