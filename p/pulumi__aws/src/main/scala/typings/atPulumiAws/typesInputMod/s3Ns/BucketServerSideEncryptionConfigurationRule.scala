package typings.atPulumiAws.typesInputMod.s3Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketServerSideEncryptionConfigurationRule extends js.Object {
  /**
    * A single object for setting server-side encryption by default. (documented below)
    */
  var applyServerSideEncryptionByDefault: Input[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault]
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

