package typings.qlik.mod

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
    val __obj = js.Dynamic.literal(qApprMaxGlyphCount = qApprMaxGlyphCount.asInstanceOf[js.Any], qAttrDimInfo = qAttrDimInfo.asInstanceOf[js.Any], qAttrExprInfo = qAttrExprInfo.asInstanceOf[js.Any], qCardinal = qCardinal.asInstanceOf[js.Any], qContinuousAxes = qContinuousAxes.asInstanceOf[js.Any], qDerivedField = qDerivedField.asInstanceOf[js.Any], qDimensionType = qDimensionType.asInstanceOf[js.Any], qError = qError.asInstanceOf[js.Any], qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qGroupFallbackTitles = qGroupFallbackTitles.asInstanceOf[js.Any], qGroupFieldDefs = qGroupFieldDefs.asInstanceOf[js.Any], qGroupPos = qGroupPos.asInstanceOf[js.Any], qGrouping = qGrouping.asInstanceOf[js.Any], qIsAutoFormat = qIsAutoFormat.asInstanceOf[js.Any], qIsCyclic = qIsCyclic.asInstanceOf[js.Any], qIsSemantic = qIsSemantic.asInstanceOf[js.Any], qLocker = qLocker.asInstanceOf[js.Any], qMax = qMax.asInstanceOf[js.Any], qMin = qMin.asInstanceOf[js.Any], qNumFormat = qNumFormat.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NxDimensionInfo]
  }
}

