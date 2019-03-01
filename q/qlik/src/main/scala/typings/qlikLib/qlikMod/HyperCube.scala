package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperCube extends js.Object {
  var qDataPages: js.Array[NxDataPage]
  var qDimensionInfo: js.Array[NxDimensionInfo]
  var qEffectiveInterColumnSortOrder: js.Array[scala.Double]
  var qError: NxValidationError
  var qGrandTotalRow: js.Array[NxCell]
  var qHasOtherValues: scala.Boolean
  var qIndentMode: scala.Boolean
  var qLastExpandedPos: NxCellPosition
  var qMeasureInfo: js.Array[NxMeasureInfo]
  var qMode: qlikLib.qlikLibStrings.S | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.K
  var qNoOfLeftDims: scala.Double
  var qPivotDataPages: js.Array[NxPivotPage]
  var qSize: Size
  var qStackedDataPages: js.Array[NxStackPage]
  var qStateName: java.lang.String
}

object HyperCube {
  @scala.inline
  def apply(
    qDataPages: js.Array[NxDataPage],
    qDimensionInfo: js.Array[NxDimensionInfo],
    qEffectiveInterColumnSortOrder: js.Array[scala.Double],
    qError: NxValidationError,
    qGrandTotalRow: js.Array[NxCell],
    qHasOtherValues: scala.Boolean,
    qIndentMode: scala.Boolean,
    qLastExpandedPos: NxCellPosition,
    qMeasureInfo: js.Array[NxMeasureInfo],
    qMode: qlikLib.qlikLibStrings.S | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.K,
    qNoOfLeftDims: scala.Double,
    qPivotDataPages: js.Array[NxPivotPage],
    qSize: Size,
    qStackedDataPages: js.Array[NxStackPage],
    qStateName: java.lang.String
  ): HyperCube = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qDataPages")(qDataPages)
    __obj.updateDynamic("qDimensionInfo")(qDimensionInfo)
    __obj.updateDynamic("qEffectiveInterColumnSortOrder")(qEffectiveInterColumnSortOrder)
    __obj.updateDynamic("qError")(qError)
    __obj.updateDynamic("qGrandTotalRow")(qGrandTotalRow)
    __obj.updateDynamic("qHasOtherValues")(qHasOtherValues)
    __obj.updateDynamic("qIndentMode")(qIndentMode)
    __obj.updateDynamic("qLastExpandedPos")(qLastExpandedPos)
    __obj.updateDynamic("qMeasureInfo")(qMeasureInfo)
    __obj.updateDynamic("qMode")(qMode.asInstanceOf[js.Any])
    __obj.updateDynamic("qNoOfLeftDims")(qNoOfLeftDims)
    __obj.updateDynamic("qPivotDataPages")(qPivotDataPages)
    __obj.updateDynamic("qSize")(qSize)
    __obj.updateDynamic("qStackedDataPages")(qStackedDataPages)
    __obj.updateDynamic("qStateName")(qStateName)
    __obj.asInstanceOf[HyperCube]
  }
}

