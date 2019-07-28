package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceNameEbsNoDevice extends js.Object {
  var deviceName: js.UndefOr[String] = js.undefined
  var ebs: js.UndefOr[Anon_DeleteOnTerminationEncryptedIops] = js.undefined
  var noDevice: js.UndefOr[String] = js.undefined
  var virtualName: js.UndefOr[String] = js.undefined
}

object Anon_DeviceNameEbsNoDevice {
  @scala.inline
  def apply(
    deviceName: String = null,
    ebs: Anon_DeleteOnTerminationEncryptedIops = null,
    noDevice: String = null,
    virtualName: String = null
  ): Anon_DeviceNameEbsNoDevice = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName)
    if (ebs != null) __obj.updateDynamic("ebs")(ebs)
    if (noDevice != null) __obj.updateDynamic("noDevice")(noDevice)
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[Anon_DeviceNameEbsNoDevice]
  }
}

