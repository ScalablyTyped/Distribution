package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketObjectLockConfigurationRuleDefaultRetention extends js.Object {
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Double] = js.undefined
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
    */
  var mode: String
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var years: js.UndefOr[Double] = js.undefined
}

object BucketObjectLockConfigurationRuleDefaultRetention {
  @scala.inline
  def apply(mode: String, days: Int | Double = null, years: Int | Double = null): BucketObjectLockConfigurationRuleDefaultRetention = {
    val __obj = js.Dynamic.literal(mode = mode)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRuleDefaultRetention]
  }
}

