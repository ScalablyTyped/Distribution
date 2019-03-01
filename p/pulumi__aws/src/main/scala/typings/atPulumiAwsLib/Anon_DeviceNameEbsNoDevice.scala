package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameEbsNoDevice extends js.Object {
  var deviceName: js.UndefOr[java.lang.String] = js.undefined
  var ebs: js.UndefOr[Anon_DeleteOnTerminationEncryptedIops] = js.undefined
  var noDevice: js.UndefOr[java.lang.String] = js.undefined
  var virtualName: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DeviceNameEbsNoDevice {
  @scala.inline
  def apply(
    deviceName: java.lang.String = null,
    ebs: Anon_DeleteOnTerminationEncryptedIops = null,
    noDevice: java.lang.String = null,
    virtualName: java.lang.String = null
  ): Anon_DeviceNameEbsNoDevice = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (ebs != null) __obj.updateDynamic("ebs")(ebs)
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice)
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[Anon_DeviceNameEbsNoDevice]
  }
}

