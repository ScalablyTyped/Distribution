package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId extends js.Object {
  var deleteOnTermination: Boolean
  var deviceName: String
  var encrypted: Boolean
  var iops: Double
  var snapshotId: String
  var volumeId: String
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String
  ): Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, deviceName = deviceName, encrypted = encrypted, iops = iops, snapshotId = snapshotId, volumeId = volumeId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId]
  }
}

