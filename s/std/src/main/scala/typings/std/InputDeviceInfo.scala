package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputDeviceInfo extends MediaDeviceInfo {
  def getCapabilities(): MediaTrackCapabilities
}

object InputDeviceInfo {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    getCapabilities: () => MediaTrackCapabilities,
    groupId: java.lang.String,
    kind: MediaDeviceKind,
    label: java.lang.String,
    toJSON: () => js.Any
  ): InputDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], getCapabilities = js.Any.fromFunction0(getCapabilities), groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[InputDeviceInfo]
  }
}

