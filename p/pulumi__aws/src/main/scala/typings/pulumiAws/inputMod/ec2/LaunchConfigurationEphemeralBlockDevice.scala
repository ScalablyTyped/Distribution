package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfigurationEphemeralBlockDevice extends js.Object {
  var deviceName: Input[String] = js.native
  var virtualName: Input[String] = js.native
}

object LaunchConfigurationEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String], virtualName: Input[String]): LaunchConfigurationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationEphemeralBlockDevice]
  }
  @scala.inline
  implicit class LaunchConfigurationEphemeralBlockDeviceOps[Self <: LaunchConfigurationEphemeralBlockDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeviceName(value: Input[String]): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualName(value: Input[String]): Self = this.set("virtualName", value.asInstanceOf[js.Any])
  }
  
}

