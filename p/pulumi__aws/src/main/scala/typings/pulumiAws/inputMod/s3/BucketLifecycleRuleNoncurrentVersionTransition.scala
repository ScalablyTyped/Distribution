package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRuleNoncurrentVersionTransition extends js.Object {
  /**
    * Specifies the number of days noncurrent object versions transition.
    */
  var days: js.UndefOr[Input[Double]] = js.native
  /**
    * Specifies the Amazon S3 storage class to which you want the noncurrent object versions to transition. Can be `ONEZONE_IA`, `STANDARD_IA`, `INTELLIGENT_TIERING`, `GLACIER`, or `DEEP_ARCHIVE`.
    */
  var storageClass: Input[String] = js.native
}

object BucketLifecycleRuleNoncurrentVersionTransition {
  @scala.inline
  def apply(storageClass: Input[String]): BucketLifecycleRuleNoncurrentVersionTransition = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRuleNoncurrentVersionTransition]
  }
  @scala.inline
  implicit class BucketLifecycleRuleNoncurrentVersionTransitionOps[Self <: BucketLifecycleRuleNoncurrentVersionTransition] (val x: Self) extends AnyVal {
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
    def setStorageClass(value: Input[String]): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setDays(value: Input[Double]): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
  }
  
}

