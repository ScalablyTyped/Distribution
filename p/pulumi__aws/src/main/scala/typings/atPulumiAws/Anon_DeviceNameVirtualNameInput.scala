package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameVirtualNameInput extends js.Object {
  var deviceName: js.UndefOr[Input[String]] = js.undefined
  var virtualName: js.UndefOr[Input[String]] = js.undefined
}

object Anon_DeviceNameVirtualNameInput {
  @scala.inline
  def apply(deviceName: Input[String] = null, virtualName: Input[String] = null): Anon_DeviceNameVirtualNameInput = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceNameVirtualNameInput]
  }
}

