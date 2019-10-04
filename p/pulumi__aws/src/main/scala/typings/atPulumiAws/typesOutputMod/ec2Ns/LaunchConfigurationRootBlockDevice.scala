package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfigurationRootBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var encrypted: Boolean
  var iops: Double
  var volumeSize: Double
  var volumeType: String
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
    val __obj = js.Dynamic.literal(encrypted = encrypted, iops = iops, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[LaunchConfigurationRootBlockDevice]
  }
}

