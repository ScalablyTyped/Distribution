package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxDimensionInfo extends ColumnInfo {
  var qContinuousAxes: scala.Boolean
  var qDerivedField: scala.Boolean
  var qDimensionType: qlikLib.qlikLibStrings.D | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T
  var qGroupFallbackTitles: js.Array[java.lang.String]
  var qGroupFieldDefs: js.Array[java.lang.String]
  var qGroupPos: scala.Double
  var qGrouping: qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.H | qlikLib.qlikLibStrings.C
  var qIsCyclic: scala.Boolean
  var qIsSemantic: scala.Boolean
  var qLocker: java.lang.String
  var qStateCounts: NxStateCounts
  var qTags: js.Array[java.lang.String]
}

object NxDimensionInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: scala.Double,
    qAttrDimInfo: js.Array[NxAttrDimInfo],
    qAttrExprInfo: js.Array[NxAttrExprInfo],
    qCardinal: java.lang.String,
    qContinuousAxes: scala.Boolean,
    qDerivedField: scala.Boolean,
    qDimensionType: qlikLib.qlikLibStrings.D | qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.T,
    qError: NxValidationError,
    qFallbackTitle: java.lang.String,
    qGroupFallbackTitles: js.Array[java.lang.String],
    qGroupFieldDefs: js.Array[java.lang.String],
    qGroupPos: scala.Double,
    qGrouping: qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.H | qlikLib.qlikLibStrings.C,
    qIsAutoFormat: scala.Boolean,
    qIsCyclic: scala.Boolean,
    qIsSemantic: scala.Boolean,
    qLocker: java.lang.String,
    qMax: scala.Double,
    qMin: scala.Double,
    qNumFormat: FieldAttributes,
    qReverseSort: scala.Boolean,
    qSortIndicator: qlikLib.qlikLibStrings.N | qlikLib.qlikLibStrings.A | qlikLib.qlikLibStrings.D,
    qStateCounts: NxStateCounts,
    qTags: js.Array[java.lang.String]
  ): NxDimensionInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount, qAttrDimInfo = qAttrDimInfo, qAttrExprInfo = qAttrExprInfo, qCardinal = qCardinal, qContinuousAxes = qContinuousAxes, qDerivedField = qDerivedField, qDimensionType = qDimensionType.asInstanceOf[js.Any], qError = qError, qFallbackTitle = qFallbackTitle, qGroupFallbackTitles = qGroupFallbackTitles, qGroupFieldDefs = qGroupFieldDefs, qGroupPos = qGroupPos, qGrouping = qGrouping.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat, qIsCyclic = qIsCyclic, qIsSemantic = qIsSemantic, qLocker = qLocker, qMax = qMax, qMin = qMin, qNumFormat = qNumFormat, qReverseSort = qReverseSort, qSortIndicator = qSortIndicator.asInstanceOf[js.Any], qStateCounts = qStateCounts, qTags = qTags)
  
    __obj.asInstanceOf[NxDimensionInfo]
  }
}

