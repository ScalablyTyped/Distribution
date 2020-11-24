package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketObjectLockConfigurationRule extends js.Object {
  
  /**
    * The default retention period that you want to apply to new objects placed in this bucket.
    */
  var defaultRetention: Input[BucketObjectLockConfigurationRuleDefaultRetention] = js.native
}
object BucketObjectLockConfigurationRule {
  
  @scala.inline
  def apply(defaultRetention: Input[BucketObjectLockConfigurationRuleDefaultRetention]): BucketObjectLockConfigurationRule = {
    val __obj = js.Dynamic.literal(defaultRetention = defaultRetention.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfigurationRule]
  }
  
  @scala.inline
  implicit class BucketObjectLockConfigurationRuleOps[Self <: BucketObjectLockConfigurationRule] (val x: Self) extends AnyVal {
    
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
    def setDefaultRetention(value: Input[BucketObjectLockConfigurationRuleDefaultRetention]): Self = this.set("defaultRetention", value.asInstanceOf[js.Any])
  }
}
