package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchConfigurationEphemeralBlockDevice extends js.Object {
  /**
    * The Name of the device.
    */
  var deviceName: String
  /**
    * The Virtual Name of the device.
    */
  var virtualName: String
}

object GetLaunchConfigurationEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): GetLaunchConfigurationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, virtualName = virtualName)
  
    __obj.asInstanceOf[GetLaunchConfigurationEphemeralBlockDevice]
  }
}

