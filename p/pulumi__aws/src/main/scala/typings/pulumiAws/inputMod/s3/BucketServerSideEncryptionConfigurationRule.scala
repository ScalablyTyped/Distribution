package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketServerSideEncryptionConfigurationRule extends StObject {
  
  /**
    * A single object for setting server-side encryption by default. (documented below)
    */
  var applyServerSideEncryptionByDefault: Input[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault] = js.native
}
object BucketServerSideEncryptionConfigurationRule {
  
  @scala.inline
  def apply(
    applyServerSideEncryptionByDefault: Input[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault]
  ): BucketServerSideEncryptionConfigurationRule = {
    val __obj = js.Dynamic.literal(applyServerSideEncryptionByDefault = applyServerSideEncryptionByDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketServerSideEncryptionConfigurationRule]
  }
  
  @scala.inline
  implicit class BucketServerSideEncryptionConfigurationRuleMutableBuilder[Self <: BucketServerSideEncryptionConfigurationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyServerSideEncryptionByDefault(value: Input[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault]): Self = StObject.set(x, "applyServerSideEncryptionByDefault", value.asInstanceOf[js.Any])
  }
}
