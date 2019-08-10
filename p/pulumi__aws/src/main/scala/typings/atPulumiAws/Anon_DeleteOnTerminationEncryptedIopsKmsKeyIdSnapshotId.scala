package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdSnapshotId extends js.Object {
  var deleteOnTermination: js.UndefOr[String] = js.undefined
  var encrypted: js.UndefOr[String] = js.undefined
  var iops: Double
  var kmsKeyId: js.UndefOr[String] = js.undefined
  var snapshotId: js.UndefOr[String] = js.undefined
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdSnapshotId {
  @scala.inline
  def apply(
    iops: Double,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: String = null,
    encrypted: String = null,
    kmsKeyId: String = null,
    snapshotId: String = null
  ): Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdSnapshotId = {
    val __obj = js.Dynamic.literal(iops = iops, volumeSize = volumeSize, volumeType = volumeType)
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted)
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId)
    __obj.asInstanceOf[Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdSnapshotId]
  }
}

