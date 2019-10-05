package typings.atPulumiAws.typesOutputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleSourceSelectionCriteria extends js.Object {
  /**
    * Match SSE-KMS encrypted objects (documented below). If specified, `replicaKmsKeyId`
    * in `destination` must be specified as well.
    */
  var sseKmsEncryptedObjects: js.UndefOr[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects] = js.undefined
}

object BucketReplicationConfigurationRuleSourceSelectionCriteria {
  @scala.inline
  def apply(
    sseKmsEncryptedObjects: BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects = null
  ): BucketReplicationConfigurationRuleSourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (sseKmsEncryptedObjects != null) __obj.updateDynamic("sseKmsEncryptedObjects")(sseKmsEncryptedObjects)
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteria]
  }
}

