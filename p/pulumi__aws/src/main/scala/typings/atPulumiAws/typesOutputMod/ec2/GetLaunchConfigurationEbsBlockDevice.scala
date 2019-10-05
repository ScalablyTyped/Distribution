package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchConfigurationEbsBlockDevice extends js.Object {
  /**
    * Whether the EBS Volume will be deleted on instance termination.
    */
  var deleteOnTermination: Boolean
  /**
    * The Name of the device.
    */
  var deviceName: String
  /**
    * Whether the volume is Encrypted.
    */
  var encrypted: Boolean
  /**
    * The provisioned IOPs of the volume.
    */
  var iops: Double
  /**
    * The Snapshot ID of the mount.
    */
  var snapshotId: String
  /**
    * The Size of the volume.
    */
  var volumeSize: Double
  /**
    * The Type of the volume.
    */
  var volumeType: String
}

object GetLaunchConfigurationEbsBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): GetLaunchConfigurationEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, deviceName = deviceName, encrypted = encrypted, iops = iops, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[GetLaunchConfigurationEbsBlockDevice]
  }
}

