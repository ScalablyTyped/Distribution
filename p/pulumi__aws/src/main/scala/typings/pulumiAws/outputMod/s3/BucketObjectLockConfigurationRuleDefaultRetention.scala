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
  def apply(mode: String): BucketObjectLockConfigurationRuleDefaultRetention = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRuleDefaultRetention]
  }
  @scala.inline
  implicit class BucketObjectLockConfigurationRuleDefaultRetentionOps[Self <: BucketObjectLockConfigurationRuleDefaultRetention] (val x: Self) extends AnyVal {
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
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setYears(value: Double): Self = this.set("years", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
  
}

