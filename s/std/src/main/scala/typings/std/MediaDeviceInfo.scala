package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MediaDevicesInfo interface contains information that describes a single media input or output device. */
trait MediaDeviceInfo extends js.Object {
  val deviceId: java.lang.String
  val groupId: java.lang.String
  val kind: MediaDeviceKind
  val label: java.lang.String
  def toJSON(): js.Any
}

object MediaDeviceInfo {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    groupId: java.lang.String,
    kind: MediaDeviceKind,
    label: java.lang.String,
    toJSON: () => js.Any
  ): MediaDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MediaDeviceInfo]
  }
}

