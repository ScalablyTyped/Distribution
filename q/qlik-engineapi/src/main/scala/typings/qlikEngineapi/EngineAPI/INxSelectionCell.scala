package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxSelectionCell...
  */
@js.native
trait INxSelectionCell extends js.Object {
  
  /**
    * Column index to select
    * Indexing starts from 0.
    * If the cell's type is:
    *   D, the index is based on the data matrix.
    *   T, the index is based on the data matrix
    *   L, the index is based on the left dimensions indexes
    */
  var qCol: Double = js.native
  
  /**
    * Row index to select
    * Indexing starts from 0.
    * If the cell's type is:
    * - D, the index is based on the data matrix.
    * - T, the index is based on the top dimensions indexes
    * - L, the index is based on the data matrix
    */
  var qRow: Double = js.native
  
  /**
    * Type of cells to select
    * One of:
    *                 D for data
    *                 T for top dimension cells
    *                 L for left dimension cells
    */
  var qType: NxSelectionCellType = js.native
}
object INxSelectionCell {
  
  @scala.inline
  def apply(qCol: Double, qRow: Double, qType: NxSelectionCellType): INxSelectionCell = {
    val __obj = js.Dynamic.literal(qCol = qCol.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSelectionCell]
  }
  
  @scala.inline
  implicit class INxSelectionCellOps[Self <: INxSelectionCell] (val x: Self) extends AnyVal {
    
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
    def setQCol(value: Double): Self = this.set("qCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRow(value: Double): Self = this.set("qRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: NxSelectionCellType): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
}
