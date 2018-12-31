package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxStackedPivotCell...
  */
trait INxStackedPivotCell extends js.Object {
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
  var qCanCollapse: scala.Boolean
  /**
    * If set to true, it means that the cell can be expanded.
    * This parameter is not returned if it is set to false.
    */
  var qCanExpand: scala.Boolean
  /**
    * Number of elements that are part of the next tail.
    */
  var qDown: scala.Double
  /**
    * Rank number of the value.
    * If set to -1, it means that the value is not an element number.
    */
  var qElemNo: scala.Double
  /**
    * Total of the positive values in the current group of cells.
    */
  var qMaxPos: scala.Double
  /**
    * Total of the negative values in the current group of cells.
    */
  var qMinNeg: scala.Double
  /**
    * Row index in the data matrix.
    * The indexing starts from 0.
    */
  var qRow: scala.Double
  /**
    * Information about sub nodes (or sub cells).
    * The array is empty [ ] when there are no sub nodes.
    */
  var qSubNodes: js.Array[INxStackedPivotCell]
  /**
    * Some text.
    */
  var qText: java.lang.String
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
  var qUp: scala.Double
  /**
    * Value of the cell.
    * Is set to NaN, if the value is not a number.
    */
  var qValue: scala.Double
}

