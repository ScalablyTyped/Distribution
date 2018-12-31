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

