package typings.atPulumiAws.typesInputMod.s3Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects extends js.Object {
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Input[Boolean]
}

object BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects {
  @scala.inline
  def apply(enabled: Input[Boolean]): BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  }
}

