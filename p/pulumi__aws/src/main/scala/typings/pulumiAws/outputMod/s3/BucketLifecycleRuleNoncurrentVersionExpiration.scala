package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRuleNoncurrentVersionExpiration extends js.Object {
  /**
    * Specifies the number of days noncurrent object versions expire.
    */
  var days: js.UndefOr[Double] = js.native
}

object BucketLifecycleRuleNoncurrentVersionExpiration {
  @scala.inline
  def apply(): BucketLifecycleRuleNoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLifecycleRuleNoncurrentVersionExpiration]
  }
  @scala.inline
  implicit class BucketLifecycleRuleNoncurrentVersionExpirationOps[Self <: BucketLifecycleRuleNoncurrentVersionExpiration] (val x: Self) extends AnyVal {
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
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
  }
  
}

