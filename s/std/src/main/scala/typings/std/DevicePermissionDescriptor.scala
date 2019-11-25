package typings.std

import typings.std.stdStrings.camera
import typings.std.stdStrings.microphone
import typings.std.stdStrings.speaker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicePermissionDescriptor extends PermissionDescriptor {
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  @JSName("name")
  var name_DevicePermissionDescriptor: camera | microphone | speaker
}

object DevicePermissionDescriptor {
  @scala.inline
  def apply(name: camera | microphone | speaker, deviceId: java.lang.String = null): DevicePermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePermissionDescriptor]
  }
}

