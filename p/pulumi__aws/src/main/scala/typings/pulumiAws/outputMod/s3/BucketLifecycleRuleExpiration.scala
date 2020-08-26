package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRuleExpiration extends js.Object {
  /**
    * Specifies the date after which you want the corresponding action to take effect.
    */
  var date: js.UndefOr[String] = js.native
  /**
    * Specifies the number of days after object creation when the specific rule action takes effect.
    */
  var days: js.UndefOr[Double] = js.native
  /**
    * On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers.
    */
  var expiredObjectDeleteMarker: js.UndefOr[Boolean] = js.native
}

object BucketLifecycleRuleExpiration {
  @scala.inline
  def apply(): BucketLifecycleRuleExpiration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketLifecycleRuleExpiration]
  }
  @scala.inline
  implicit class BucketLifecycleRuleExpirationOps[Self <: BucketLifecycleRuleExpiration] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setExpiredObjectDeleteMarker(value: Boolean): Self = this.set("expiredObjectDeleteMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiredObjectDeleteMarker: Self = this.set("expiredObjectDeleteMarker", js.undefined)
  }
  
}

