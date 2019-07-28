package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncrypted extends js.Object {
  var deleteOnTermination: Boolean
  var deviceName: String
  var encrypted: Boolean
  var iops: Double
  var snapshotId: String
  var volumeSize: Double
  var volumeType: String
}

object Anon_DeleteOnTerminationDeviceNameEncrypted {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): Anon_DeleteOnTerminationDeviceNameEncrypted = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, deviceName = deviceName, encrypted = encrypted, iops = iops, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncrypted]
  }
}

