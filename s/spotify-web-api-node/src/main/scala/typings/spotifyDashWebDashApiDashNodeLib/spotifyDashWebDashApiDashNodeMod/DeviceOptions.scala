package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceOptions extends js.Object {
  var device_id: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceOptions {
  @scala.inline
  def apply(device_id: java.lang.String = null): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    if (device_id != null) __obj.updateDynamic("device_id")(device_id)
    __obj.asInstanceOf[DeviceOptions]
  }
}

