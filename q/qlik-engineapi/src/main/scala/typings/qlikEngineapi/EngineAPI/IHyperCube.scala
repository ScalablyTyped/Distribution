package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Renders the properties of a hypercube. Is the layout for HyperCubeDef.
  * For more information about the definition of a hypercube, see Generic objects.
  *
  * Note: What is returned in HyperCube depends on the type of the hypercube
  *          (straight, pivot or stacked table) and on the method called
  *          (GetLayout, GetHyperCubeData, GetHyperCubePivotData, GetHyperCubeStackData).
  */
trait IHyperCube extends StObject {
  
  /**
    * Set of data.
    * Is empty if nothing has been defined in qInitialDataFetch in HyperCubeDef.
    */
  var qDataPages: js.Array[INxDataPage]
  
  /**
    * Information on the dimension.
    */
  var qDimensionInfo: js.Array[INxDimensionInfo]
  
  /**
    * Sort order of the columns in the hypercube.
    * Column numbers are separated by a comma.
    * Example: [1,0,2] means that the first column to be sorted was the column 1,
    * followed by the column 0 and the column 2.
    */
  var qEffectiveInterColumnSortOrder: js.Array[Double]
  
  /**
    * This parameter is optional and is displayed in case of error.
    */
  var qError: js.UndefOr[INxValidationError] = js.undefined
  
  /**
    * Aggregate for measures of all values in the field.
    * The result value depends on the qAggrFunc defined in HyperCubeDef.
    */
  var qGrandTotalRow: js.Array[INxCell]
  
  /**
    * ...
    */
  var qHasOtherValues: Boolean
  
  /**
    * Is used for pivot tables only.
    * If set to true, the formatting of the results is slightly different.
    * >> This property is optional.
    */
  var qIndentMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Is used for pivot tables only.
    * Position of the last expended cell.
    * >> This property is optional.
    */
  var qLastExpandedPos: js.UndefOr[INxCellPosition] = js.undefined
  
  /**
    * Information on the measure.
    */
  var qMeasureInfo: js.Array[INxMeasureInfo]
  
  /**
    * Information about the mode of the visualization.
    */
  var qMode: NxHypercubeMode
  
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
  var qNoOfLeftDims: Double
  
  /**
    * Set of data for pivot tables.
    * Is empty if nothing has been defined in qInitialDataFetch in HyperCubeDef.
    */
  var qPivotDataPages: js.Array[INxPivotPage]
  
  /**
    * Defines the size of the hypercube.
    */
  var qSize: ISize
  
  /**
    * Set of data for stacked tables.
    * Is empty if nothing has been defined in qInitialDataFetch in HyperCubeDef.
    */
  var qStackedDataPages: js.Array[INxStackPage]
  
  /**
    * Name of the alternate state.
    * Default is current selections $.
    */
  var qStateName: String
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
  implicit class IHyperCubeMutableBuilder[Self <: IHyperCube] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQDataPages(value: js.Array[INxDataPage]): Self = StObject.set(x, "qDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDataPagesVarargs(value: INxDataPage*): Self = StObject.set(x, "qDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQDimensionInfo(value: js.Array[INxDimensionInfo]): Self = StObject.set(x, "qDimensionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDimensionInfoVarargs(value: INxDimensionInfo*): Self = StObject.set(x, "qDimensionInfo", js.Array(value :_*))
    
    @scala.inline
    def setQEffectiveInterColumnSortOrder(value: js.Array[Double]): Self = StObject.set(x, "qEffectiveInterColumnSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQEffectiveInterColumnSortOrderVarargs(value: Double*): Self = StObject.set(x, "qEffectiveInterColumnSortOrder", js.Array(value :_*))
    
    @scala.inline
    def setQError(value: INxValidationError): Self = StObject.set(x, "qError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorUndefined: Self = StObject.set(x, "qError", js.undefined)
    
    @scala.inline
    def setQGrandTotalRow(value: js.Array[INxCell]): Self = StObject.set(x, "qGrandTotalRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQGrandTotalRowVarargs(value: INxCell*): Self = StObject.set(x, "qGrandTotalRow", js.Array(value :_*))
    
    @scala.inline
    def setQHasOtherValues(value: Boolean): Self = StObject.set(x, "qHasOtherValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIndentMode(value: Boolean): Self = StObject.set(x, "qIndentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIndentModeUndefined: Self = StObject.set(x, "qIndentMode", js.undefined)
    
    @scala.inline
    def setQLastExpandedPos(value: INxCellPosition): Self = StObject.set(x, "qLastExpandedPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLastExpandedPosUndefined: Self = StObject.set(x, "qLastExpandedPos", js.undefined)
    
    @scala.inline
    def setQMeasureInfo(value: js.Array[INxMeasureInfo]): Self = StObject.set(x, "qMeasureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeasureInfoVarargs(value: INxMeasureInfo*): Self = StObject.set(x, "qMeasureInfo", js.Array(value :_*))
    
    @scala.inline
    def setQMode(value: NxHypercubeMode): Self = StObject.set(x, "qMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNoOfLeftDims(value: Double): Self = StObject.set(x, "qNoOfLeftDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPivotDataPages(value: js.Array[INxPivotPage]): Self = StObject.set(x, "qPivotDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPivotDataPagesVarargs(value: INxPivotPage*): Self = StObject.set(x, "qPivotDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQSize(value: ISize): Self = StObject.set(x, "qSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStackedDataPages(value: js.Array[INxStackPage]): Self = StObject.set(x, "qStackedDataPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStackedDataPagesVarargs(value: INxStackPage*): Self = StObject.set(x, "qStackedDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
  }
}
