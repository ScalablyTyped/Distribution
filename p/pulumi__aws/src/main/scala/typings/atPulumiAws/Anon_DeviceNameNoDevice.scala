package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameNoDevice extends js.Object {
  var deviceName: String
  var noDevice: js.UndefOr[Boolean] = js.undefined
  var virtualName: js.UndefOr[String] = js.undefined
}

object Anon_DeviceNameNoDevice {
  @scala.inline
  def apply(deviceName: String, noDevice: js.UndefOr[Boolean] = js.undefined, virtualName: String = null): Anon_DeviceNameNoDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName)
    if (!js.isUndefined(noDevice)) __obj.updateDynamic("noDevice")(noDevice)
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[Anon_DeviceNameNoDevice]
  }
}

