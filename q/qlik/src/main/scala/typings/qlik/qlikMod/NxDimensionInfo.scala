package typings.qlik.qlikMod

import typings.qlik.qlikStrings.A
import typings.qlik.qlikStrings.C
import typings.qlik.qlikStrings.D
import typings.qlik.qlikStrings.H
import typings.qlik.qlikStrings.N
import typings.qlik.qlikStrings.T
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxDimensionInfo extends ColumnInfo {
  var qContinuousAxes: Boolean
  var qDerivedField: Boolean
  var qDimensionType: D | N | T
  var qGroupFallbackTitles: js.Array[String]
  var qGroupFieldDefs: js.Array[String]
  var qGroupPos: Double
  var qGrouping: N | H | C
  var qIsCyclic: Boolean
  var qIsSemantic: Boolean
  var qLocker: String
  var qStateCounts: NxStateCounts
  var qTags: js.Array[String]
}

object NxDimensionInfo {
  @scala.inline
  def apply(
    qApprMaxGlyphCount: Double,
    qAttrDimInfo: js.Array[NxAttrDimInfo],
    qAttrExprInfo: js.Array[NxAttrExprInfo],
    qCardinal: String,
    qContinuousAxes: Boolean,
    qDerivedField: Boolean,
    qDimensionType: D | N | T,
    qError: NxValidationError,
    qFallbackTitle: String,
    qGroupFallbackTitles: js.Array[String],
    qGroupFieldDefs: js.Array[String],
    qGroupPos: Double,
    qGrouping: N | H | C,
    qIsAutoFormat: Boolean,
    qIsCyclic: Boolean,
    qIsSemantic: Boolean,
    qLocker: String,
    qMax: Double,
    qMin: Double,
    qNumFormat: FieldAttributes,
    qReverseSort: Boolean,
    qSortIndicator: N | A | D,
    qStateCounts: NxStateCounts,
    qTags: js.Array[String]
  ): NxDimensionInfo = {
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount, qAttrDimInfo = qAttrDimInfo, qAttrExprInfo = qAttrExprInfo, qCardinal = qCardinal, qContinuousAxes = qContinuousAxes, qDerivedField = qDerivedField, qDimensionType = qDimensionType.asInstanceOf[js.Any], qError = qError, qFallbackTitle = qFallbackTitle, qGroupFallbackTitles = qGroupFallbackTitles, qGroupFieldDefs = qGroupFieldDefs, qGroupPos = qGroupPos, qGrouping = qGrouping.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat, qIsCyclic = qIsCyclic, qIsSemantic = qIsSemantic, qLocker = qLocker, qMax = qMax, qMin = qMin, qNumFormat = qNumFormat, qReverseSort = qReverseSort, qSortIndicator = qSortIndicator.asInstanceOf[js.Any], qStateCounts = qStateCounts, qTags = qTags)
  
    __obj.asInstanceOf[NxDimensionInfo]
  }
}

