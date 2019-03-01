package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NxCurrentSelectionItem extends js.Object {
  var qField: java.lang.String
  var qIsNum: js.UndefOr[scala.Boolean] = js.undefined
  var qLocked: js.UndefOr[scala.Boolean] = js.undefined
  var qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo]
  var qOneAndOnlyOne: js.UndefOr[scala.Boolean] = js.undefined
  var qRangeInfo: js.Array[RangeSelectInfo]
  var qSelected: java.lang.String
  var qSelectedCount: scala.Double
  var qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo]
  var qSelectionThreshold: scala.Double
  var qSortIndex: scala.Double
  var qStateCounts: NxStateCounts
  var qTextSearch: js.UndefOr[java.lang.String] = js.undefined
  var qTotal: scala.Double
}

object NxCurrentSelectionItem {
  @scala.inline
  def apply(
    qField: java.lang.String,
    qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo],
    qRangeInfo: js.Array[RangeSelectInfo],
    qSelected: java.lang.String,
    qSelectedCount: scala.Double,
    qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo],
    qSelectionThreshold: scala.Double,
    qSortIndex: scala.Double,
    qStateCounts: NxStateCounts,
    qTotal: scala.Double,
    qIsNum: js.UndefOr[scala.Boolean] = js.undefined,
    qLocked: js.UndefOr[scala.Boolean] = js.undefined,
    qOneAndOnlyOne: js.UndefOr[scala.Boolean] = js.undefined,
    qTextSearch: java.lang.String = null
  ): NxCurrentSelectionItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qField")(qField)
    __obj.updateDynamic("qNotSelectedFieldSelectionInfo")(qNotSelectedFieldSelectionInfo)
    __obj.updateDynamic("qRangeInfo")(qRangeInfo)
    __obj.updateDynamic("qSelected")(qSelected)
    __obj.updateDynamic("qSelectedCount")(qSelectedCount)
    __obj.updateDynamic("qSelectedFieldSelectionInfo")(qSelectedFieldSelectionInfo)
    __obj.updateDynamic("qSelectionThreshold")(qSelectionThreshold)
    __obj.updateDynamic("qSortIndex")(qSortIndex)
    __obj.updateDynamic("qStateCounts")(qStateCounts)
    __obj.updateDynamic("qTotal")(qTotal)
    if (!js.isUndefined(qIsNum)) __obj.updateDynamic("qIsNum")(qIsNum)
    if (!js.isUndefined(qLocked)) __obj.updateDynamic("qLocked")(qLocked)
    if (!js.isUndefined(qOneAndOnlyOne)) __obj.updateDynamic("qOneAndOnlyOne")(qOneAndOnlyOne)
    if (qTextSearch != null) __obj.updateDynamic("qTextSearch")(qTextSearch)
    __obj.asInstanceOf[NxCurrentSelectionItem]
  }
}

