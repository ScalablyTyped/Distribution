package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Renders the properties of a hypercube. Is the layout for HyperCubeDef.
  * For more information about the definition of a hypercube, see Generic objects.
  *
  * Note: What is returned in HyperCube depends on the type of the hypercube
  *          (straight, pivot or stacked table) and on the method called
  *          (GetLayout, GetHyperCubeData, GetHyperCubePivotData, GetHyperCubeStackData).
  */
@js.native
trait IHyperCube extends js.Object {
  /**
    * Set of data.
    * Is empty if nothing has been defined in qInitialDataFetch in HyperCubeDef.
    */
  var qDataPages: js.Array[INxDataPage] = js.native
  /**
    * Information on the dimension.
    */
  var qDimensionInfo: js.Array[INxDimensionInfo] = js.native
  /**
    * Sort order of the columns in the hypercube.
    * Column numbers are separated by a comma.
    * Example: [1,0,2] means that the first column to be sorted was the column 1,
    * followed by the column 0 and the column 2.
    */
  var qEffectiveInterColumnSortOrder: js.Array[Double] = js.native
  /**
    * This parameter is optional and is displayed in case of error.
    */
  var qError: js.UndefOr[INxValidationError] = js.native
  /**
    * Aggregate for measures of all values in the field.
    * The result value depends on the qAggrFunc defined in HyperCubeDef.
    */
  var qGrandTotalRow: js.Array[INxCell] = js.native
  /**
    * ...
    */
  var qHasOtherValues: Boolean = js.native
  /**
    * Is used for pivot tables only.
    * If set to true, the formatting of the results is slightly different.
    * >> This property is optional.
    */
  var qIndentMode: js.UndefOr[Boolean] = js.native
  /**
    * Is used for pivot tables only.
    * Position of the last expended cell.
    * >> This property is optional.
    */
  var qLastExpandedPos: js.UndefOr[INxCellPosition] = js.native
  /**
    * Information on the measure.
    */
  var qMeasureInfo: js.Array[INxMeasureInfo] = js.native
  /**
    * Information about the mode of the visualization.
    */
  var qMode: NxHypercubeMode = js.native
  /**
    * Number of left dimensions
    * Default value is -1.
    * The index related to each left dimension depends on the position of the pseudo dimension (if any).
    * For example, a pivot table with:
    *
    * - 4 dimensions in the following order: Country, City, Product and Category
    * - one pseudo dimension in position 1
    * - 3 left dimensions.
    *
    * implies that:
    *
    * - The index 0 corresponds to the left dimension Country
    * - The index 1 corresponds to the pseudo dimension
    * - The index 2 corresponds to the left dimension City
    * - Product and Category are top dimensions.
    *
    * Another example:
    *
    * - 4 dimensions in the following order: Country, City, Product and Category
    * - one pseudo dimension in position -1
    * - 3 left dimensions.
    *
    * implies that:
    *
    * - The index -1 corresponds to the pseudo dimension; the pseudo dimension is the most to the right
    * - The index 0 corresponds to the left dimension Country
    * - The index 1 corresponds to the left dimension City
    * - The index 2 corresponds to the left dimension Product
    * - Category is a top dimension.
    */
  var qNoOfLeftDims: Double = js.native
  /**
    * Set of data for pivot tables.
    * Is empty if nothing has been defined in qInitialDataFetch in HyperCubeDef.
    */
  var qPivotDataPages: js.Array[INxPivotPage] = js.native
  /**
    * Defines the size of the hypercube.
    */
  var qSize: ISize = js.native
  /**
    * Set of data for stacked tables.
    * Is empty if nothing has been defined in qInitialDataFetch in HyperCubeDef.
    */
  var qStackedDataPages: js.Array[INxStackPage] = js.native
  /**
    * Name of the alternate state.
    * Default is current selections $.
    */
  var qStateName: String = js.native
}

