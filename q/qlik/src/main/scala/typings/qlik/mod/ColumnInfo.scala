package typings.qlik.mod

import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.D
import typings.qlik.qlikStrings.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnInfo extends js.Object {
  var qApprMaxGlyphCount: Double
  var qAttrDimInfo: js.Array[NxAttrDimInfo]
  var qAttrExprInfo: js.Array[NxAttrExprInfo]
  var qCardinal: String
  var qError: NxValidationError
  var qFallbackTitle: String
  var qIsAutoFormat: Boolean
  var qMax: Double
  var qMin: Double
  var qNumFormat: FieldAttributes
  var qReverseSort: Boolean
  var qSortIndicator: N | A | D
}

object ColumnInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: js.Array[NxAttrDimInfo],
    qAttrExprInfo: js.Array[NxAttrExprInfo],
    qCardinal: String,
    qError: NxValidationError,
    qFallbackTitle: String,
    qIsAutoFormat: Boolean,
    qMax: Double,
    qMin: Double,
    qNumFormat: FieldAttributes,
    qReverseSort: Boolean,
    qSortIndicator: N | A | D
  ): ColumnInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qNumFormat = qNumFormat.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnInfo]
  }
}

