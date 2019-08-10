package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdVolumeSize extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var encrypted: Boolean
  var iops: Double
  var kmsKeyId: String
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdVolumeSize {
  @scala.inline
  def apply(
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdVolumeSize = {
    val __obj = js.Dynamic.literal(encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdVolumeSize]
  }
}

