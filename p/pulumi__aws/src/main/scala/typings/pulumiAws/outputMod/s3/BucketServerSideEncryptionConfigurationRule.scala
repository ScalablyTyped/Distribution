package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketServerSideEncryptionConfigurationRule extends js.Object {
  
  /**
    * A single object for setting server-side encryption by default. (documented below)
    */
  var applyServerSideEncryptionByDefault: BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault = js.native
}
object BucketServerSideEncryptionConfigurationRule {
  
  @scala.inline
  def apply(
    applyServerSideEncryptionByDefault: BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault
  ): BucketServerSideEncryptionConfigurationRule = {
    val __obj = js.Dynamic.literal(applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketServerSideEncryptionConfigurationRule]
  }
  
  @scala.inline
  implicit class BucketServerSideEncryptionConfigurationRuleOps[Self <: BucketServerSideEncryptionConfigurationRule] (val x: Self) extends AnyVal {
    
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
    def setApplyServerSideEncryptionByDefault(value: BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault): Self = this.set("applyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
  }
}
