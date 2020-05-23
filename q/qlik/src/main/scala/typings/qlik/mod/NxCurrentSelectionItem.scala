package typings.qlik.mod

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
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNotSelectedFieldSelectionInfo = qNotSelectedFieldSelectionInfo.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedCount = qSelectedCount.asInstanceOf[js.Any], qSelectedFieldSelectionInfo = qSelectedFieldSelectionInfo.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTotal = qTotal.asInstanceOf[js.Any])
    if (!js.isUndefined(qIsNum)) __obj.updateDynamic("qIsNum")(qIsNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qLocked)) __obj.updateDynamic("qLocked")(qLocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qOneAndOnlyOne)) __obj.updateDynamic("qOneAndOnlyOne")(qOneAndOnlyOne.get.asInstanceOf[js.Any])
    if (qTextSearch != null) __obj.updateDynamic("qTextSearch")(qTextSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCurrentSelectionItem]
  }
}

