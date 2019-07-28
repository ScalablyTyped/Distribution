package typings.qlikDashEngineapi.EngineAPINs

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
  var qApprMaxGlyphCount: Double
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
  var qCardinal: Double
  /**
    * This parameter is optional. Gives information on the error.
    */
  var qError: js.UndefOr[INxValidationError] = js.undefined
  /**
    * Corresponds to the label of the measure. If the label is not defined then the measure name is used.
    * String
    */
  var qFallbackTitle: String
  /**
    * This parameter is set to true if qNumFormat is set to U (unknown). The engine guesses the type of the field based on the field's expression.
    */
  var qIsAutoFormat: Boolean
  /**
    * Highest value in the range.
    */
  var qMax: Double
  /**
    * Lowest value in the range.
    */
  var qMin: Double
  /**
    * Format of the field. This parameter is optional.
    * One of: N for no sorting, A for sorting ascending, D for sorting descending
    */
  var qNumFormat: js.UndefOr[IFieldAttributes] = js.undefined
  /**
    * If set to true, it inverts the sort criteria in the field.
    */
  var qReverseSort: Boolean
  /**
    * Sort indicator. This parameter is optional. The default value is no sorting.
    */
  var qSortIndicator: js.UndefOr[SortIndicatorType] = js.undefined
}

object INxMeasureInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: js.Array[INxMeasureInfo],
    qAttrExprInfo: js.Array[INxAttrExprInfo],
    qCardinal: Double,
    qFallbackTitle: String,
    qIsAutoFormat: Boolean,
    qMax: Double,
    qMin: Double,
    qReverseSort: Boolean,
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

