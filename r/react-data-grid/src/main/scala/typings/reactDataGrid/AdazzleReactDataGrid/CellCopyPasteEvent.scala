package typings.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a copy paste
  */
@js.native
trait CellCopyPasteEvent extends js.Object {
  
  /**
    * The key of the column where the copy paste occurred.
    */
  var cellKey: String = js.native
  
  /**
    * The row that was copied from.
    */
  var fromRow: Double = js.native
  
  /**
    * The row that was pasted to.
    */
  var rowIdx: Double = js.native
  
  /**
    * The row that was pasted to.
    */
  var toRow: Double = js.native
  
  /**
    * The value that was pasted.
    */
  var value: js.Any = js.native
}
object CellCopyPasteEvent {
  
  @scala.inline
  def apply(cellKey: String, fromRow: Double, rowIdx: Double, toRow: Double, value: js.Any): CellCopyPasteEvent = {
    val __obj = js.Dynamic.literal(cellKey = cellKey.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellCopyPasteEvent]
  }
  
  @scala.inline
  implicit class CellCopyPasteEventOps[Self <: CellCopyPasteEvent] (val x: Self) extends AnyVal {
    
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
    def setRowIdx(value: Double): Self = this.set("rowIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToRow(value: Double): Self = this.set("toRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
