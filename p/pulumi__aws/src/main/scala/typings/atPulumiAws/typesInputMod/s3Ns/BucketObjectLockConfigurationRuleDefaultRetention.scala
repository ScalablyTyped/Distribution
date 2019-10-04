package typings.atPulumiAws.typesInputMod.s3Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketObjectLockConfigurationRuleDefaultRetention extends js.Object {
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
    */
  var mode: Input[String]
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var years: js.UndefOr[Input[Double]] = js.undefined
}

object BucketObjectLockConfigurationRuleDefaultRetention {
  @scala.inline
  def apply(mode: Input[String], days: Input[Double] = null, years: Input[Double] = null): BucketObjectLockConfigurationRuleDefaultRetention = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRuleDefaultRetention]
  }
}

