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
    val __obj = js.Dynamic.literal(qDataPages = qDataPages, qDimensionInfo = qDimensionInfo, qEffectiveInterColumnSortOrder = qEffectiveInterColumnSortOrder, qError = qError, qGrandTotalRow = qGrandTotalRow, qHasOtherValues = qHasOtherValues, qIndentMode = qIndentMode, qLastExpandedPos = qLastExpandedPos, qMeasureInfo = qMeasureInfo, qMode = qMode.asInstanceOf[js.Any], qNoOfLeftDims = qNoOfLeftDims, qPivotDataPages = qPivotDataPages, qSize = qSize, qStackedDataPages = qStackedDataPages, qStateName = qStateName)
  
    __obj.asInstanceOf[HyperCube]
  }
}

