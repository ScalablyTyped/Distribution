package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceEphemeralBlockDevice extends js.Object {
  /**
    * The physical name of the device.
    */
  var deviceName: String = js.native
  /**
    * Whether the specified device included in the device mapping was suppressed or not (Boolean).
    */
  var noDevice: js.UndefOr[Boolean] = js.native
  /**
    * The virtual device name.
    */
  var virtualName: js.UndefOr[String] = js.native
}

object GetInstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String): GetInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceEphemeralBlockDevice]
  }
  @scala.inline
  implicit class GetInstanceEphemeralBlockDeviceOps[Self <: GetInstanceEphemeralBlockDevice] (val x: Self) extends AnyVal {
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
    def setNoDevice(value: Boolean): Self = this.set("noDevice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoDevice: Self = this.set("noDevice", js.undefined)
    @scala.inline
    def setVirtualName(value: String): Self = this.set("virtualName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualName: Self = this.set("virtualName", js.undefined)
  }
  
}

