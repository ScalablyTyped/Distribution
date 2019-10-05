package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotFleetRequestLaunchSpecificationEphemeralBlockDevice extends js.Object {
  var deviceName: String
  var virtualName: String
}

object SpotFleetRequestLaunchSpecificationEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): SpotFleetRequestLaunchSpecificationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, virtualName = virtualName)
  
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]
  }
}

