package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDeviceInfo extends MediaDeviceInfo {
  def getCapabilities(): MediaTrackCapabilities = js.native
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
  @scala.inline
  implicit class InputDeviceInfoOps[Self <: InputDeviceInfo] (val x: Self) extends AnyVal {
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
    def setGetCapabilities(value: () => MediaTrackCapabilities): Self = this.set("getCapabilities", js.Any.fromFunction0(value))
  }
  
}

