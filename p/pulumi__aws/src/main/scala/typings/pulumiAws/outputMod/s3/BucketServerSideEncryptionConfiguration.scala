package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketServerSideEncryptionConfiguration extends js.Object {
  /**
    * A single object for server-side encryption by default configuration. (documented below)
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

