package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects extends js.Object {
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Input[Boolean] = js.native
}

object BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects {
  @scala.inline
  def apply(enabled: Input[Boolean]): BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  }
}

