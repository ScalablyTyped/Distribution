package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INxMeasureInfo extends js.Object {
  /**
    * Length of the longest value in the field.
    * Integer
    */
  var qApprMaxGlyphCount: scala.Double
  /**
    * List of attribute dimensions.
    */
  var qAttrDimInfo: js.Array[INxMeasureInfo]
  /**
    * List of attribute expressions.
    */
  var qAttrExprInfo: js.Array[INxAttrExprInfo]
  /**
    * Number of distinct field values.
    * Integer
    */
  var qCardinal: scala.Double
  /**
    * This parameter is optional. Gives information on the error.
    */
  var qError: INxValidationError
  /**
    * Corresponds to the label of the measure. If the label is not defined then the measure name is used.
    * String
    */
  var qFallbackTitle: java.lang.String
  /**
    * This parameter is set to true if qNumFormat is set to U (unknown).
    * The engine guesses the type of the field based on the field's expression.
    */
  var qIsAutoFormat: scala.Boolean
  /**
    * Highest value in the range.
    */
  var qMax: scala.Double
  /**
    * Lowest value in the range.
    */
  var qMin: scala.Double
  /**
    * Format of the field. This parameter is optional.
    * One of: N for no sorting, A for sorting ascending, D for sorting descending
    */
  var qNumFormat: IFieldAttributes
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: scala.Boolean
  /**
    * Sort indicator. This parameter is optional. The default value is no sorting.
    */
  var qSortIndicator: SortIndicatorType
}

object INxMeasureInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: scala.Double,
    qAttrDimInfo: js.Array[INxMeasureInfo],
    qAttrExprInfo: js.Array[INxAttrExprInfo],
    qCardinal: scala.Double,
    qError: INxValidationError,
    qFallbackTitle: java.lang.String,
    qIsAutoFormat: scala.Boolean,
    qMax: scala.Double,
    qMin: scala.Double,
    qNumFormat: IFieldAttributes,
    qReverseSort: scala.Boolean,
    qSortIndicator: SortIndicatorType
  ): INxMeasureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qApprMaxGlyphCount")(qApprMaxGlyphCount)
    __obj.updateDynamic("qAttrDimInfo")(qAttrDimInfo)
    __obj.updateDynamic("qAttrExprInfo")(qAttrExprInfo)
    __obj.updateDynamic("qCardinal")(qCardinal)
    __obj.updateDynamic("qError")(qError)
    __obj.updateDynamic("qFallbackTitle")(qFallbackTitle)
    __obj.updateDynamic("qIsAutoFormat")(qIsAutoFormat)
    __obj.updateDynamic("qMax")(qMax)
    __obj.updateDynamic("qMin")(qMin)
    __obj.updateDynamic("qNumFormat")(qNumFormat)
    __obj.updateDynamic("qReverseSort")(qReverseSort)
    __obj.updateDynamic("qSortIndicator")(qSortIndicator)
    __obj.asInstanceOf[INxMeasureInfo]
  }
}

