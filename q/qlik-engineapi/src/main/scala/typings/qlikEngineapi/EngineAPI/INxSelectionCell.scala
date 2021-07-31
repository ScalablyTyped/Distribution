package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxSelectionCell...
  */
trait INxSelectionCell extends StObject {
  
  /**
    * Column index to select
    * Indexing starts from 0.
    * If the cell's type is:
    *   D, the index is based on the data matrix.
    *   T, the index is based on the data matrix
    *   L, the index is based on the left dimensions indexes
    */
  var qCol: Double
  
  /**
    * Row index to select
    * Indexing starts from 0.
    * If the cell's type is:
    * - D, the index is based on the data matrix.
    * - T, the index is based on the top dimensions indexes
    * - L, the index is based on the data matrix
    */
  var qRow: Double
  
  /**
    * Type of cells to select
    * One of:
    *                 D for data
    *                 T for top dimension cells
    *                 L for left dimension cells
    */
  var qType: NxSelectionCellType
}
object INxSelectionCell {
  
  @scala.inline
  def apply(qCol: Double, qRow: Double, qType: NxSelectionCellType): INxSelectionCell = {
    val __obj = js.Dynamic.literal(qCol = qCol.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxSelectionCell]
  }
  
  @scala.inline
  implicit class INxSelectionCellMutableBuilder[Self <: INxSelectionCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCol(value: Double): Self = StObject.set(x, "qCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRow(value: Double): Self = StObject.set(x, "qRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: NxSelectionCellType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
