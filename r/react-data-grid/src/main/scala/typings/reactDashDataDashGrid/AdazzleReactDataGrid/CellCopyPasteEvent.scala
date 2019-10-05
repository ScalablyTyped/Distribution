package typings.reactDashDataDashGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a copy paste
  */
trait CellCopyPasteEvent extends js.Object {
  /**
    * The key of the column where the copy paste occurred.
    */
  var cellKey: String
  /**
    * The row that was copied from.
    */
  var fromRow: Double
  /**
    * The row that was pasted to.
    */
  var rowIdx: Double
  /**
    * The row that was pasted to.
    */
  var toRow: Double
  /**
    * The value that was pasted.
    */
  var value: js.Any
}

object CellCopyPasteEvent {
  @scala.inline
  def apply(cellKey: String, fromRow: Double, rowIdx: Double, toRow: Double, value: js.Any): CellCopyPasteEvent = {
    val __obj = js.Dynamic.literal(cellKey = cellKey, fromRow = fromRow, rowIdx = rowIdx, toRow = toRow, value = value)
  
    __obj.asInstanceOf[CellCopyPasteEvent]
  }
}

