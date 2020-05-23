package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceData extends js.Object {
  var deviceData: js.UndefOr[String] = js.undefined
}

object DeviceData {
  @scala.inline
  def apply(deviceData: String = null): DeviceData = {
    val __obj = js.Dynamic.literal()
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceData]
  }
}

