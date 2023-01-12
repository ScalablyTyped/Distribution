package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxPivotDimensionCell...
  */
trait INxPivotDimensionCell extends StObject {
  
  /**
    * Information about attribute dimensions.
    */
  var qAttrDims: js.Array[INxAttributeDimValues]
  
  /**
    * Information about attribute expressions.
    * The array is empty [ ] when there is no attribute expressions.
    * AttrDims: INxAttributeDimValues[];
    */
  var qAttrExps: js.Array[INxAttributeExpressionValues]
  
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
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight.
    */
  var qDown: Double
  
  /**
    * Rank number of the value
    * If set to -1, it means that the value is not an element number.
    */
  var qElemNo: Double
  
  /**
    * Information about sub nodes (or sub cells)
    * The array is empty [ ] when there is no sub nodes.
    */
  var qSubNodes: js.Array[INxPivotDimensionCell]
  
  /**
    * Some text
    */
  var qText: String
  
  /**
    * Type of the cell
    *
    * One of:
    *   V for NX_DIM_CELL_VALUE. Applies to values in the data matrix.
    *   E for NX_DIM_CELL_EMPTY. Applies to empty cells in the top and left dimensions.
    *   N for NX_DIM_CELL_NORMAL. Applies to left and top dimensions cells.
    *   T for NX_DIM_CELL_TOTAL. Applies to cells marked with Total
    *   P for NX_DIM_CELL_PSEUDO. Applies to pseudo dimensions.
    *   R for NX_DIM_CELL_ROOT. Applies to root node.
    *   U for NX_DIM_CELL_NULL. Applies to Null values in the data matrix.
    */
  var qType: NxCellType
  
  /**
    * Number of elements that are part of the previous tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight.
    */
  var qUp: Double
  
  /**
    * Value of the cell
    * Is set to NaN, if the value is not a number.
    */
  var qValue: Double
}
object INxPivotDimensionCell {
  
  inline def apply(
    qAttrDims: js.Array[INxAttributeDimValues],
    qAttrExps: js.Array[INxAttributeExpressionValues],
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qSubNodes: js.Array[INxPivotDimensionCell],
    qText: String,
    qType: NxCellType,
    qUp: Double,
    qValue: Double
  ): INxPivotDimensionCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qCanCollapse = qCanCollapse.asInstanceOf[js.Any], qCanExpand = qCanExpand.asInstanceOf[js.Any], qDown = qDown.asInstanceOf[js.Any], qElemNo = qElemNo.asInstanceOf[js.Any], qSubNodes = qSubNodes.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxPivotDimensionCell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxPivotDimensionCell] (val x: Self) extends AnyVal {
    
    inline def setQAttrDims(value: js.Array[INxAttributeDimValues]): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    inline def setQAttrDimsVarargs(value: INxAttributeDimValues*): Self = StObject.set(x, "qAttrDims", js.Array(value*))
    
    inline def setQAttrExps(value: js.Array[INxAttributeExpressionValues]): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    inline def setQAttrExpsVarargs(value: INxAttributeExpressionValues*): Self = StObject.set(x, "qAttrExps", js.Array(value*))
    
    inline def setQCanCollapse(value: Boolean): Self = StObject.set(x, "qCanCollapse", value.asInstanceOf[js.Any])
    
    inline def setQCanExpand(value: Boolean): Self = StObject.set(x, "qCanExpand", value.asInstanceOf[js.Any])
    
    inline def setQDown(value: Double): Self = StObject.set(x, "qDown", value.asInstanceOf[js.Any])
    
    inline def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    inline def setQSubNodes(value: js.Array[INxPivotDimensionCell]): Self = StObject.set(x, "qSubNodes", value.asInstanceOf[js.Any])
    
    inline def setQSubNodesVarargs(value: INxPivotDimensionCell*): Self = StObject.set(x, "qSubNodes", js.Array(value*))
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setQType(value: NxCellType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    inline def setQUp(value: Double): Self = StObject.set(x, "qUp", value.asInstanceOf[js.Any])
    
    inline def setQValue(value: Double): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
