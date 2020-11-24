package typings.pulumiAws.outputMod.s3control

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload extends js.Object {
  
  /**
    * Number of days after which Amazon S3 aborts an incomplete multipart upload.
    */
  var daysAfterInitiation: Double = js.native
}
object BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload {
  
  @scala.inline
  def apply(daysAfterInitiation: Double): BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload = {
    val __obj = js.Dynamic.literal(daysAfterInitiation = daysAfterInitiation.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload]
  }
  
  @scala.inline
  implicit class BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadOps[Self <: BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload] (val x: Self) extends AnyVal {
    
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
    def setDaysAfterInitiation(value: Double): Self = this.set("daysAfterInitiation", value.asInstanceOf[js.Any])
  }
}
