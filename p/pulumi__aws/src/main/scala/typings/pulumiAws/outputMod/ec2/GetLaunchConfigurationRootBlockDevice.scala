package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchConfigurationRootBlockDevice extends js.Object {
  /**
    * Whether the EBS Volume will be deleted on instance termination.
    */
  var deleteOnTermination: Boolean = js.native
  /**
    * Whether the volume is Encrypted.
    */
  var encrypted: Boolean = js.native
  /**
    * The provisioned IOPs of the volume.
    */
  var iops: Double = js.native
  /**
    * The Size of the volume.
    */
  var volumeSize: Double = js.native
  /**
    * The Type of the volume.
    */
  var volumeType: String = js.native
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
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationRootBlockDevice]
  }
}

