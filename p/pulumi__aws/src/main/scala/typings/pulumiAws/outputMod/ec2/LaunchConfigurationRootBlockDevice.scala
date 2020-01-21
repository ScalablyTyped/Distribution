package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfigurationRootBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  var encrypted: Boolean = js.native
  var iops: Double = js.native
  var volumeSize: Double = js.native
  var volumeType: String = js.native
}

object LaunchConfigurationRootBlockDevice {
  @scala.inline
  def apply(
    encrypted: Boolean,
    iops: Double,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): LaunchConfigurationRootBlockDevice = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationRootBlockDevice]
  }
}