object IHyperCube {
  @scala.inline
  def apply(
    qDataPages: js.Array[INxDataPage],
    qDimensionInfo: js.Array[INxDimensionInfo],
    qEffectiveInterColumnSortOrder: js.Array[Double],
    qGrandTotalRow: js.Array[INxCell],
    qHasOtherValues: Boolean,
    qMeasureInfo: js.Array[INxMeasureInfo],
    qMode: NxHypercubeMode,
    qNoOfLeftDims: Double,
    qPivotDataPages: js.Array[INxPivotPage],
    qSize: ISize,
    qStackedDataPages: js.Array[INxStackPage],
    qStateName: String
  ): IHyperCube = {
    val __obj = js.Dynamic.literal(qDataPages = qDataPages.asInstanceOf[js.Any], qDimensionInfo = qDimensionInfo.asInstanceOf[js.Any], qEffectiveInterColumnSortOrder = qEffectiveInterColumnSortOrder.asInstanceOf[js.Any], qGrandTotalRow = qGrandTotalRow.asInstanceOf[js.Any], qHasOtherValues = qHasOtherValues.asInstanceOf[js.Any], qMeasureInfo = qMeasureInfo.asInstanceOf[js.Any], qMode = qMode.asInstanceOf[js.Any], qNoOfLeftDims = qNoOfLeftDims.asInstanceOf[js.Any], qPivotDataPages = qPivotDataPages.asInstanceOf[js.Any], qSize = qSize.asInstanceOf[js.Any], qStackedDataPages = qStackedDataPages.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCube]
  }
  @scala.inline
  implicit class IHyperCubeOps[Self <: IHyperCube] (val x: Self) extends AnyVal {
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
    def setQDataPagesVarargs(value: INxDataPage*): Self = this.set("qDataPages", js.Array(value :_*))
    @scala.inline
    def setQDataPages(value: js.Array[INxDataPage]): Self = this.set("qDataPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setQDimensionInfoVarargs(value: INxDimensionInfo*): Self = this.set("qDimensionInfo", js.Array(value :_*))
    @scala.inline
    def setQDimensionInfo(value: js.Array[INxDimensionInfo]): Self = this.set("qDimensionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQEffectiveInterColumnSortOrderVarargs(value: Double*): Self = this.set("qEffectiveInterColumnSortOrder", js.Array(value :_*))
    @scala.inline
    def setQEffectiveInterColumnSortOrder(value: js.Array[Double]): Self = this.set("qEffectiveInterColumnSortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setQGrandTotalRowVarargs(value: INxCell*): Self = this.set("qGrandTotalRow", js.Array(value :_*))
    @scala.inline
    def setQGrandTotalRow(value: js.Array[INxCell]): Self = this.set("qGrandTotalRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setQHasOtherValues(value: Boolean): Self = this.set("qHasOtherValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMeasureInfoVarargs(value: INxMeasureInfo*): Self = this.set("qMeasureInfo", js.Array(value :_*))
    @scala.inline
    def setQMeasureInfo(value: js.Array[INxMeasureInfo]): Self = this.set("qMeasureInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQMode(value: NxHypercubeMode): Self = this.set("qMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNoOfLeftDims(value: Double): Self = this.set("qNoOfLeftDims", value.asInstanceOf[js.Any])
    @scala.inline
    def setQPivotDataPagesVarargs(value: INxPivotPage*): Self = this.set("qPivotDataPages", js.Array(value :_*))
    @scala.inline
    def setQPivotDataPages(value: js.Array[INxPivotPage]): Self = this.set("qPivotDataPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSize(value: ISize): Self = this.set("qSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setQStackedDataPagesVarargs(value: INxStackPage*): Self = this.set("qStackedDataPages", js.Array(value :_*))
    @scala.inline
    def setQStackedDataPages(value: js.Array[INxStackPage]): Self = this.set("qStackedDataPages", value.asInstanceOf[js.Any])
    @scala.inline
    def setQStateName(value: String): Self = this.set("qStateName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQError(value: INxValidationError): Self = this.set("qError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQError: Self = this.set("qError", js.undefined)
    @scala.inline
    def setQIndentMode(value: Boolean): Self = this.set("qIndentMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQIndentMode: Self = this.set("qIndentMode", js.undefined)
    @scala.inline
    def setQLastExpandedPos(value: INxCellPosition): Self = this.set("qLastExpandedPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQLastExpandedPos: Self = this.set("qLastExpandedPos", js.undefined)
  }
  
}

