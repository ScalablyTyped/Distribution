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

object HyperCubeDef {
  @scala.inline
  def apply(
    qAlwaysFullyExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    qCalcCond: ValueExpr = null,
    qDimensions: js.Array[NxDimension] = null,
    qIndentMode: js.UndefOr[scala.Boolean] = js.undefined,
    qInitialDataFetch: js.Array[NxPage] = null,
    qInterColumnSortOrder: js.Array[scala.Double] = null,
    qMaxStackedCells: scala.Int | scala.Double = null,
    qMeasures: js.Array[NxMeasure] = null,
    qMode: qlikLib.qlikLibStrings.S | qlikLib.qlikLibStrings.P | qlikLib.qlikLibStrings.K = null,
    qNoOfLeftDims: scala.Int | scala.Double = null,
    qPopulateMissing: js.UndefOr[scala.Boolean] = js.undefined,
    qShowTotalsAbove: js.UndefOr[scala.Boolean] = js.undefined,
    qSortByYValue: qlikLib.qlikLibNumbers.`-1` | qlikLib.qlikLibNumbers.`0` | qlikLib.qlikLibNumbers.`1` = null,
    qStateName: java.lang.String = null,
    qSuppressZero: js.UndefOr[scala.Boolean] = js.undefined,
    qSupressMissing: js.UndefOr[scala.Boolean] = js.undefined
  ): HyperCubeDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(qAlwaysFullyExpanded)) __obj.updateDynamic("qAlwaysFullyExpanded")(qAlwaysFullyExpanded)
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond)
    if (qDimensions != null) __obj.updateDynamic("qDimensions")(qDimensions)
    if (!js.isUndefined(qIndentMode)) __obj.updateDynamic("qIndentMode")(qIndentMode)
    if (qInitialDataFetch != null) __obj.updateDynamic("qInitialDataFetch")(qInitialDataFetch)
    if (qInterColumnSortOrder != null) __obj.updateDynamic("qInterColumnSortOrder")(qInterColumnSortOrder)
    if (qMaxStackedCells != null) __obj.updateDynamic("qMaxStackedCells")(qMaxStackedCells.asInstanceOf[js.Any])
    if (qMeasures != null) __obj.updateDynamic("qMeasures")(qMeasures)
    if (qMode != null) __obj.updateDynamic("qMode")(qMode.asInstanceOf[js.Any])
    if (qNoOfLeftDims != null) __obj.updateDynamic("qNoOfLeftDims")(qNoOfLeftDims.asInstanceOf[js.Any])
    if (!js.isUndefined(qPopulateMissing)) __obj.updateDynamic("qPopulateMissing")(qPopulateMissing)
    if (!js.isUndefined(qShowTotalsAbove)) __obj.updateDynamic("qShowTotalsAbove")(qShowTotalsAbove)
    if (qSortByYValue != null) __obj.updateDynamic("qSortByYValue")(qSortByYValue.asInstanceOf[js.Any])
    if (qStateName != null) __obj.updateDynamic("qStateName")(qStateName)
    if (!js.isUndefined(qSuppressZero)) __obj.updateDynamic("qSuppressZero")(qSuppressZero)
    if (!js.isUndefined(qSupressMissing)) __obj.updateDynamic("qSupressMissing")(qSupressMissing)
    __obj.asInstanceOf[HyperCubeDef]
  }
}

