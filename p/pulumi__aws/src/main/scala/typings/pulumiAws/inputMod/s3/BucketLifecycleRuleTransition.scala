package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRuleTransition extends js.Object {
  /**
    * Specifies the date after which you want the corresponding action to take effect.
    */
  var date: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies the number of days after object creation when the specific rule action takes effect.
    */
  var days: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies the Amazon S3 storage class to which you want the object to transition. Can be `ONEZONE_IA`, `STANDARD_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: Input[String] = js.native
}

object BucketLifecycleRuleTransition {
  @scala.inline
  def apply(storageClass: Input[String], date: Input[String] = null, days: Input[Double] = null): BucketLifecycleRuleTransition = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleTransition]
  }
}

