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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("customErrorMessage")(customErrorMessage)
    __obj.updateDynamic("qAlwaysFullyExpanded")(qAlwaysFullyExpanded)
    __obj.updateDynamic("qDimensions")(qDimensions)
    __obj.updateDynamic("qIndentMode")(qIndentMode)
    __obj.updateDynamic("qInitialDataFetch")(qInitialDataFetch)
    __obj.updateDynamic("qInterColumnSortOrder")(qInterColumnSortOrder)
    __obj.updateDynamic("qLayoutExclude")(qLayoutExclude)
    __obj.updateDynamic("qMaxStackedCells")(qMaxStackedCells)
    __obj.updateDynamic("qMeasures")(qMeasures)
    __obj.updateDynamic("qMode")(qMode)
    __obj.updateDynamic("qNoOfLeftDims")(qNoOfLeftDims)
    __obj.updateDynamic("qPopulateMissing")(qPopulateMissing)
    __obj.updateDynamic("qPseudoDimPos")(qPseudoDimPos)
    __obj.updateDynamic("qReductionMode")(qReductionMode)
    __obj.updateDynamic("qShowTotalsAbove")(qShowTotalsAbove)
    __obj.updateDynamic("qSortbyYValue")(qSortbyYValue)
    __obj.updateDynamic("qStateName")(qStateName)
    __obj.updateDynamic("qSuppressMissing")(qSuppressMissing)
    __obj.updateDynamic("qSuppressZero")(qSuppressZero)
    if (qCalcCond != null) __obj.updateDynamic("qCalcCond")(qCalcCond)
    __obj.asInstanceOf[IVisualizationHyperCubeDef]
  }
}

