package typings.qlik.mod

import typings.qlik.qlikNumbers.`-1`
import typings.qlik.qlikNumbers.`0`
import typings.qlik.qlikNumbers.`1`
import typings.qlik.qlikStrings.K
import typings.qlik.qlikStrings.P
import typings.qlik.qlikStrings.S
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HyperCubeDef extends js.Object {
  var qAlwaysFullyExpanded: js.UndefOr[Boolean] = js.undefined
  var qCalcCond: js.UndefOr[ValueExpr] = js.undefined
  var qDimensions: js.UndefOr[js.Array[NxDimension]] = js.undefined
  var qIndentMode: js.UndefOr[Boolean] = js.undefined
  var qInitialDataFetch: js.UndefOr[js.Array[NxPage]] = js.undefined
  var qInterColumnSortOrder: js.UndefOr[js.Array[Double]] = js.undefined
  var qMaxStackedCells: js.UndefOr[Double] = js.undefined
  var qMeasures: js.UndefOr[js.Array[NxMeasure]] = js.undefined
  var qMode: js.UndefOr[S | P | K] = js.undefined
  var qNoOfLeftDims: js.UndefOr[Double] = js.undefined
  var qPopulateMissing: js.UndefOr[Boolean] = js.undefined
  var qShowTotalsAbove: js.UndefOr[Boolean] = js.undefined
  var qSortByYValue: js.UndefOr[`-1` | `0` | `1`] = js.undefined
  var qStateName: js.UndefOr[String] = js.undefined
  var qSuppressZero: js.UndefOr[Boolean] = js.undefined
  var qSupressMissing: js.UndefOr[Boolean] = js.undefined
}

object HyperCubeDef {
  @scala.inline
  def apply(
    qAlwaysFullyExpanded: js.UndefOr[Boolean] = js.undefined,
    qCalcCond: ValueExpr = null,
    qDimensions: js.Array[NxDimension] = null,
    qIndentMode: js.UndefOr[Boolean] = js.undefined,
    qInitialDataFetch: js.Array[NxPage] = null,
    qInterColumnSortOrder: js.Array[Double] = null,
    qMaxStackedCells: Int | Double = null,
    qMeasures: js.Array[NxMeasure] = null,
    qMode: S | P | K = null,
    qNoOfLeftDims: Int | Double = null,
    qPopulateMissing: js.UndefOr[Boolean] = js.undefined,
    qShowTotalsAbove: js.UndefOr[Boolean] = js.undefined,
    qSortByYValue: `-1` | `0` | `1` = null,
    qStateName: String = null,
    qSuppressZero: js.UndefOr[Boolean] = js.undefined,
    qSupressMissing: js.UndefOr[Boolean] = js.undefined
  ): HyperCubeDef = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(qAlwaysFullyExpanded)) __obj.updateDynamic("qAlwaysFullyExpanded")(qAlwaysFullyExpanded.asInstanceOf[js.Any])
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond.asInstanceOf[js.Any])
    if (qDimensions != null) __obj.updateDynamic("qDimensions")(qDimensions.asInstanceOf[js.Any])
    if (!js.isUndefined(qIndentMode)) __obj.updateDynamic("qIndentMode")(qIndentMode.asInstanceOf[js.Any])
    if (qInitialDataFetch != null) __obj.updateDynamic("qInitialDataFetch")(qInitialDataFetch.asInstanceOf[js.Any])
    if (qInterColumnSortOrder != null) __obj.updateDynamic("qInterColumnSortOrder")(qInterColumnSortOrder.asInstanceOf[js.Any])
    if (qMaxStackedCells != null) __obj.updateDynamic("qMaxStackedCells")(qMaxStackedCells.asInstanceOf[js.Any])
    if (qMeasures != null) __obj.updateDynamic("qMeasures")(qMeasures.asInstanceOf[js.Any])
    if (qMode != null) __obj.updateDynamic("qMode")(qMode.asInstanceOf[js.Any])
    if (qNoOfLeftDims != null) __obj.updateDynamic("qNoOfLeftDims")(qNoOfLeftDims.asInstanceOf[js.Any])
    if (!js.isUndefined(qPopulateMissing)) __obj.updateDynamic("qPopulateMissing")(qPopulateMissing.asInstanceOf[js.Any])
    if (!js.isUndefined(qShowTotalsAbove)) __obj.updateDynamic("qShowTotalsAbove")(qShowTotalsAbove.asInstanceOf[js.Any])
    if (qSortByYValue != null) __obj.updateDynamic("qSortByYValue")(qSortByYValue.asInstanceOf[js.Any])
    if (qStateName != null) __obj.updateDynamic("qStateName")(qStateName.asInstanceOf[js.Any])
    if (!js.isUndefined(qSuppressZero)) __obj.updateDynamic("qSuppressZero")(qSuppressZero.asInstanceOf[js.Any])
    if (!js.isUndefined(qSupressMissing)) __obj.updateDynamic("qSupressMissing")(qSupressMissing.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperCubeDef]
  }
}

