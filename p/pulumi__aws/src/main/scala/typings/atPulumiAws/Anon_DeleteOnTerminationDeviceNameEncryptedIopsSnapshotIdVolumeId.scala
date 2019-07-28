package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeId extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var deviceName: String
  var encrypted: Boolean
  var iops: Double
  var snapshotId: String
  var volumeId: String
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeId {
  @scala.inline
  def apply(
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeId = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, encrypted = encrypted, iops = iops, snapshotId = snapshotId, volumeId = volumeId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotIdVolumeId]
  }
}

