package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchConfigurationEbsBlockDevice extends js.Object {
  /**
    * Whether the EBS Volume will be deleted on instance termination.
    */
  var deleteOnTermination: Boolean = js.native
  /**
    * The Name of the device.
    */
  var deviceName: String = js.native
  /**
    * Whether the volume is Encrypted.
    */
  var encrypted: Boolean = js.native
  /**
    * The provisioned IOPs of the volume.
    */
  var iops: Double = js.native
  /**
    * The Snapshot ID of the mount.
    */
  var snapshotId: String = js.native
  /**
    * The Size of the volume.
    */
  var volumeSize: Double = js.native
  /**
    * The Type of the volume.
    */
  var volumeType: String = js.native
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
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationEbsBlockDevice]
  }
}

