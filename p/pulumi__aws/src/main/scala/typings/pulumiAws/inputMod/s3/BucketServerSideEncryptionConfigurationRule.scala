package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketServerSideEncryptionConfigurationRule extends js.Object {
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
}

