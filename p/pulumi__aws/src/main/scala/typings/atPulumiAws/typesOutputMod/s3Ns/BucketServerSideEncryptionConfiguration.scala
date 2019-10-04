package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketServerSideEncryptionConfiguration extends js.Object {
  /**
    * The Object Lock rule in place for this bucket.
    */
  var rule: BucketServerSideEncryptionConfigurationRule
}

object BucketServerSideEncryptionConfiguration {
  @scala.inline
  def apply(rule: BucketServerSideEncryptionConfigurationRule): BucketServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal(rule = rule)
  
    __obj.asInstanceOf[BucketServerSideEncryptionConfiguration]
  }
}

