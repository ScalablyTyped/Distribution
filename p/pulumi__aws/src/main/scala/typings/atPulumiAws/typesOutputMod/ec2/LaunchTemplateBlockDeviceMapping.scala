package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateBlockDeviceMapping extends js.Object {
  /**
    * The name of the device to mount.
    */
  var deviceName: js.UndefOr[String] = js.undefined
  /**
    * Configure EBS volume properties.
    */
  var ebs: js.UndefOr[LaunchTemplateBlockDeviceMappingEbs] = js.undefined
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[String] = js.undefined
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[String] = js.undefined
}

object LaunchTemplateBlockDeviceMapping {
  @scala.inline
  def apply(
    deviceName: String = null,
    ebs: LaunchTemplateBlockDeviceMappingEbs = null,
    noDevice: String = null,
    virtualName: String = null
  ): LaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (ebs != null) __obj.updateDynamic("ebs")(ebs)
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice)
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMapping]
  }
}

