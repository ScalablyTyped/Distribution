package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HyperCubeDef...
  */
trait IVisualizationHyperCubeDef extends IHyperCubeDef {
  var customErrorMessage: ICustomErrorMessage
  @JSName("qDimensions")
  var qDimensions_IVisualizationHyperCubeDef: js.Array[IHyperCubeDimensionDef]
  var qLayoutExclude: js.Any
  @JSName("qMeasures")
  var qMeasures_IVisualizationHyperCubeDef: js.Array[IHyperCubeMeasureDef]
}

object IVisualizationHyperCubeDef {
  @scala.inline
  def apply(
    customErrorMessage: ICustomErrorMessage,
    qAlwaysFullyExpanded: scala.Boolean,
    qDimensions: js.Array[IHyperCubeDimensionDef],
    qIndentMode: scala.Boolean,
    qInitialDataFetch: js.Array[INxPage],
    qInterColumnSortOrder: js.Array[scala.Double],
    qLayoutExclude: js.Any,
    qMaxStackedCells: scala.Double,
    qMeasures: js.Array[IHyperCubeMeasureDef],
    qMode: NxHypercubeMode,
    qNoOfLeftDims: scala.Double,
    qPopulateMissing: scala.Boolean,
    qPseudoDimPos: scala.Double,
    qReductionMode: ReductionModeType,
    qShowTotalsAbove: scala.Boolean,
    qSortbyYValue: java.lang.String,
    qStateName: java.lang.String,
    qSuppressMissing: scala.Boolean,
    qSuppressZero: scala.Boolean,
    qCalcCond: IValueExpr = null
  ): IVisualizationHyperCubeDef = {
    val __obj = js.Dynamic.literal(customErrorMessage = customErrorMessage, qAlwaysFullyExpanded = qAlwaysFullyExpanded, qDimensions = qDimensions, qIndentMode = qIndentMode, qInitialDataFetch = qInitialDataFetch, qInterColumnSortOrder = qInterColumnSortOrder, qLayoutExclude = qLayoutExclude, qMaxStackedCells = qMaxStackedCells, qMeasures = qMeasures, qMode = qMode, qNoOfLeftDims = qNoOfLeftDims, qPopulateMissing = qPopulateMissing, qPseudoDimPos = qPseudoDimPos, qReductionMode = qReductionMode, qShowTotalsAbove = qShowTotalsAbove, qSortbyYValue = qSortbyYValue, qStateName = qStateName, qSuppressMissing = qSuppressMissing, qSuppressZero = qSuppressZero)
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond)
    __obj.asInstanceOf[IVisualizationHyperCubeDef]
  }
}

