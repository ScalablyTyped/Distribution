package typings.qlik.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxCurrentSelectionItem extends js.Object {
  var qField: String
  var qIsNum: js.UndefOr[Boolean] = js.undefined
  var qLocked: js.UndefOr[Boolean] = js.undefined
  var qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo]
  var qOneAndOnlyOne: js.UndefOr[Boolean] = js.undefined
  var qRangeInfo: js.Array[RangeSelectInfo]
  var qSelected: String
  var qSelectedCount: Double
  var qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo]
  var qSelectionThreshold: Double
  var qSortIndex: Double
  var qStateCounts: NxStateCounts
  var qTextSearch: js.UndefOr[String] = js.undefined
  var qTotal: Double
}

object NxCurrentSelectionItem {
  @scala.inline
  def apply(
    qField: String,
    qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo],
    qRangeInfo: js.Array[RangeSelectInfo],
    qSelected: String,
    qSelectedCount: Double,
    qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo],
    qSelectionThreshold: Double,
    qSortIndex: Double,
    qStateCounts: NxStateCounts,
    qTotal: Double,
    qIsNum: js.UndefOr[Boolean] = js.undefined,
    qLocked: js.UndefOr[Boolean] = js.undefined,
    qOneAndOnlyOne: js.UndefOr[Boolean] = js.undefined,
    qTextSearch: String = null
  ): NxCurrentSelectionItem = {
    val __obj = js.Dynamic.literal(qField = qField, qNotSelectedFieldSelectionInfo = qNotSelectedFieldSelectionInfo, qRangeInfo = qRangeInfo, qSelected = qSelected, qSelectedCount = qSelectedCount, qSelectedFieldSelectionInfo = qSelectedFieldSelectionInfo, qSelectionThreshold = qSelectionThreshold, qSortIndex = qSortIndex, qStateCounts = qStateCounts, qTotal = qTotal)
    if (!js.isUndefined(qIsNum)) __obj.updateDynamic("qIsNum")(qIsNum)
    if (!js.isUndefined(qLocked)) __obj.updateDynamic("qLocked")(qLocked)
    if (!js.isUndefined(qOneAndOnlyOne)) __obj.updateDynamic("qOneAndOnlyOne")(qOneAndOnlyOne)
    if (qTextSearch != null) __obj.updateDynamic("qTextSearch")(qTextSearch)
    __obj.asInstanceOf[NxCurrentSelectionItem]
  }
}

