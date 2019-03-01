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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qApprMaxGlyphCount")(qApprMaxGlyphCount)
    __obj.updateDynamic("qAttrDimInfo")(qAttrDimInfo)
    __obj.updateDynamic("qAttrExprInfo")(qAttrExprInfo)
    __obj.updateDynamic("qCardinal")(qCardinal)
    __obj.updateDynamic("qContinuousAxes")(qContinuousAxes)
    __obj.updateDynamic("qDerivedField")(qDerivedField)
    __obj.updateDynamic("qDimensionType")(qDimensionType.asInstanceOf[js.Any])
    __obj.updateDynamic("qError")(qError)
    __obj.updateDynamic("qFallbackTitle")(qFallbackTitle)
    __obj.updateDynamic("qGroupFallbackTitles")(qGroupFallbackTitles)
    __obj.updateDynamic("qGroupFieldDefs")(qGroupFieldDefs)
    __obj.updateDynamic("qGroupPos")(qGroupPos)
    __obj.updateDynamic("qGrouping")(qGrouping.asInstanceOf[js.Any])
    __obj.updateDynamic("qIsAutoFormat")(qIsAutoFormat)
    __obj.updateDynamic("qIsCyclic")(qIsCyclic)
    __obj.updateDynamic("qIsSemantic")(qIsSemantic)
    __obj.updateDynamic("qLocker")(qLocker)
    __obj.updateDynamic("qMax")(qMax)
    __obj.updateDynamic("qMin")(qMin)
    __obj.updateDynamic("qNumFormat")(qNumFormat)
    __obj.updateDynamic("qReverseSort")(qReverseSort)
    __obj.updateDynamic("qSortIndicator")(qSortIndicator.asInstanceOf[js.Any])
    __obj.updateDynamic("qStateCounts")(qStateCounts)
    __obj.updateDynamic("qTags")(qTags)
    __obj.asInstanceOf[NxDimensionInfo]
  }
}

