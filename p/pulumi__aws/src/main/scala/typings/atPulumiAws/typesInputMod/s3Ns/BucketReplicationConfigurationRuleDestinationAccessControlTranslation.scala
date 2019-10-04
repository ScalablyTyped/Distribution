package typings.atPulumiAws.typesInputMod.s3Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleDestinationAccessControlTranslation extends js.Object {
  /**
    * The override value for the owner on replicated objects. Currently only `Destination` is supported.
    */
  var owner: Input[String]
}

object BucketReplicationConfigurationRuleDestinationAccessControlTranslation {
  @scala.inline
  def apply(owner: Input[String]): BucketReplicationConfigurationRuleDestinationAccessControlTranslation = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketReplicationConfigurationRuleDestinationAccessControlTranslation]
  }
}

