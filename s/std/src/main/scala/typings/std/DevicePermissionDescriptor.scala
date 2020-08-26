package typings.std

import typings.std.stdStrings.camera
import typings.std.stdStrings.microphone
import typings.std.stdStrings.speaker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicePermissionDescriptor extends PermissionDescriptor {
  var deviceId: js.UndefOr[java.lang.String] = js.native
  @JSName("name")
  var name_DevicePermissionDescriptor: camera | microphone | speaker = js.native
}

object DevicePermissionDescriptor {
  @scala.inline
  def apply(name: camera | microphone | speaker): DevicePermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePermissionDescriptor]
  }
  @scala.inline
  implicit class DevicePermissionDescriptorOps[Self <: DevicePermissionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: camera | microphone | speaker): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: java.lang.String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
  }
  
}

