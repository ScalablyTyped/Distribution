package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameEbsNoDeviceVirtualName extends js.Object {
  var deviceName: js.UndefOr[Input[String]] = js.undefined
  var ebs: js.UndefOr[Input[Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdSnapshotIdVolumeSize]] = js.undefined
  var noDevice: js.UndefOr[Input[String]] = js.undefined
  var virtualName: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DeviceNameEbsNoDeviceVirtualName {
  @scala.inline
  def apply(
    deviceName: Input[String] = null,
    ebs: Input[Anon_DeleteOnTerminationEncryptedIopsKmsKeyIdSnapshotIdVolumeSize] = null,
    noDevice: Input[String] = null,
    virtualName: Input[String] = null
  ): Anon_DeviceNameEbsNoDeviceVirtualName = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (ebs != null) __obj.updateDynamic("ebs")(ebs.asInstanceOf[js.Any])
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceNameEbsNoDeviceVirtualName]
  }
}

