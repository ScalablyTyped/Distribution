package typings.qlikDashEngineapi.EngineAPI

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
    qAlwaysFullyExpanded: Boolean,
    qDimensions: js.Array[IHyperCubeDimensionDef],
    qIndentMode: Boolean,
    qInitialDataFetch: js.Array[INxPage],
    qInterColumnSortOrder: js.Array[Double],
    qLayoutExclude: js.Any,
    qMaxStackedCells: Double,
    qMeasures: js.Array[IHyperCubeMeasureDef],
    qMode: NxHypercubeMode,
    qNoOfLeftDims: Double,
    qPopulateMissing: Boolean,
    qPseudoDimPos: Double,
    qReductionMode: ReductionModeType,
    qShowTotalsAbove: Boolean,
    qSortbyYValue: String,
    qStateName: String,
    qSuppressMissing: Boolean,
    qSuppressZero: Boolean,
    qCalcCond: IValueExpr = null
  ): IVisualizationHyperCubeDef = {
    val __obj = js.Dynamic.literal(customErrorMessage = customErrorMessage, qAlwaysFullyExpanded = qAlwaysFullyExpanded, qDimensions = qDimensions, qIndentMode = qIndentMode, qInitialDataFetch = qInitialDataFetch, qInterColumnSortOrder = qInterColumnSortOrder, qLayoutExclude = qLayoutExclude, qMaxStackedCells = qMaxStackedCells, qMeasures = qMeasures, qMode = qMode, qNoOfLeftDims = qNoOfLeftDims, qPopulateMissing = qPopulateMissing, qPseudoDimPos = qPseudoDimPos, qReductionMode = qReductionMode, qShowTotalsAbove = qShowTotalsAbove, qSortbyYValue = qSortbyYValue, qStateName = qStateName, qSuppressMissing = qSuppressMissing, qSuppressZero = qSuppressZero)
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond)
    __obj.asInstanceOf[IVisualizationHyperCubeDef]
  }
}

