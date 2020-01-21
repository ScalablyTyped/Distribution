package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketServerSideEncryptionConfiguration extends js.Object {
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: BucketServerSideEncryptionConfigurationRule = js.native
}

object BucketServerSideEncryptionConfiguration {
  @scala.inline
  def apply(rule: BucketServerSideEncryptionConfigurationRule): BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketServerSideEncryptionConfiguration]
  }
}

