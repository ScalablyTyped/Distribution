package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnInfo extends js.Object {
  var qApprMaxGlyphCount: scala.Double
  var qAttrDimInfo: js.Array[NxAttrDimInfo]
  var qAttrExprInfo: js.Array[NxAttrExprInfo]
  var qCardinal: java.lang.String
  var qError: NxValidationError
  var qFallbackTitle: java.lang.String
  var qIsAutoFormat: scala.Boolean
  var qMax: scala.Double
  var qMin: scala.Double
  var qNumFormat: FieldAttributes
  var qReverseSort: scala.Boolean
  var qSortIndicator: qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.D
}

object ColumnInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: scala.Double,
    qAttrDimInfo: js.Array[NxAttrDimInfo],
    qAttrExprInfo: js.Array[NxAttrExprInfo],
    qCardinal: java.lang.String,
    qError: NxValidationError,
    qFallbackTitle: java.lang.String,
    qIsAutoFormat: scala.Boolean,
    qMax: scala.Double,
    qMin: scala.Double,
    qNumFormat: FieldAttributes,
    qReverseSort: scala.Boolean,
    qSortIndicator: qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.D
  ): ColumnInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount, qAttrDimInfo = qAttrDimInfo, qAttrExprInfo = qAttrExprInfo, qCardinal = qCardinal, qError = qError, qFallbackTitle = qFallbackTitle, qIsAutoFormat = qIsAutoFormat, qMax = qMax, qMin = qMin, qNumFormat = qNumFormat, qReverseSort = qReverseSort, qSortIndicator = qSortIndicator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnInfo]
  }
}

