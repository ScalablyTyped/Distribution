package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfigurationEbsBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  var deviceName: String
  var encrypted: Boolean
  var iops: Double
  var noDevice: js.UndefOr[Boolean] = js.undefined
  var snapshotId: String
  var volumeSize: Double
  var volumeType: String
}

object LaunchConfigurationEbsBlockDevice {
  @scala.inline
  def apply(
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    noDevice: js.UndefOr[Boolean] = js.undefined
  ): LaunchConfigurationEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, encrypted = encrypted, iops = iops, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    if (!js.isUndefined(noDevice)) __obj.updateDynamic("noDevice")(noDevice)
    __obj.asInstanceOf[LaunchConfigurationEbsBlockDevice]
  }
}

