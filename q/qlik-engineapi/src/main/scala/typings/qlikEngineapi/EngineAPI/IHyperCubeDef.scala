package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HyperCubeDef...
  */
@js.native
trait IHyperCubeDef extends StObject {
  
  /**
    * If this property is set to true, the cells are always expanded.
    * It implies that it is not possible to collapse any cells.
    * >> The default value is false.
    */
  var qAlwaysFullyExpanded: Boolean = js.native
  
  /**
    * Specifies a calculation condition, which must be fulfilled for the hypercube to be (re)calculated.
    * As long as the condition is not met, the engine does not perform a new calculation.
    * This property is optional. By default, there is no calculation condition.
    */
  var qCalcCond: js.UndefOr[IValueExpr] = js.native
  
  /**
    * Array of dimensions.
    */
  var qDimensions: js.Array[INxDimension] = js.native
  
  /**
    * This property applies for pivot tables and allows to change the layout of the table.
    * An indentation is added to the beginning of each row.
    * >> The default value is false.
    */
  var qIndentMode: Boolean = js.native
  
  /**
    * Initial data set.
    */
  var qInitialDataFetch: js.Array[INxPage] = js.native
  
  /**
    * Defines the sort order of the columns in the hypercube.
    * Column numbers are separated by a comma.
    * Example: [1,0,2] means that the first column to be sorted should be the column 1,
    * followed by the column 0 and the column 2.
    * The default sort order is the order in which the dimensions and measures have been
    * defined in the hypercube. By default, the pseudo-dimension (if any) is the most to the right in the array.
    * The index of the pseudo-dimension (if any) is -1.
    * Pseudo dimensions only apply for pivot tables with more than one measure.
    * A pseudo dimension groups together the measures defined in a pivot table.
    * You can neither collapse/expand a pseudo dimension nor make any selections in it.
    * Stacked pivot tables can only contain one measure.
    */
  var qInterColumnSortOrder: js.Array[Double] = js.native
  
  /**
    * Maximum number of cells for an initial data fetch (set in qInitialDataFetch) when in stacked mode (qMode is K).
    * >> The default value is 5000.
    */
  var qMaxStackedCells: Double = js.native
  
  /**
    * Array of measures.
    */
  var qMeasures: js.Array[INxMeasure] = js.native
  
  /**
    * Defines the way the data are handled internally by the engine.
    * Default value is DATA_MODE_STRAIGHT.
    * A pivot table can contain several dimensions and measures whereas a stacked pivot
    * table can contain several dimensions but only one measure.
    */
  var qMode: NxHypercubeMode = js.native
  
  /**
    * Number of left dimensions.
    * Default value is -1. In that case, all dimensions are left dimensions.
    * The index related to each left dimension depends on the position of the pseudo dimension (if any).
    *
    * For example, a pivot table with:
    *
    * - 4 dimensions in the following order: Country, City, Product and Category
    * - one pseudo dimension in position 1 (the position is defined in qInterColumnSortOrder)
    *   qInterColumnSortOrder is (0,-1,1,2,3)
    * - 3 left dimensions (qNoOfLeftDims is set to 3).
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
    * - 3 left dimensions (qNoOfLeftDims is set to 3).
    * - one pseudo dimension
    * - the property qInterColumnSortOrder is left empty.
    *
    * implies that:
    *
    * - The index 0 corresponds to the left dimension Country
    * - The index 1 corresponds to the left dimension City
    * - The index 2 corresponds to the left dimension Product
    * - Category is a top dimension.
    * - The pseudo dimension is a top dimension
    */
  var qNoOfLeftDims: Double = js.native
  
  /**
    * If this property is set to true, the missing symbols (if any) are replaced by 0 if the value is a numeric
    * and by an empty string if the value is a string.
    * >> The default value is false.
    */
  var qPopulateMissing: Boolean = js.native
  
  var qPseudoDimPos: Double = js.native
  
  // ?Dokufehler
  var qReductionMode: ReductionModeType = js.native
  
  /**
    * If set to true, the total (if any) is shown on the first row.
    * >> The default value is false.
    */
  var qShowTotalsAbove: Boolean = js.native
  
  /**
    * To enable the sorting by ascending or descending order in the values of a measure.
    * This property applies to pivot tables and stacked pivot tables.
    * In the case of a pivot table, the measure or pseudo dimension should be defined as a top dimension.
    * The sorting is restricted to the values of the first measure in a pivot table.
    */
  var qSortbyYValue: String = js.native
  
