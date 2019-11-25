package typings.qlikDashVisualizationextensions.BackendAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxDimensionInfo extends js.Object {
  /**
    * Length of the longest value in the field.
    * Integer
    */
  var qApprMaxGlyphCount: Double
  /**
    * Array of attribute dimensions.
    * Array of NxAttrDimInfo
    */
  var qAttrDimInfo: INxAttrDimInfo
  /**
    * Array of attribute expressions.
    * Array of NxAttrExprInfo
    */
  var qAttrExprInfo: INxAttrExprInfo
  /**
    * Number of distinct field values.
    * Integer
    */
  var qCardinal: Double
  /**
    * Is continuous axis used.
    * Boolean
    */
  var qContinuousAxes: Boolean
  /**
    * Is derived field is used as a dimension.
    * Boolean
    */
  var qDerivedField: Boolean
  /**
    * Binary format of the field.
    * One of:
    *       # D for discrete (String)
    *       # N for numeric (Double)
    *       # T for Time (Timestamp)
    */
  var qDimensionType: DimensionType
  /**
    * This parameter is optional.
    * Gives information on the error.
    * Null or NxValidationError
    */
  var qError: INxValidationError
  /**
    * Corresponds to the label of the dimension that is selected.
    * If the label is not defined then the field name is used.
    * String
    */
  var qFallbackTitle: String
  /**
    * Array of dimension labels.
    * Contains the labels of all dimensions in a hierarchy group
    * (for example the labels of all dimensions in a drill down group).
    * Array of String
    */
  var qGroupFallbackTitles: js.Array[String]
  /**
    * Array of field names.
    * Array of String
    */
  var qGroupFieldDefs: js.Array[String]
  /**
    * Index of the dimension that is currently in use.
    * qGroupPos is set to 0 if there are no hierarchical groups (drill-down groups) or cycle groups.
    * Integer
    */
  var qGroupPos: Double
  /**
    * Defines the grouping.
    * One of:
    *       # N for no grouping
    *       # H for drill-down
    *       # C for cyclic
    */
  var qGrouping: GroupingType
  /**
    * This parameter is set to true if qNumFormat is set to U (unknown).
    * The engine guesses the type of the field based on the field's definition.
    * Boolean
    */
  var qIsAutoFormat: Boolean
  /**
    * Is a cyclic dimension used.
    * Boolean
    */
  var qIsCyclic: Boolean
  /**
    * If set to true, it means that the field is a semantic.
    * Boolean
    */
  var qIsSemantic: Boolean
  /**
    * Is set to true if the field is locked.
    * Boolean
    */
  var qLocked: Boolean
  /**
    * Maximum value.
    * Double
    */
  var qMax: Double
  /**
    * Minimum value.
    * Double
    */
  var qMin: Double
  /**
    * Format of the field.
    * This parameter is optional.
    * FieldAttributes
    */
  var qNumFormat: FieldAttributesType
  /**
    * If set to true, it inverts the sort criteria in the field.
    * Boolean
    */
  var qReverseSort: Boolean
  /**
    * Sort indicator.
    * This parameter is optional.
    * The default value is no sorting.
    * One of:
    *       # N for no sorting
    *       # A for sorting ascending
    *       # D for sorting descending
    */
  var qSortIndicator: SortIndicatorType
  /**
    * Number of values in a particular state.
    * NxStateCounts
    */
  var qStateCounts: INxStateCounts
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    * Array of String
    */
  var qTags: js.Array[String]
}

object INxDimensionInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: INxAttrDimInfo,
    qAttrExprInfo: INxAttrExprInfo,
    qCardinal: Double,
    qContinuousAxes: Boolean,
    qDerivedField: Boolean,
    qDimensionType: DimensionType,
    qError: INxValidationError,
    qFallbackTitle: String,
    qGroupFallbackTitles: js.Array[String],
    qGroupFieldDefs: js.Array[String],
    qGroupPos: Double,
    qGrouping: GroupingType,
    qIsAutoFormat: Boolean,
    qIsCyclic: Boolean,
    qIsSemantic: Boolean,
    qLocked: Boolean,
    qMax: Double,
    qMin: Double,
    qNumFormat: FieldAttributesType,
    qReverseSort: Boolean,
    qSortIndicator: SortIndicatorType,
    qStateCounts: INxStateCounts,
    qTags: js.Array[String]
  ): INxDimensionInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qDerivedField = qDerivedField.asInstanceOf[js.Any], qDimensionType = qDimensionType.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qGroupFallbackTitles = qGroupFallbackTitles.asInstanceOf[js.Any], qGroupFieldDefs = qGroupFieldDefs.asInstanceOf[js.Any], qGroupPos = qGroupPos.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qLocked = qLocked.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qNumFormat = qNumFormat.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxDimensionInfo]
  }
}

