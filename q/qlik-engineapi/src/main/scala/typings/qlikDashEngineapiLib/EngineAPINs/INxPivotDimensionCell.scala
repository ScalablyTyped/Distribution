package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qCanCollapse: scala.Boolean
  /**
    * If set to true, it means that the cell can be expanded.
    * This parameter is not returned if it is set to false.
    */
  var qCanExpand: scala.Boolean
  /**
    * Number of elements that are part of the next tail.
    * This number depends on the paging, more particularly it depends on the values defined in qTop and qHeight.
    */
  var qDown: scala.Double
  /**
    * Rank number of the value
    * If set to -1, it means that the value is not an element number.
    */
  var qElemNo: scala.Double
  /**
    * Information about sub nodes (or sub cells)
    * The array is empty [ ] when there is no sub nodes.
    */
  var qSubNodes: js.Array[INxPivotDimensionCell]
  /**
    * Some text
    */
  var qText: java.lang.String
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
  var qUp: scala.Double
  /**
    * Value of the cell
    * Is set to NaN, if the value is not a number.
    */
  var qValue: scala.Double
}

