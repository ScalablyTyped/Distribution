package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketServerSideEncryptionConfiguration extends js.Object {
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: Input[BucketServerSideEncryptionConfigurationRule]
}

object BucketServerSideEncryptionConfiguration {
  @scala.inline
  def apply(rule: Input[BucketServerSideEncryptionConfigurationRule]): BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketServerSideEncryptionConfiguration]
  }
}

