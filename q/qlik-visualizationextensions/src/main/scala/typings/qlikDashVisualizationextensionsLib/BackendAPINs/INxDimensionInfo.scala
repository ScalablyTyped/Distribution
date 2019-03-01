package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxDimensionInfo extends js.Object {
  /**
    * Length of the longest value in the field.
    * Integer
    */
  var qApprMaxGlyphCount: scala.Double
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
  var qCardinal: scala.Double
  /**
    * Is continuous axis used.
    * Boolean
    */
  var qContinuousAxes: scala.Boolean
  /**
    * Is derived field is used as a dimension.
    * Boolean
    */
  var qDerivedField: scala.Boolean
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
  var qFallbackTitle: java.lang.String
  /**
    * Array of dimension labels.
    * Contains the labels of all dimensions in a hierarchy group
    * (for example the labels of all dimensions in a drill down group).
    * Array of String
    */
  var qGroupFallbackTitles: js.Array[java.lang.String]
  /**
    * Array of field names.
    * Array of String
    */
  var qGroupFieldDefs: js.Array[java.lang.String]
  /**
    * Index of the dimension that is currently in use.
    * qGroupPos is set to 0 if there are no hierarchical groups (drill-down groups) or cycle groups.
    * Integer
    */
  var qGroupPos: scala.Double
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
  var qIsAutoFormat: scala.Boolean
  /**
    * Is a cyclic dimension used.
    * Boolean
    */
  var qIsCyclic: scala.Boolean
  /**
    * If set to true, it means that the field is a semantic.
    * Boolean
    */
  var qIsSemantic: scala.Boolean
  /**
    * Is set to true if the field is locked.
    * Boolean
    */
  var qLocked: scala.Boolean
  /**
    * Maximum value.
    * Double
    */
  var qMax: scala.Double
  /**
    * Minimum value.
    * Double
    */
  var qMin: scala.Double
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
  var qReverseSort: scala.Boolean
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
  var qTags: js.Array[java.lang.String]
}

object INxDimensionInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: scala.Double,
    qAttrDimInfo: INxAttrDimInfo,
    qAttrExprInfo: INxAttrExprInfo,
    qCardinal: scala.Double,
    qContinuousAxes: scala.Boolean,
    qDerivedField: scala.Boolean,
    qDimensionType: DimensionType,
    qError: INxValidationError,
    qFallbackTitle: java.lang.String,
    qGroupFallbackTitles: js.Array[java.lang.String],
    qGroupFieldDefs: js.Array[java.lang.String],
    qGroupPos: scala.Double,
    qGrouping: GroupingType,
    qIsAutoFormat: scala.Boolean,
    qIsCyclic: scala.Boolean,
    qIsSemantic: scala.Boolean,
    qLocked: scala.Boolean,
    qMax: scala.Double,
    qMin: scala.Double,
    qNumFormat: FieldAttributesType,
    qReverseSort: scala.Boolean,
    qSortIndicator: SortIndicatorType,
    qStateCounts: INxStateCounts,
    qTags: js.Array[java.lang.String]
  ): INxDimensionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qApprMaxGlyphCount")(qApprMaxGlyphCount)
    __obj.updateDynamic("qAttrDimInfo")(qAttrDimInfo)
    __obj.updateDynamic("qAttrExprInfo")(qAttrExprInfo)
    __obj.updateDynamic("qCardinal")(qCardinal)
    __obj.updateDynamic("qContinuousAxes")(qContinuousAxes)
    __obj.updateDynamic("qDerivedField")(qDerivedField)
    __obj.updateDynamic("qDimensionType")(qDimensionType)
    __obj.updateDynamic("qError")(qError)
    __obj.updateDynamic("qFallbackTitle")(qFallbackTitle)
    __obj.updateDynamic("qGroupFallbackTitles")(qGroupFallbackTitles)
    __obj.updateDynamic("qGroupFieldDefs")(qGroupFieldDefs)
    __obj.updateDynamic("qGroupPos")(qGroupPos)
    __obj.updateDynamic("qGrouping")(qGrouping)
    __obj.updateDynamic("qIsAutoFormat")(qIsAutoFormat)
    __obj.updateDynamic("qIsCyclic")(qIsCyclic)
    __obj.updateDynamic("qIsSemantic")(qIsSemantic)
    __obj.updateDynamic("qLocked")(qLocked)
    __obj.updateDynamic("qMax")(qMax)
    __obj.updateDynamic("qMin")(qMin)
    __obj.updateDynamic("qNumFormat")(qNumFormat)
    __obj.updateDynamic("qReverseSort")(qReverseSort)
    __obj.updateDynamic("qSortIndicator")(qSortIndicator)
    __obj.updateDynamic("qStateCounts")(qStateCounts)
    __obj.updateDynamic("qTags")(qTags)
    __obj.asInstanceOf[INxDimensionInfo]
  }
}