  /**
    * Name of the alternate state.
    * Default is current selections $.
    */
  var qStateName: String = js.native
  
  /**
    * Removes missing values.
    */
  var qSuppressMissing: Boolean = js.native
  
  /**
    * Removes zero values.
    */
  var qSuppressZero: Boolean = js.native
}
object IHyperCubeDef {
  
  @scala.inline
  def apply(
    qAlwaysFullyExpanded: Boolean,
    qDimensions: js.Array[INxDimension],
    qIndentMode: Boolean,
    qInitialDataFetch: js.Array[INxPage],
    qInterColumnSortOrder: js.Array[Double],
    qMaxStackedCells: Double,
    qMeasures: js.Array[INxMeasure],
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
  ): IHyperCubeDef = {
    val __obj = js.Dynamic.literal(qAlwaysFullyExpanded = qAlwaysFullyExpanded.asInstanceOf[js.Any], qDimensions = qDimensions.asInstanceOf[js.Any], qIndentMode = qIndentMode.asInstanceOf[js.Any], qInitialDataFetch = qInitialDataFetch.asInstanceOf[js.Any], qInterColumnSortOrder = qInterColumnSortOrder.asInstanceOf[js.Any], qMaxStackedCells = qMaxStackedCells.asInstanceOf[js.Any], qMeasures = qMeasures.asInstanceOf[js.Any], qMode = qMode.asInstanceOf[js.Any], qNoOfLeftDims = qNoOfLeftDims.asInstanceOf[js.Any], qPopulateMissing = qPopulateMissing.asInstanceOf[js.Any], qPseudoDimPos = qPseudoDimPos.asInstanceOf[js.Any], qReductionMode = qReductionMode.asInstanceOf[js.Any], qShowTotalsAbove = qShowTotalsAbove.asInstanceOf[js.Any], qSortbyYValue = qSortbyYValue.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any], qSuppressMissing = qSuppressMissing.asInstanceOf[js.Any], qSuppressZero = qSuppressZero.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHyperCubeDef]
  }
  
  @scala.inline
  implicit class IHyperCubeDefMutableBuilder[Self <: IHyperCubeDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAlwaysFullyExpanded(value: Boolean): Self = StObject.set(x, "qAlwaysFullyExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCalcCond(value: IValueExpr): Self = StObject.set(x, "qCalcCond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCalcCondUndefined: Self = StObject.set(x, "qCalcCond", js.undefined)
    
    @scala.inline
    def setQDimensions(value: js.Array[INxDimension]): Self = StObject.set(x, "qDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDimensionsVarargs(value: INxDimension*): Self = StObject.set(x, "qDimensions", js.Array(value :_*))
    
    @scala.inline
    def setQIndentMode(value: Boolean): Self = StObject.set(x, "qIndentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInitialDataFetch(value: js.Array[INxPage]): Self = StObject.set(x, "qInitialDataFetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInitialDataFetchVarargs(value: INxPage*): Self = StObject.set(x, "qInitialDataFetch", js.Array(value :_*))
    
    @scala.inline
    def setQInterColumnSortOrder(value: js.Array[Double]): Self = StObject.set(x, "qInterColumnSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInterColumnSortOrderVarargs(value: Double*): Self = StObject.set(x, "qInterColumnSortOrder", js.Array(value :_*))
    
    @scala.inline
    def setQMaxStackedCells(value: Double): Self = StObject.set(x, "qMaxStackedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeasures(value: js.Array[INxMeasure]): Self = StObject.set(x, "qMeasures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeasuresVarargs(value: INxMeasure*): Self = StObject.set(x, "qMeasures", js.Array(value :_*))
    
    @scala.inline
    def setQMode(value: NxHypercubeMode): Self = StObject.set(x, "qMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNoOfLeftDims(value: Double): Self = StObject.set(x, "qNoOfLeftDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPopulateMissing(value: Boolean): Self = StObject.set(x, "qPopulateMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPseudoDimPos(value: Double): Self = StObject.set(x, "qPseudoDimPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReductionMode(value: ReductionModeType): Self = StObject.set(x, "qReductionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowTotalsAbove(value: Boolean): Self = StObject.set(x, "qShowTotalsAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortbyYValue(value: String): Self = StObject.set(x, "qSortbyYValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSuppressMissing(value: Boolean): Self = StObject.set(x, "qSuppressMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSuppressZero(value: Boolean): Self = StObject.set(x, "qSuppressZero", value.asInstanceOf[js.Any])
  }
}
