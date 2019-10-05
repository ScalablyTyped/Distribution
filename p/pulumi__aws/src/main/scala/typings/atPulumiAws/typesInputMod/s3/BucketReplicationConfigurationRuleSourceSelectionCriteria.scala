package typings.atPulumiAws.typesInputMod.s3

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleSourceSelectionCriteria extends js.Object {
  /**
    * Match SSE-KMS encrypted objects (documented below). If specified, `replicaKmsKeyId`
    * in `destination` must be specified as well.
    */
  var sseKmsEncryptedObjects: js.UndefOr[
    Input[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects]
  ] = js.undefined
}

object BucketReplicationConfigurationRuleSourceSelectionCriteria {
  @scala.inline
  def apply(
    sseKmsEncryptedObjects: Input[BucketReplicationConfigurationRuleSourceSelectionCriteriaSseKmsEncryptedObjects] = null
  ): BucketReplicationConfigurationRuleSourceSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (sseKmsEncryptedObjects != null) __obj.updateDynamic("sseKmsEncryptedObjects")(sseKmsEncryptedObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleSourceSelectionCriteria]
  }
}

