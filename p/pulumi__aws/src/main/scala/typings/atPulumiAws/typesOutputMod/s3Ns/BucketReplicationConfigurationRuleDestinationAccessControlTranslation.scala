package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleDestinationAccessControlTranslation extends js.Object {
  /**
    * The override value for the owner on replicated objects. Currently only `Destination` is supported.
    */
  var owner: String
}

object BucketReplicationConfigurationRuleDestinationAccessControlTranslation {
  @scala.inline
  def apply(owner: String): BucketReplicationConfigurationRuleDestinationAccessControlTranslation = {
    val __obj = js.Dynamic.literal(owner = owner)
  
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]
  }
}

