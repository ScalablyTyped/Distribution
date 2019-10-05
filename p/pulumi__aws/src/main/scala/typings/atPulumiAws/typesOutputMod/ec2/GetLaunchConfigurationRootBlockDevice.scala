package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchConfigurationRootBlockDevice extends js.Object {
  /**
    * Whether the EBS Volume will be deleted on instance termination.
    */
  var deleteOnTermination: Boolean
  /**
    * Whether the volume is Encrypted.
    */
  var encrypted: Boolean
  /**
    * The provisioned IOPs of the volume.
    */
  var iops: Double
  /**
    * The Size of the volume.
    */
  var volumeSize: Double
  /**
    * The Type of the volume.
    */
  var volumeType: String
}

object GetLaunchConfigurationRootBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    encrypted: Boolean,
    iops: Double,
    volumeSize: Double,
    volumeType: String
  ): GetLaunchConfigurationRootBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, encrypted = encrypted, iops = iops, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[GetLaunchConfigurationRootBlockDevice]
  }
}

