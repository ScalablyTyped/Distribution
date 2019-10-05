package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLifecycleRuleExpiration extends js.Object {
  /**
    * Specifies the date after which you want the corresponding action to take effect.
    */
  var date: js.UndefOr[Input[String]] = js.undefined
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Input[Double]] = js.undefined
  /**
    * On a versioned bucket (versioning-enabled or versioning-suspended bucket), you can add this element in the lifecycle configuration to direct Amazon S3 to delete expired object delete markers.
    */
  var expiredObjectDeleteMarker: js.UndefOr[Input[Boolean]] = js.undefined
}

object BucketLifecycleRuleExpiration {
  @scala.inline
  def apply(
    date: Input[String] = null,
    days: Input[Double] = null,
    expiredObjectDeleteMarker: Input[Boolean] = null
  ): BucketLifecycleRuleExpiration = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (expiredObjectDeleteMarker != null) __obj.updateDynamic("expiredObjectDeleteMarker")(expiredObjectDeleteMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleExpiration]
  }
}

