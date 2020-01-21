package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

