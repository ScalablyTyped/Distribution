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

trait OtherTotalSpecProp extends js.Object {
  var qApplyEvenWhenPossiblyWrongResult: Boolean
  var qForceBadValueKeeping: Boolean
  var qGlobalOtherGrouping: Boolean
  var qOtherCollapseInnerDimensions: Boolean
  var qOtherCounted: ValueExpr
  var qOtherLimit: ValueExpr
  var qOtherLimitMode: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT
  var qOtherMode: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET
  var qOtherSortMode: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING
  var qReferencedExpression: String
  var qSupressOther: Boolean
  var qTotalMode: TOTAL_OFF | TOTAL_EXPR
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
}

