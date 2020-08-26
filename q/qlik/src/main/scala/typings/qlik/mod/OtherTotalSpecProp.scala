package typings.qlik.mod

import typings.qlik.qlikStrings.OTHER_ABS_ACC_TARGET
import typings.qlik.qlikStrings.OTHER_ABS_LIMITED
import typings.qlik.qlikStrings.OTHER_COUNTED
import typings.qlik.qlikStrings.OTHER_GE_LIMIT
import typings.qlik.qlikStrings.OTHER_GT_LIMIT
import typings.qlik.qlikStrings.OTHER_LE_LIMIT
import typings.qlik.qlikStrings.OTHER_LT_LIMIT
import typings.qlik.qlikStrings.OTHER_OFF
import typings.qlik.qlikStrings.OTHER_REL_ACC_TARGET
import typings.qlik.qlikStrings.OTHER_REL_LIMITED
import typings.qlik.qlikStrings.OTHER_SORT_ASCENDING
import typings.qlik.qlikStrings.OTHER_SORT_DEFAULT
import typings.qlik.qlikStrings.OTHER_SORT_DESCENDING
import typings.qlik.qlikStrings.TOTAL_EXPR
import typings.qlik.qlikStrings.TOTAL_OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherTotalSpecProp extends js.Object {
  var qApplyEvenWhenPossiblyWrongResult: Boolean = js.native
  var qForceBadValueKeeping: Boolean = js.native
  var qGlobalOtherGrouping: Boolean = js.native
  var qOtherCollapseInnerDimensions: Boolean = js.native
  var qOtherCounted: ValueExpr = js.native
  var qOtherLimit: ValueExpr = js.native
  var qOtherLimitMode: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT = js.native
  var qOtherMode: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET = js.native
  var qOtherSortMode: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING = js.native
  var qReferencedExpression: String = js.native
  var qSupressOther: Boolean = js.native
  var qTotalMode: TOTAL_OFF | TOTAL_EXPR = js.native
}

object OtherTotalSpecProp {
  @scala.inline
  def apply(
    qApplyEvenWhenPossiblyWrongResult: Boolean,
    qForceBadValueKeeping: Boolean,
    qGlobalOtherGrouping: Boolean,
    qOtherCollapseInnerDimensions: Boolean,
    qOtherCounted: ValueExpr,
    qOtherLimit: ValueExpr,
    qOtherLimitMode: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT,
    qOtherMode: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET,
    qOtherSortMode: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING,
    qReferencedExpression: String,
    qSupressOther: Boolean,
    qTotalMode: TOTAL_OFF | TOTAL_EXPR
  ): OtherTotalSpecProp = {
    val __obj = js.Dynamic.literal(qApplyEvenWhenPossiblyWrongResult = qApplyEvenWhenPossiblyWrongResult.asInstanceOf[js.Any], qForceBadValueKeeping = qForceBadValueKeeping.asInstanceOf[js.Any], qGlobalOtherGrouping = qGlobalOtherGrouping.asInstanceOf[js.Any], qOtherCollapseInnerDimensions = qOtherCollapseInnerDimensions.asInstanceOf[js.Any], qOtherCounted = qOtherCounted.asInstanceOf[js.Any], qOtherLimit = qOtherLimit.asInstanceOf[js.Any], qOtherLimitMode = qOtherLimitMode.asInstanceOf[js.Any], qOtherMode = qOtherMode.asInstanceOf[js.Any], qOtherSortMode = qOtherSortMode.asInstanceOf[js.Any], qReferencedExpression = qReferencedExpression.asInstanceOf[js.Any], qSupressOther = qSupressOther.asInstanceOf[js.Any], qTotalMode = qTotalMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherTotalSpecProp]
  }
  @scala.inline
  implicit class OtherTotalSpecPropOps[Self <: OtherTotalSpecProp] (val x: Self) extends AnyVal {
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
    def setQApplyEvenWhenPossiblyWrongResult(value: Boolean): Self = this.set("qApplyEvenWhenPossiblyWrongResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setQForceBadValueKeeping(value: Boolean): Self = this.set("qForceBadValueKeeping", value.asInstanceOf[js.Any])
    @scala.inline
    def setQGlobalOtherGrouping(value: Boolean): Self = this.set("qGlobalOtherGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOtherCollapseInnerDimensions(value: Boolean): Self = this.set("qOtherCollapseInnerDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOtherCounted(value: ValueExpr): Self = this.set("qOtherCounted", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOtherLimit(value: ValueExpr): Self = this.set("qOtherLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOtherLimitMode(value: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT): Self = this.set("qOtherLimitMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOtherMode(
      value: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET
    ): Self = this.set("qOtherMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQOtherSortMode(value: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING): Self = this.set("qOtherSortMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setQReferencedExpression(value: String): Self = this.set("qReferencedExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSupressOther(value: Boolean): Self = this.set("qSupressOther", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTotalMode(value: TOTAL_OFF | TOTAL_EXPR): Self = this.set("qTotalMode", value.asInstanceOf[js.Any])
  }
  
}

