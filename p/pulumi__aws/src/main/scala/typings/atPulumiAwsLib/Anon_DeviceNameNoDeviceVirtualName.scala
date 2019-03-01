package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameNoDeviceVirtualName extends js.Object {
  var deviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var noDevice: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var virtualName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_DeviceNameNoDeviceVirtualName {
  @scala.inline
  def apply(
    deviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    noDevice: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    virtualName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_DeviceNameNoDeviceVirtualName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceNameNoDeviceVirtualName]
  }
}

