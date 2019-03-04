package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeleteOnTerminationDeviceNameEncrypted extends js.Object {
  var deleteOnTermination: scala.Boolean
  var deviceName: java.lang.String
  var encrypted: scala.Boolean
  var iops: scala.Double
  var snapshotId: java.lang.String
  var volumeSize: scala.Double
  var volumeType: java.lang.String
}

object Anon_DeleteOnTerminationDeviceNameEncrypted {
  @scala.inline
  def apply(
    deleteOnTermination: scala.Boolean,
    deviceName: java.lang.String,
    encrypted: scala.Boolean,
    iops: scala.Double,
    snapshotId: java.lang.String,
    volumeSize: scala.Double,
    volumeType: java.lang.String
  ): Anon_DeleteOnTerminationDeviceNameEncrypted = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, deviceName = deviceName, encrypted = encrypted, iops = iops, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[Anon_DeleteOnTerminationDeviceNameEncrypted]
  }
}

