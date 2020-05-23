package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaDevicesEventMap extends js.Object {
  var devicechange: Event
}

object MediaDevicesEventMap {
  @scala.inline
  def apply(devicechange: Event): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
}

