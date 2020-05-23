package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketObjectLockConfigurationRuleDefaultRetention extends js.Object {
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Double] = js.native
  /**
    * The default Object Lock retention mode you want to apply to new objects placed in this bucket. Valid values are `GOVERNANCE` and `COMPLIANCE`.
    */
  var mode: String = js.native
  /**
    * The number of years that you want to specify for the default retention period.
    */
  var years: js.UndefOr[Double] = js.native
}

object BucketObjectLockConfigurationRuleDefaultRetention {
  @scala.inline
  def apply(mode: String, days: js.UndefOr[Double] = js.undefined, years: js.UndefOr[Double] = js.undefined): BucketObjectLockConfigurationRuleDefaultRetention = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    if (!js.isUndefined(years)) __obj.updateDynamic("years")(years.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRuleDefaultRetention]
  }
}

