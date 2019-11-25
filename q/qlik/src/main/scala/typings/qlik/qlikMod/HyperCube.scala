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
    val __obj = js.Dynamic.literal(qDataPages = qDataPages.asInstanceOf[js.Any], qDimensionInfo = qDimensionInfo.asInstanceOf[js.Any], qEffectiveInterColumnSortOrder = qEffectiveInterColumnSortOrder.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qGrandTotalRow = qGrandTotalRow.asInstanceOf[js.Any], qHasOtherValues = qHasOtherValues.asInstanceOf[js.Any], qIndentMode = qIndentMode.asInstanceOf[js.Any], qLastExpandedPos = qLastExpandedPos.asInstanceOf[js.Any], qMeasureInfo = qMeasureInfo.asInstanceOf[js.Any], qMode = qMode.asInstanceOf[js.Any], qNoOfLeftDims = qNoOfLeftDims.asInstanceOf[js.Any], qPivotDataPages = qPivotDataPages.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any], qStackedDataPages = qStackedDataPages.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HyperCube]
  }
}

