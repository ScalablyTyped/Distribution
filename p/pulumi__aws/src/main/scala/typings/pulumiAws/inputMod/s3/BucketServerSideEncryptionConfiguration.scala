package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketServerSideEncryptionConfiguration extends js.Object {
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: Input[BucketServerSideEncryptionConfigurationRule] = js.native
}

object BucketServerSideEncryptionConfiguration {
  @scala.inline
  def apply(rule: Input[BucketServerSideEncryptionConfigurationRule]): BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketServerSideEncryptionConfiguration]
  }
}

