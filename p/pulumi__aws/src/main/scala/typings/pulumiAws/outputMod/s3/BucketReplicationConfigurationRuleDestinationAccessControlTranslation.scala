package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRuleDestinationAccessControlTranslation extends js.Object {
  /**
    * The override value for the owner on replicated objects. Currently only `Destination` is supported.
    */
  var owner: String = js.native
}

object BucketReplicationConfigurationRuleDestinationAccessControlTranslation {
  @scala.inline
  def apply(owner: String): BucketReplicationConfigurationRuleDestinationAccessControlTranslation = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]
  }
}

