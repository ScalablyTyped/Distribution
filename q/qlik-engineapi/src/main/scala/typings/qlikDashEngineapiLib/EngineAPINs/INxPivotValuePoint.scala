package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxPivotValuePoint...
  */
trait INxPivotValuePoint extends js.Object {
  /**
    * NxAttribute expressions values.
    */
  var qAttrExps: INxAttributeExpressionValues
  /**
    * Label of the cell.
    * >> This parameter is optional.
    */
  var qLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Value of the cell.
    */
  var qNum: scala.Double
  /**
    * Some text related to the cell.
    */
  var qText: java.lang.String
  /**
    * Type of the cell.
    *
    * One of:
    *
    *    V for NX_DIM_CELL_VALUE. Applies to values in the data matrix.
    *    E for NX_DIM_CELL_EMPTY. Applies to empty cells in the top and left dimensions.
    *    N for NX_DIM_CELL_NORMAL. Applies to left and top dimensions cells.
    *    T for NX_DIM_CELL_TOTAL. Applies to cells marked with Total
    *    P for NX_DIM_CELL_PSEUDO. Applies to pseudo dimensions.
    *    R for NX_DIM_CELL_ROOT. Applies to root node.
    *    U for NX_DIM_CELL_NULL. Applies to Null values in the data matrix.
    */
  var qType: NxCellType
}

object INxPivotValuePoint {
  @scala.inline
  def apply(
    qAttrExps: INxAttributeExpressionValues,
    qNum: scala.Double,
    qText: java.lang.String,
    qType: NxCellType,
    qLabel: java.lang.String = null
  ): INxPivotValuePoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qAttrExps")(qAttrExps)
    __obj.updateDynamic("qNum")(qNum)
    __obj.updateDynamic("qText")(qText)
    __obj.updateDynamic("qType")(qType)
    if (qLabel != null) __obj.updateDynamic("qLabel")(qLabel)
    __obj.asInstanceOf[INxPivotValuePoint]
  }
}

