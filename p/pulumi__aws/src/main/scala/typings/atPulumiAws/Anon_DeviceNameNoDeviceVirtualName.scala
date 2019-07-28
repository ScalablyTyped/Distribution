package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameNoDeviceVirtualName extends js.Object {
  var deviceName: Input[String]
  var noDevice: js.UndefOr[Input[Boolean]] = js.undefined
  var virtualName: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DeviceNameNoDeviceVirtualName {
  @scala.inline
  def apply(deviceName: Input[String], noDevice: Input[Boolean] = null, virtualName: Input[String] = null): Anon_DeviceNameNoDeviceVirtualName = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceNameNoDeviceVirtualName]
  }
}

