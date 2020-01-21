package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

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
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellCopyPasteEvent]
  }
}

