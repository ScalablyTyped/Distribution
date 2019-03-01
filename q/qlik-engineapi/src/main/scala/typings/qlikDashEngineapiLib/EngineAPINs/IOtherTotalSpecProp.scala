package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OtherTotalSpecProp...
  */
trait IOtherTotalSpecProp extends js.Object {
  /**
    * Set this parameter to true to allow the calculation of Others even if the engine detects some potential mistakes.
    * For example the country Russia is part of the continent Europe and Asia.
    * If you have an hypercube with two dimensions Country and Continent and one measure Population,
    * the engine can detect that the population of Russia is included in both the continent Asia and Europe.
    * >> The default value is true.
    */
  var qApplyEvenWhenPossiblyWrongResult: scala.Boolean
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
  var qForceBadValueKeeping: scala.Boolean
  /**
    * This parameter applies to inner dimensions.
    * If this parameter is set to true, the restrictions are calculated on the selected dimension only.
    * All previous dimensions are ignored.
    * >> The default value is false.
    */
  var qGlobalOtherGrouping: scala.Boolean
  /**
    * If set to true, it collapses the inner dimensions (if any) in the group Others.
    * >> The default value is false.
    */
  var qOtherCollapseInnerDimensions: scala.Boolean
  /**
    * Number of values to display.
    * The number of values can be entered as a calculated formula.
    * This parameter is used when qOtherMode is set to OTHER_COUNTED.
    */
  var qOtherCounted: java.lang.String
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
  var qOtherLimit: java.lang.String
  /**
    * Sets the limit for the Others mode.
    * This parameter is used when qOtherMode is set to:
    *
    * - OTHER_ABS_LIMITED
    * - OTHER_REL_LIMITED
    * - OTHER_ABS_ACC_TARGET
    * - OTHER_REL_ACC_TARGET
    */
  var qOtherLimitMode: OtherLimitModeType
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
  var qOtherMode: OtherModeType
  /**
    * Defines the sort order of the dimension values.
    * >> The default value is OTHER_SORT_DESCENDING.
    */
  var qOtherSortMode: OtherSortModeType
  /**
    * This parameter applies when there are several measures.
    * Name of the measure to use for the calculation of Others for a specific dimension.
    */
  var qReferencedExpression: java.lang.String
  /**
    * If set to true, the group Others is not displayed as a dimension value.
    * >> The default value is false.
    */
  var qSuppressOther: scala.Boolean
  /**
    * If set to TOTAL_EXPR, the total of the dimension values is returned.
    * >> The default value is TOTAL_OFF.
    */
  var qTotalMode: TotalModeType
}

object IOtherTotalSpecProp {
  @scala.inline
  def apply(
    qApplyEvenWhenPossiblyWrongResult: scala.Boolean,
    qForceBadValueKeeping: scala.Boolean,
    qGlobalOtherGrouping: scala.Boolean,
    qOtherCollapseInnerDimensions: scala.Boolean,
    qOtherCounted: java.lang.String,
    qOtherLimit: java.lang.String,
    qOtherLimitMode: OtherLimitModeType,
    qOtherMode: OtherModeType,
    qOtherSortMode: OtherSortModeType,
    qReferencedExpression: java.lang.String,
    qSuppressOther: scala.Boolean,
    qTotalMode: TotalModeType
  ): IOtherTotalSpecProp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qApplyEvenWhenPossiblyWrongResult")(qApplyEvenWhenPossiblyWrongResult)
    __obj.updateDynamic("qForceBadValueKeeping")(qForceBadValueKeeping)
    __obj.updateDynamic("qGlobalOtherGrouping")(qGlobalOtherGrouping)
    __obj.updateDynamic("qOtherCollapseInnerDimensions")(qOtherCollapseInnerDimensions)
    __obj.updateDynamic("qOtherCounted")(qOtherCounted)
    __obj.updateDynamic("qOtherLimit")(qOtherLimit)
    __obj.updateDynamic("qOtherLimitMode")(qOtherLimitMode)
    __obj.updateDynamic("qOtherMode")(qOtherMode)
    __obj.updateDynamic("qOtherSortMode")(qOtherSortMode)
    __obj.updateDynamic("qReferencedExpression")(qReferencedExpression)
    __obj.updateDynamic("qSuppressOther")(qSuppressOther)
    __obj.updateDynamic("qTotalMode")(qTotalMode)
    __obj.asInstanceOf[IOtherTotalSpecProp]
  }
}

