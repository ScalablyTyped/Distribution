package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketLifecycleRuleTransition extends js.Object {
  /**
    * Specifies the date after which you want the corresponding action to take effect.
    */
  var date: js.UndefOr[String] = js.undefined
  /**
    * The number of days that you want to specify for the default retention period.
    */
  var days: js.UndefOr[Double] = js.undefined
  /**
    * The class of storage used to store the object. Can be `STANDARD`, `REDUCED_REDUNDANCY`, `STANDARD_IA`, `ONEZONE_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: String
}

object BucketLifecycleRuleTransition {
  @scala.inline
  def apply(storageClass: String, date: String = null, days: Int | Double = null): BucketLifecycleRuleTransition = {
    val __obj = js.Dynamic.literal(storageClass = storageClass)
    if (date != null) __obj.updateDynamic("date")(date)
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleTransition]
  }
}

