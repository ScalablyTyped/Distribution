package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceEphemeralBlockDevice extends js.Object {
  /**
    * The physical name of the device.
    */
  var deviceName: String
  /**
    * Whether the specified device included in the device mapping was suppressed or not (Boolean).
    */
  var noDevice: js.UndefOr[Boolean] = js.undefined
  /**
    * The virtual device name.
    */
  var virtualName: js.UndefOr[String] = js.undefined
}

object GetInstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, noDevice: js.UndefOr[Boolean] = js.undefined, virtualName: String = null): GetInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName)
    if (!js.isUndefined(noDevice)) __obj.updateDynamic("noDevice")(noDevice)
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName)
    __obj.asInstanceOf[GetInstanceEphemeralBlockDevice]
  }
}

