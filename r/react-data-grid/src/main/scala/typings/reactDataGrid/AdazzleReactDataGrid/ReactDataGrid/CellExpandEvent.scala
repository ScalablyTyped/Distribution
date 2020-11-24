package typings.reactDataGrid.AdazzleReactDataGrid.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *   Information about a cell expanded.
  */
@js.native
trait CellExpandEvent[T] extends js.Object {
  
  /**
    * Expand data.
    */
  var expandArgs: js.Any = js.native
  
  /**
    * The column index where the cell is being expanded.
    */
  var idx: Double = js.native
  
  /**
    * The values of the row.
    */
  var rowData: T = js.native
  
  /**
    * The row index where the cell is being expanded.
    */
  var rowIdx: Double = js.native
}
object CellExpandEvent {
  
  @scala.inline
  def apply[T](expandArgs: js.Any, idx: Double, rowData: T, rowIdx: Double): CellExpandEvent[T] = {
    val __obj = js.Dynamic.literal(expandArgs = expandArgs.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], rowData = rowData.asInstanceOf[js.Any], rowIdx = rowIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellExpandEvent[T]]
  }
  
  @scala.inline
  implicit class CellExpandEventOps[Self <: CellExpandEvent[_], T] (val x: Self with CellExpandEvent[T]) extends AnyVal {
    
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
    def setExpandArgs(value: js.Any): Self = this.set("expandArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdx(value: Double): Self = this.set("idx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowData(value: T): Self = this.set("rowData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIdx(value: Double): Self = this.set("rowIdx", value.asInstanceOf[js.Any])
  }
}
