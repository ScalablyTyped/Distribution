package typings.pulumiAws.inputMod.s3control

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketLifecycleConfigurationRule extends js.Object {
  
  /**
    * Configuration block containing settings for abort incomplete multipart upload.
    */
  var abortIncompleteMultipartUpload: js.UndefOr[Input[BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload]] = js.native
  
  /**
    * Configuration block containing settings for expiration of objects.
    */
  var expiration: js.UndefOr[Input[BucketLifecycleConfigurationRuleExpiration]] = js.native
  
  /**
    * Configuration block containing settings for filtering.
    */
  var filter: js.UndefOr[Input[BucketLifecycleConfigurationRuleFilter]] = js.native
  
  /**
    * Unique identifier for the rule.
    */
  var id: Input[String] = js.native
  
  /**
    * Status of the rule. Valid values: `Enabled` and `Disabled`. Defaults to `Enabled`.
    */
  var status: js.UndefOr[Input[String]] = js.native
}
object BucketLifecycleConfigurationRule {
  
  @scala.inline
  def apply(id: Input[String]): BucketLifecycleConfigurationRule = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleConfigurationRule]
  }
  
  @scala.inline
  implicit class BucketLifecycleConfigurationRuleOps[Self <: BucketLifecycleConfigurationRule] (val x: Self) extends AnyVal {
    
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
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortIncompleteMultipartUpload(value: Input[BucketLifecycleConfigurationRuleAbortIncompleteMultipartUpload]): Self = this.set("abortIncompleteMultipartUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortIncompleteMultipartUpload: Self = this.set("abortIncompleteMultipartUpload", js.undefined)
    
    @scala.inline
    def setExpiration(value: Input[BucketLifecycleConfigurationRuleExpiration]): Self = this.set("expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    
    @scala.inline
    def setFilter(value: Input[BucketLifecycleConfigurationRuleFilter]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
