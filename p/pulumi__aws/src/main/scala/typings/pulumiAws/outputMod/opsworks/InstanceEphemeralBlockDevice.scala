package typings.pulumiAws.outputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceEphemeralBlockDevice extends js.Object {
  var deviceName: String = js.native
  var virtualName: String = js.native
}

object InstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): InstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceEphemeralBlockDevice]
  }
  @scala.inline
  implicit class InstanceEphemeralBlockDeviceOps[Self <: InstanceEphemeralBlockDevice] (val x: Self) extends AnyVal {
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
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualName(value: String): Self = this.set("virtualName", value.asInstanceOf[js.Any])
  }
  
}

