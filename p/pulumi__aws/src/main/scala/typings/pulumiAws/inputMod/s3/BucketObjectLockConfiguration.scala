package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketObjectLockConfiguration extends js.Object {
  
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled. Valid value is `Enabled`.
    */
  var objectLockEnabled: Input[String] = js.native
  
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: js.UndefOr[Input[BucketObjectLockConfigurationRule]] = js.native
}
object BucketObjectLockConfiguration {
  
  @scala.inline
  def apply(objectLockEnabled: Input[String]): BucketObjectLockConfiguration = {
    val __obj = js.Dynamic.literal(objectLockEnabled = objectLockEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObjectLockConfiguration]
  }
  
  @scala.inline
  implicit class BucketObjectLockConfigurationOps[Self <: BucketObjectLockConfiguration] (val x: Self) extends AnyVal {
    
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
    def setObjectLockEnabled(value: Input[String]): Self = this.set("objectLockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRule(value: Input[BucketObjectLockConfigurationRule]): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
}
