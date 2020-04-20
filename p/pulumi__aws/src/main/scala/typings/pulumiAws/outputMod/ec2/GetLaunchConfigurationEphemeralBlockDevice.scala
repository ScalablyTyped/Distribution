package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchConfigurationEphemeralBlockDevice extends js.Object {
  /**
    * The Name of the device.
    */
  var deviceName: String = js.native
  /**
    * The Virtual Name of the device.
    */
  var virtualName: String = js.native
}

object GetLaunchConfigurationEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): GetLaunchConfigurationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchConfigurationEphemeralBlockDevice]
  }
}

