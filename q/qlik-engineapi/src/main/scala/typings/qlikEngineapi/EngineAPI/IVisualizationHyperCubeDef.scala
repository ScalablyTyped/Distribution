package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HyperCubeDef...
  */
@js.native
trait IVisualizationHyperCubeDef extends IHyperCubeDef {
  var customErrorMessage: ICustomErrorMessage = js.native
  @JSName("qDimensions")
  var qDimensions_IVisualizationHyperCubeDef: js.Array[IHyperCubeDimensionDef] = js.native
  var qLayoutExclude: js.Any = js.native
  @JSName("qMeasures")
  var qMeasures_IVisualizationHyperCubeDef: js.Array[IHyperCubeMeasureDef] = js.native
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
    qSuppressZero: Boolean
  ): IVisualizationHyperCubeDef = {
    val __obj = js.Dynamic.literal(customErrorMessage = customErrorMessage.asInstanceOf[js.Any], qAlwaysFullyExpanded = qAlwaysFullyExpanded.asInstanceOf[js.Any], qDimensions = qDimensions.asInstanceOf[js.Any], qIndentMode = qIndentMode.asInstanceOf[js.Any], qInitialDataFetch = qInitialDataFetch.asInstanceOf[js.Any], qInterColumnSortOrder = qInterColumnSortOrder.asInstanceOf[js.Any], qLayoutExclude = qLayoutExclude.asInstanceOf[js.Any], qMaxStackedCells = qMaxStackedCells.asInstanceOf[js.Any], qMeasures = qMeasures.asInstanceOf[js.Any], qMode = qMode.asInstanceOf[js.Any], qNoOfLeftDims = qNoOfLeftDims.asInstanceOf[js.Any], qPopulateMissing = qPopulateMissing.asInstanceOf[js.Any], qPseudoDimPos = qPseudoDimPos.asInstanceOf[js.Any], qReductionMode = qReductionMode.asInstanceOf[js.Any], qShowTotalsAbove = qShowTotalsAbove.asInstanceOf[js.Any], qSortbyYValue = qSortbyYValue.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any], qSuppressMissing = qSuppressMissing.asInstanceOf[js.Any], qSuppressZero = qSuppressZero.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVisualizationHyperCubeDef]
  }
  @scala.inline
  implicit class IVisualizationHyperCubeDefOps[Self <: IVisualizationHyperCubeDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomErrorMessage(value: ICustomErrorMessage): Self = this.set("customErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDimensionsVarargs(value: IHyperCubeDimensionDef*): Self = this.set("qDimensions", js.Array(value :_*))
    @scala.inline
    def setQDimensions(value: js.Array[IHyperCubeDimensionDef]): Self = this.set("qDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setQLayoutExclude(value: js.Any): Self = this.set("qLayoutExclude", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMeasuresVarargs(value: IHyperCubeMeasureDef*): Self = this.set("qMeasures", js.Array(value :_*))
    @scala.inline
    def setQMeasures(value: js.Array[IHyperCubeMeasureDef]): Self = this.set("qMeasures", value.asInstanceOf[js.Any])
  }
  
}

