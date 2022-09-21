package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxStackedPivotCell...
  */
trait INxStackedPivotCell extends StObject {
  
  /**
    * Attribute dimensions values.
    */
  var qAttrDims: INxAttributeDimValues
  
  /**
    * Attribute expressions values.
    */
  var qAttrExps: INxAttributeExpressionValues
  
  /**
    * If set to true, it means that the cell can be collapsed.
    * This parameter is not returned if it is set to false.
    */
  var qCanCollapse: Boolean
  
  /**
    * If set to true, it means that the cell can be expanded.
    * This parameter is not returned if it is set to false.
    */
  var qCanExpand: Boolean
  
  /**
    * Number of elements that are part of the next tail.
    */
  var qDown: Double
  
  /**
    * Rank number of the value.
    * If set to -1, it means that the value is not an element number.
    */
  var qElemNo: Double
  
  /**
    * Total of the positive values in the current group of cells.
    */
  var qMaxPos: Double
  
  /**
    * Total of the negative values in the current group of cells.
    */
  var qMinNeg: Double
  
  /**
    * Row index in the data matrix.
    * The indexing starts from 0.
    */
  var qRow: Double
  
  /**
    * Information about sub nodes (or sub cells).
    * The array is empty [ ] when there are no sub nodes.
    */
  var qSubNodes: js.Array[INxStackedPivotCell]
  
  /**
    * Some text.
    */
  var qText: String
  
  /**
    * Type of the cell.
    * One of:
    *      V for NX_DIM_CELL_VALUE. Applies to values in the data matrix.
    *      E for NX_DIM_CELL_EMPTY. Applies to empty cells in the top and left dimensions.
    *      N for NX_DIM_CELL_NORMAL. Applies to left and top dimensions cells.
    *      T for NX_DIM_CELL_TOTAL. Applies to cells marked with Total
    *      P for NX_DIM_CELL_PSEUDO. Applies to pseudo dimensions.
    *      R for NX_DIM_CELL_ROOT. Applies to root node.
    *      U for NX_DIM_CELL_NULL. Applies to Null values in the data matrix.
    */
  var qType: NxCellType
  
  /**
    * Number of elements that are part of the previous tail.
    */
  var qUp: Double
  
  /**
    * Value of the cell.
    * Is set to NaN, if the value is not a number.
    */
  var qValue: Double
}
object INxStackedPivotCell {
  
  inline def apply(
    qAttrDims: INxAttributeDimValues,
    qAttrExps: INxAttributeExpressionValues,
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qMaxPos: Double,
    qMinNeg: Double,
    qRow: Double,
    qSubNodes: js.Array[INxStackedPivotCell],
    qText: String,
    qType: NxCellType,
    qUp: Double,
    qValue: Double
  ): INxStackedPivotCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qCanCollapse = qCanCollapse.asInstanceOf[js.Any], qCanExpand = qCanExpand.asInstanceOf[js.Any], qDown = qDown.asInstanceOf[js.Any], qElemNo = qElemNo.asInstanceOf[js.Any], qMaxPos = qMaxPos.asInstanceOf[js.Any], qMinNeg = qMinNeg.asInstanceOf[js.Any], qRow = qRow.asInstanceOf[js.Any], qSubNodes = qSubNodes.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxStackedPivotCell]
  }
  
  extension [Self <: INxStackedPivotCell](x: Self) {
    
    inline def setQAttrDims(value: INxAttributeDimValues): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    inline def setQAttrExps(value: INxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    inline def setQCanCollapse(value: Boolean): Self = StObject.set(x, "qCanCollapse", value.asInstanceOf[js.Any])
    
    inline def setQCanExpand(value: Boolean): Self = StObject.set(x, "qCanExpand", value.asInstanceOf[js.Any])
    
    inline def setQDown(value: Double): Self = StObject.set(x, "qDown", value.asInstanceOf[js.Any])
    
    inline def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    inline def setQMaxPos(value: Double): Self = StObject.set(x, "qMaxPos", value.asInstanceOf[js.Any])
    
    inline def setQMinNeg(value: Double): Self = StObject.set(x, "qMinNeg", value.asInstanceOf[js.Any])
    
    inline def setQRow(value: Double): Self = StObject.set(x, "qRow", value.asInstanceOf[js.Any])
    
    inline def setQSubNodes(value: js.Array[INxStackedPivotCell]): Self = StObject.set(x, "qSubNodes", value.asInstanceOf[js.Any])
    
    inline def setQSubNodesVarargs(value: INxStackedPivotCell*): Self = StObject.set(x, "qSubNodes", js.Array(value*))
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setQType(value: NxCellType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    inline def setQUp(value: Double): Self = StObject.set(x, "qUp", value.asInstanceOf[js.Any])
    
    inline def setQValue(value: Double): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
