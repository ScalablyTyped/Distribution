package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceEphemeralBlockDevice extends js.Object {
  /**
    * The physical name of the device.
    */
  var deviceName: String = js.native
  /**
    * Whether the specified device included in the device mapping was suppressed or not (Boolean).
    */
  var noDevice: js.UndefOr[Boolean] = js.native
  /**
    * The virtual device name.
    */
  var virtualName: js.UndefOr[String] = js.native
}

object GetInstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, noDevice: js.UndefOr[Boolean] = js.undefined, virtualName: String = null): GetInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    if (!js.isUndefined(noDevice)) __obj.updateDynamic("noDevice")(noDevice.get.asInstanceOf[js.Any])
    if (virtualName != null) __obj.updateDynamic("virtualName")(virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceEphemeralBlockDevice]
  }
}

