package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameVirtualName extends js.Object {
  var deviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var virtualName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_DeviceNameVirtualName {
  @scala.inline
  def apply(
    deviceName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    virtualName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_DeviceNameVirtualName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeviceNameVirtualName]
  }
}

