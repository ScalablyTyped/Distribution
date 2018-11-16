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

