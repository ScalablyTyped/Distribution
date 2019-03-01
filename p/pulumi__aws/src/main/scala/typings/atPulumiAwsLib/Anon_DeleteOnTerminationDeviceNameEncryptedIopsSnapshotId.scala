package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId extends js.Object {
  var deleteOnTermination: scala.Boolean
  var deviceName: java.lang.String
  var encrypted: scala.Boolean
  var iops: scala.Double
  var snapshotId: java.lang.String
  var volumeId: java.lang.String
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId {
  @scala.inline
  def apply(
    deleteOnTermination: scala.Boolean,
    deviceName: java.lang.String,
    encrypted: scala.Boolean,
    iops: scala.Double,
    snapshotId: java.lang.String,
    volumeId: java.lang.String,
    volumeSize: scala.Double,
    volumeType: java.lang.String
  ): Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.updateDynamic("deviceName")(deviceName)
    __obj.updateDynamic("encrypted")(encrypted)
    __obj.updateDynamic("iops")(iops)
    __obj.updateDynamic("snapshotId")(snapshotId)
    __obj.updateDynamic("volumeId")(volumeId)
    __obj.updateDynamic("volumeSize")(volumeSize)
    __obj.updateDynamic("volumeType")(volumeType)
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncryptedIopsSnapshotId]
  }
}

