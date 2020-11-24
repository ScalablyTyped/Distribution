package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxPivotDimensionCell...
  */
@js.native
trait INxPivotDimensionCell extends js.Object {
  
  /**
    * Information about attribute dimensions.
    */
  var qAttrDims: js.Array[INxAttributeDimValues] = js.native
  
  /**
    * Information about attribute expressions.
    * The array is empty [ ] when there is no attribute expressions.
    * AttrDims: INxAttributeDimValues[];
    */
  var qAttrExps: js.Array[INxAttributeExpressionValues] = js.native
  
  /**
    * If set to true, it means that the cell can be collapsed.
    * This parameter is not returned if it is set to false.
    */
  var qCanCollapse: Boolean = js.native
  
  /**
    * If set to true, it means that the cell can be expanded.
    * This parameter is not returned if it is set to false.
    */
  var qCanExpand: Boolean = js.native
  
  /**
    * Number of elements that are part of the next tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight.
    */
  var qDown: Double = js.native
  
  /**
    * Rank number of the value
    * If set to -1, it means that the value is not an element number.
    */
  var qElemNo: Double = js.native
  
  /**
    * Information about sub nodes (or sub cells)
    * The array is empty [ ] when there is no sub nodes.
    */
  var qSubNodes: js.Array[INxPivotDimensionCell] = js.native
  
  /**
    * Some text
    */
  var qText: String = js.native
  
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
  var qType: NxCellType = js.native
  
  /**
    * Number of elements that are part of the previous tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight.
    */
  var qUp: Double = js.native
  
  /**
    * Value of the cell
    * Is set to NaN, if the value is not a number.
    */
  var qValue: Double = js.native
}
object INxPivotDimensionCell {
  
  @scala.inline
  def apply(
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
  implicit class INxPivotDimensionCellOps[Self <: INxPivotDimensionCell] (val x: Self) extends AnyVal {
    
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
    def setQAttrDimsVarargs(value: INxAttributeDimValues*): Self = this.set("qAttrDims", js.Array(value :_*))
    
    @scala.inline
    def setQAttrDims(value: js.Array[INxAttributeDimValues]): Self = this.set("qAttrDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExpsVarargs(value: INxAttributeExpressionValues*): Self = this.set("qAttrExps", js.Array(value :_*))
    
    @scala.inline
    def setQAttrExps(value: js.Array[INxAttributeExpressionValues]): Self = this.set("qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCanCollapse(value: Boolean): Self = this.set("qCanCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCanExpand(value: Boolean): Self = this.set("qCanExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDown(value: Double): Self = this.set("qDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQElemNo(value: Double): Self = this.set("qElemNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSubNodesVarargs(value: INxPivotDimensionCell*): Self = this.set("qSubNodes", js.Array(value :_*))
    
    @scala.inline
    def setQSubNodes(value: js.Array[INxPivotDimensionCell]): Self = this.set("qSubNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: NxCellType): Self = this.set("qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUp(value: Double): Self = this.set("qUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: Double): Self = this.set("qValue", value.asInstanceOf[js.Any])
  }
}
