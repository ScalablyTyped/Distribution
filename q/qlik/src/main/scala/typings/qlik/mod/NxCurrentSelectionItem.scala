package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxCurrentSelectionItem extends js.Object {
  var qField: String = js.native
  var qIsNum: js.UndefOr[Boolean] = js.native
  var qLocked: js.UndefOr[Boolean] = js.native
  var qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo] = js.native
  var qOneAndOnlyOne: js.UndefOr[Boolean] = js.native
  var qRangeInfo: js.Array[RangeSelectInfo] = js.native
  var qSelected: String = js.native
  var qSelectedCount: Double = js.native
  var qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo] = js.native
  var qSelectionThreshold: Double = js.native
  var qSortIndex: Double = js.native
  var qStateCounts: NxStateCounts = js.native
  var qTextSearch: js.UndefOr[String] = js.native
  var qTotal: Double = js.native
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
    qTotal: Double
  ): NxCurrentSelectionItem = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNotSelectedFieldSelectionInfo = qNotSelectedFieldSelectionInfo.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedCount = qSelectedCount.asInstanceOf[js.Any], qSelectedFieldSelectionInfo = qSelectedFieldSelectionInfo.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTotal = qTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCurrentSelectionItem]
  }
  @scala.inline
  implicit class NxCurrentSelectionItemOps[Self <: NxCurrentSelectionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQField(value: String): Self = this.set("qField", value.asInstanceOf[js.Any])
    @scala.inline
    def setQNotSelectedFieldSelectionInfoVarargs(value: NxFieldSelectionInfo*): Self = this.set("qNotSelectedFieldSelectionInfo", js.Array(value :_*))
    @scala.inline
    def setQNotSelectedFieldSelectionInfo(value: js.Array[NxFieldSelectionInfo]): Self = this.set("qNotSelectedFieldSelectionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQRangeInfoVarargs(value: RangeSelectInfo*): Self = this.set("qRangeInfo", js.Array(value :_*))
    @scala.inline
    def setQRangeInfo(value: js.Array[RangeSelectInfo]): Self = this.set("qRangeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSelected(value: String): Self = this.set("qSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSelectedCount(value: Double): Self = this.set("qSelectedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSelectedFieldSelectionInfoVarargs(value: NxFieldSelectionInfo*): Self = this.set("qSelectedFieldSelectionInfo", js.Array(value :_*))
    @scala.inline
    def setQSelectedFieldSelectionInfo(value: js.Array[NxFieldSelectionInfo]): Self = this.set("qSelectedFieldSelectionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSelectionThreshold(value: Double): Self = this.set("qSelectionThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSortIndex(value: Double): Self = this.set("qSortIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setQStateCounts(value: NxStateCounts): Self = this.set("qStateCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTotal(value: Double): Self = this.set("qTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setQIsNum(value: Boolean): Self = this.set("qIsNum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQIsNum: Self = this.set("qIsNum", js.undefined)
    @scala.inline
    def setQLocked(value: Boolean): Self = this.set("qLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQLocked: Self = this.set("qLocked", js.undefined)
    @scala.inline
    def setQOneAndOnlyOne(value: Boolean): Self = this.set("qOneAndOnlyOne", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQOneAndOnlyOne: Self = this.set("qOneAndOnlyOne", js.undefined)
    @scala.inline
    def setQTextSearch(value: String): Self = this.set("qTextSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQTextSearch: Self = this.set("qTextSearch", js.undefined)
  }
  
}

