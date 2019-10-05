package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLifecycleRuleNoncurrentVersionExpiration extends js.Object {
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Double] = js.undefined
}

object BucketLifecycleRuleNoncurrentVersionExpiration {
  @scala.inline
  def apply(days: Int | Double = null): BucketLifecycleRuleNoncurrentVersionExpiration = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleNoncurrentVersionExpiration]
  }
}

