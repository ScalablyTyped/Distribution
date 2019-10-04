package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects extends js.Object {
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Boolean
}

object BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects {
  @scala.inline
  def apply(enabled: Boolean): BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(enabled = enabled)
  
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  }
}

