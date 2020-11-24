package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * OtherTotalSpecProp...
  */
@js.native
trait IOtherTotalSpecProp extends js.Object {
  
  /**
    * Set this parameter to true to allow the calculation of Others even if the engine detects some potential mistakes.
    * For example the country Russia is part of the continent Europe and Asia.
    * If you have an hypercube with two dimensions Country and Continent and one measure Population,
    * the engine can detect that the population of Russia is included in both the continent Asia and Europe.
    * >> The default value is true.
    */
  var qApplyEvenWhenPossiblyWrongResult: Boolean = js.native
  
  /**
    * This parameter is used when qOtherMode is set to:
    *
    * - OTHER_ABS_LIMITED
    * - OTHER_REL_LIMITED
    * - OTHER_ABS_ACC_TARGET
    * - OTHER_REL_ACC_TARGET
    *
    * and when the dimension values include not numeric values.
    * Set this parameter to true to include text values in the returned values.
    * >> The default value is true.
    */
  var qForceBadValueKeeping: Boolean = js.native
  
  /**
    * This parameter applies to inner dimensions.
    * If this parameter is set to true, the restrictions are calculated on the selected dimension only.
    * All previous dimensions are ignored.
    * >> The default value is false.
    */
  var qGlobalOtherGrouping: Boolean = js.native
  
  /**
    * If set to true, it collapses the inner dimensions (if any) in the group Others.
    * >> The default value is false.
    */
  var qOtherCollapseInnerDimensions: Boolean = js.native
  
  /**
    * Number of values to display.
    * The number of values can be entered as a calculated formula.
    * This parameter is used when qOtherMode is set to OTHER_COUNTED.
    */
  var qOtherCounted: String = js.native
  
  /**
    * Value used to limit the dimension values.
    * The limit can be entered as a calculated formula.
    * This parameter is used when qOtherMode is set to:
    *
    * - OTHER_ABS_LIMITED
    * - OTHER_REL_LIMITED
    * - OTHER_ABS_ACC_TARGET
    * - OTHER_REL_ACC_TARGET
    */
  var qOtherLimit: String = js.native
  
  /**
    * Sets the limit for the Others mode.
    * This parameter is used when qOtherMode is set to:
    *
    * - OTHER_ABS_LIMITED
    * - OTHER_REL_LIMITED
    * - OTHER_ABS_ACC_TARGET
    * - OTHER_REL_ACC_TARGET
    */
  var qOtherLimitMode: OtherLimitModeType = js.native
  
  /**
    * Determines how many dimension values are displayed.
    * >> default value is OTHER_OFF
    *
    * One of:
    * - OTHER_OFF; do not limit the number of dimension values
    * - OTHER_COUNTED; limit the dimension values to a specified number defined in OtherTotalSpecProp.
    * - OTHER_ABS_LIMITED; limit the dimension values to an absolute value defined in OtherTotalSpecProp.
    * - OTHER_ABS_ACC_TARGET; return the dimension values that accumulate to an absolute value.
    *   All rows up to the current row are accumulated and the result is compared to the specified absolute value.
    *   The absolute value is defined in OtherTotalSpecProp.
    * - OTHER_REL_LIMITED; limit the dimension values based on a percentage of the total.
    *   The total is the sum of all the dimension values. The percentage is defined in OtherTotalSpecProp.
    * - OTHER_REL_ACC_TARGET; return the dimension values that accumulate to a percentage of the total.
    *   All rows up to the current row are accumulated and the result is compared to the total of the dimension values.
    *   A percentage is calculated. This percentage is compared to the specified percentage, defined in OtherTotalSpecProp.
    */
  var qOtherMode: OtherModeType = js.native
  
  /**
    * Defines the sort order of the dimension values.
    * >> The default value is OTHER_SORT_DESCENDING.
    */
  var qOtherSortMode: OtherSortModeType = js.native
  
  /**
    * This parameter applies when there are several measures.
    * Name of the measure to use for the calculation of Others for a specific dimension.
    */
  var qReferencedExpression: String = js.native
  
  /**
    * If set to true, the group Others is not displayed as a dimension value.
    * >> The default value is false.
    */
  var qSuppressOther: Boolean = js.native
  
  /**
    * If set to TOTAL_EXPR, the total of the dimension values is returned.
    * >> The default value is TOTAL_OFF.
    */
  var qTotalMode: TotalModeType = js.native
}
object IOtherTotalSpecProp {
  
  @scala.inline
  def apply(
    qApplyEvenWhenPossiblyWrongResult: Boolean,
    qForceBadValueKeeping: Boolean,
    qGlobalOtherGrouping: Boolean,
    qOtherCollapseInnerDimensions: Boolean,
    qOtherCounted: String,
    qOtherLimit: String,
    qOtherLimitMode: OtherLimitModeType,
    qOtherMode: OtherModeType,
    qOtherSortMode: OtherSortModeType,
    qReferencedExpression: String,
    qSuppressOther: Boolean,
    qTotalMode: TotalModeType
  ): IOtherTotalSpecProp = {
    val __obj = js.Dynamic.literal(qApplyEvenWhenPossiblyWrongResult = qApplyEvenWhenPossiblyWrongResult.asInstanceOf[js.Any], qForceBadValueKeeping = qForceBadValueKeeping.asInstanceOf[js.Any], qGlobalOtherGrouping = qGlobalOtherGrouping.asInstanceOf[js.Any], qOtherCollapseInnerDimensions = qOtherCollapseInnerDimensions.asInstanceOf[js.Any], qOtherCounted = qOtherCounted.asInstanceOf[js.Any], qOtherLimit = qOtherLimit.asInstanceOf[js.Any], qOtherLimitMode = qOtherLimitMode.asInstanceOf[js.Any], qOtherMode = qOtherMode.asInstanceOf[js.Any], qOtherSortMode = qOtherSortMode.asInstanceOf[js.Any], qReferencedExpression = qReferencedExpression.asInstanceOf[js.Any], qSuppressOther = qSuppressOther.asInstanceOf[js.Any], qTotalMode = qTotalMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOtherTotalSpecProp]
  }
  
  @scala.inline
  implicit class IOtherTotalSpecPropOps[Self <: IOtherTotalSpecProp] (val x: Self) extends AnyVal {
    
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
    def setQOtherCounted(value: String): Self = this.set("qOtherCounted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOtherLimit(value: String): Self = this.set("qOtherLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOtherLimitMode(value: OtherLimitModeType): Self = this.set("qOtherLimitMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOtherMode(value: OtherModeType): Self = this.set("qOtherMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOtherSortMode(value: OtherSortModeType): Self = this.set("qOtherSortMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQReferencedExpression(value: String): Self = this.set("qReferencedExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSuppressOther(value: Boolean): Self = this.set("qSuppressOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTotalMode(value: TotalModeType): Self = this.set("qTotalMode", value.asInstanceOf[js.Any])
  }
}
