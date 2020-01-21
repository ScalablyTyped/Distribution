package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxPivotDimensionCell...
  */
trait INxPivotDimensionCell extends js.Object {
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
}

