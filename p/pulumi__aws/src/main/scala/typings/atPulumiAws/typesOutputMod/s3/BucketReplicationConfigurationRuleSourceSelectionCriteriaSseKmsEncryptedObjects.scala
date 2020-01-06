package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects extends js.Object {
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Boolean = js.native
}

object BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects {
  @scala.inline
  def apply(enabled: Boolean): BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  }
}

