package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLifecycleRuleExpiration extends js.Object {
  /**
    * Specifies the date after which you want the corresponding action to take effect.
    */
  var date: js.UndefOr[String] = js.undefined
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Double] = js.undefined
  /**
    * On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers.
    */
  var expiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
}

object BucketLifecycleRuleExpiration {
  @scala.inline
  def apply(
    date: String = null,
    days: Int | Double = null,
    expiredObjectDeleteMarker: js.UndefOr[Boolean] = js.undefined
  ): BucketLifecycleRuleExpiration = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (!js.isUndefined(expiredObjectDeleteMarker)) __obj.updateDynamic("expiredObjectDeleteMarker")(expiredObjectDeleteMarker)
    __obj.asInstanceOf[BucketLifecycleRuleExpiration]
  }
}

