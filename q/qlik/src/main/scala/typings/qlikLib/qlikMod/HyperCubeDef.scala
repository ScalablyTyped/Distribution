package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HyperCubeDef extends js.Object {
  var qAlwaysFullyExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var qCalcCond: js.UndefOr[ValueExpr] = js.undefined
  var qDimensions: js.UndefOr[js.Array[NxDimension]] = js.undefined
  var qIndentMode: js.UndefOr[scala.Boolean] = js.undefined
  var qInitialDataFetch: js.UndefOr[js.Array[NxPage]] = js.undefined
  var qInterColumnSortOrder: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var qMaxStackedCells: js.UndefOr[scala.Double] = js.undefined
  var qMeasures: js.UndefOr[js.Array[NxMeasure]] = js.undefined
  var qMode: js.UndefOr[qlikLib.qlikLibStrings.S | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.K] = js.undefined
  var qNoOfLeftDims: js.UndefOr[scala.Double] = js.undefined
  var qPopulateMissing: js.UndefOr[scala.Boolean] = js.undefined
  var qShowTotalsAbove: js.UndefOr[scala.Boolean] = js.undefined
  var qSortByYValue: js.UndefOr[
    qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1`
  ] = js.undefined
  var qStateName: js.UndefOr[java.lang.String] = js.undefined
  var qSuppressZero: js.UndefOr[scala.Boolean] = js.undefined
  var qSupressMissing: js.UndefOr[scala.Boolean] = js.undefined
}

