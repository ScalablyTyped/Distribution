package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceEphemeralBlockDevice extends js.Object {
  /**
    * The name of the block device to mount on the instance.
    */
  var deviceName: Input[String]
  /**
    * Suppresses the specified device included in the AMI's block device mapping.
    */
  var noDevice: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The [Instance Store Device
    * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
    * (e.g. `"ephemeral0"`).
    */
  var virtualName: js.UndefOr[Input[String]] = js.undefined
}

object InstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String], noDevice: Input[Boolean] = null, virtualName: Input[String] = null): InstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEphemeralBlockDevice]
  }
}

