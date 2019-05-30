package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DevicePermissionDescriptor extends PermissionDescriptor {
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  @JSName("name")
  var name_DevicePermissionDescriptor: stdLib.stdLibStrings.camera | stdLib.stdLibStrings.microphone | stdLib.stdLibStrings.speaker
}

object DevicePermissionDescriptor {
  @scala.inline
  def apply(
    name: stdLib.stdLibStrings.camera | stdLib.stdLibStrings.microphone | stdLib.stdLibStrings.speaker,
    deviceId: java.lang.String = null
  ): DevicePermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    __obj.asInstanceOf[DevicePermissionDescriptor]
  }
}

