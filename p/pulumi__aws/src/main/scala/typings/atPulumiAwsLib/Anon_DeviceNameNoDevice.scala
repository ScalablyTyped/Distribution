package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameNoDevice extends js.Object {
  var deviceName: java.lang.String
  var noDevice: js.UndefOr[scala.Boolean] = js.undefined
  var virtualName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DeviceNameNoDevice {
  @scala.inline
  def apply(
    deviceName: java.lang.String,
    noDevice: js.UndefOr[scala.Boolean] = js.undefined,
    virtualName: java.lang.String = null
  ): Anon_DeviceNameNoDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName)
    if (!js.isUndefined(noDevice)) __obj.updateDynamic("noDevice")(noDevice)
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[Anon_DeviceNameNoDevice]
  }
}

