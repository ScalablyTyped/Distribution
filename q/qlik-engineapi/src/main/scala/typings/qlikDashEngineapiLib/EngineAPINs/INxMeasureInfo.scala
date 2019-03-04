package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxMeasureInfo...
  */
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
  var qError: js.UndefOr[INxValidationError] = js.undefined
  /**
    * Corresponds to the label of the measure. If the label is not defined then the measure name is used.
    * String
    */
  var qFallbackTitle: java.lang.String
  /**
    * This parameter is set to true if qNumFormat is set to U (unknown). The engine guesses the type of the field based on the field's expression.
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
  var qNumFormat: js.UndefOr[IFieldAttributes] = js.undefined
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: scala.Boolean
  /**
    * Sort indicator. This parameter is optional. The default value is no sorting.
    */
  var qSortIndicator: js.UndefOr[SortIndicatorType] = js.undefined
}

object INxMeasureInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: scala.Double,
    qAttrDimInfo: js.Array[INxMeasureInfo],
    qAttrExprInfo: js.Array[INxAttrExprInfo],
    qCardinal: scala.Double,
    qFallbackTitle: java.lang.String,
    qIsAutoFormat: scala.Boolean,
    qMax: scala.Double,
    qMin: scala.Double,
    qReverseSort: scala.Boolean,
    qError: INxValidationError = null,
    qNumFormat: IFieldAttributes = null,
    qSortIndicator: SortIndicatorType = null
  ): INxMeasureInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount, qAttrDimInfo = qAttrDimInfo, qAttrExprInfo = qAttrExprInfo, qCardinal = qCardinal, qFallbackTitle = qFallbackTitle, qIsAutoFormat = qIsAutoFormat, qMax = qMax, qMin = qMin, qReverseSort = qReverseSort)
    if (qError != null) __obj.updateDynamic("qError")(qError)
    if (qNumFormat != null) __obj.updateDynamic("qNumFormat")(qNumFormat)
    if (qSortIndicator != null) __obj.updateDynamic("qSortIndicator")(qSortIndicator)
    __obj.asInstanceOf[INxMeasureInfo]
  }
}

