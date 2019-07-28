package typings.qlik.qlikMod

import typings.qlik.qlikStrings.K
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperCube extends js.Object {
  var qDataPages: js.Array[NxDataPage]
  var qDimensionInfo: js.Array[NxDimensionInfo]
  var qEffectiveInterColumnSortOrder: js.Array[Double]
  var qError: NxValidationError
  var qGrandTotalRow: js.Array[NxCell]
  var qHasOtherValues: Boolean
  var qIndentMode: Boolean
  var qLastExpandedPos: NxCellPosition
  var qMeasureInfo: js.Array[NxMeasureInfo]
  var qMode: S | P | K
  var qNoOfLeftDims: Double
  var qPivotDataPages: js.Array[NxPivotPage]
  var qSize: Size
  var qStackedDataPages: js.Array[NxStackPage]
  var qStateName: String
}

object HyperCube {
  @scala.inline
  def apply(
    qDataPages: js.Array[NxDataPage],
    qDimensionInfo: js.Array[NxDimensionInfo],
    qEffectiveInterColumnSortOrder: js.Array[Double],
    qError: NxValidationError,
    qGrandTotalRow: js.Array[NxCell],
    qHasOtherValues: Boolean,
    qIndentMode: Boolean,
    qLastExpandedPos: NxCellPosition,
    qMeasureInfo: js.Array[NxMeasureInfo],
    qMode: S | P | K,
    qNoOfLeftDims: Double,
    qPivotDataPages: js.Array[NxPivotPage],
    qSize: Size,
    qStackedDataPages: js.Array[NxStackPage],
    qStateName: String
  ): HyperCube = {
    val __obj = js.Dynamic.literal(qDataPages = qDataPages, qDimensionInfo = qDimensionInfo, qEffectiveInterColumnSortOrder = qEffectiveInterColumnSortOrder, qError = qError, qGrandTotalRow = qGrandTotalRow, qHasOtherValues = qHasOtherValues, qIndentMode = qIndentMode, qLastExpandedPos = qLastExpandedPos, qMeasureInfo = qMeasureInfo, qMode = qMode.asInstanceOf[js.Any], qNoOfLeftDims = qNoOfLeftDims, qPivotDataPages = qPivotDataPages, qSize = qSize, qStackedDataPages = qStackedDataPages, qStateName = qStateName)
  
    __obj.asInstanceOf[HyperCube]
  }
}

