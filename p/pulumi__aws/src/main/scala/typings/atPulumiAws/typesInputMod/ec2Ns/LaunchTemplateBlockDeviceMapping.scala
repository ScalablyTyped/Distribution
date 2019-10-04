package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateBlockDeviceMapping extends js.Object {
  /**
    * The name of the device to mount.
    */
  var deviceName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Configure EBS volume properties.
    */
  var ebs: js.UndefOr[Input[LaunchTemplateBlockDeviceMappingEbs]] = js.undefined
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[Input[String]] = js.undefined
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[Input[String]] = js.undefined
}

object LaunchTemplateBlockDeviceMapping {
  @scala.inline
  def apply(
    deviceName: Input[String] = null,
    ebs: Input[LaunchTemplateBlockDeviceMappingEbs] = null,
    noDevice: Input[String] = null,
    virtualName: Input[String] = null
  ): LaunchTemplateBlockDeviceMapping = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (ebs != null) __obj.updateDynamic("ebs")(ebs.asInstanceOf[js.Any])
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMapping]
  }
}

