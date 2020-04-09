package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRuleNoncurrentVersionTransition extends js.Object {
  /**
    * Specifies the number of days an object is noncurrent object versions expire.
    */
  var days: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies the Amazon S3 storage class to which you want the noncurrent versions object to transition. Can be `ONEZONE_IA`, `STANDARD_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: Input[String] = js.native
}

object BucketLifecycleRuleNoncurrentVersionTransition {
  @scala.inline
  def apply(storageClass: Input[String], days: Input[Double] = null): BucketLifecycleRuleNoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleNoncurrentVersionTransition]
  }
}

