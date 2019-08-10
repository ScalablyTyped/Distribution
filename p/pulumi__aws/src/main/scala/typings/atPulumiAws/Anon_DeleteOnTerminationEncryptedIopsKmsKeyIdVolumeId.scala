package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdVolumeId extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var encrypted: Boolean
  var iops: Double
  var kmsKeyId: String
  var volumeId: String
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdVolumeId {
  @scala.inline
  def apply(
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdVolumeId = {
    val __obj = js.Dynamic.literal(encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, volumeId = volumeId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdVolumeId]
  }
}

