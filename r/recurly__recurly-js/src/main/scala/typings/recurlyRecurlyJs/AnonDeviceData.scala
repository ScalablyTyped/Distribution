package typings.recurlyRecurlyJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeviceData extends js.Object {
  var deviceData: js.UndefOr[String] = js.undefined
}

object AnonDeviceData {
  @scala.inline
  def apply(deviceData: String = null): AnonDeviceData = {
    val __obj = js.Dynamic.literal()
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeviceData]
  }
}

