package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRuleNoncurrentVersionTransition extends js.Object {
  /**
    * Specifies the number of days an object is noncurrent object versions expire.
    */
  var days: js.UndefOr[Double] = js.native
  /**
    * Specifies the Amazon S3 storage class to which you want the noncurrent versions object to transition. Can be `ONEZONE_IA`, `STANDARD_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: String = js.native
}

object BucketLifecycleRuleNoncurrentVersionTransition {
  @scala.inline
  def apply(storageClass: String, days: js.UndefOr[Double] = js.undefined): BucketLifecycleRuleNoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleNoncurrentVersionTransition]
  }
}

