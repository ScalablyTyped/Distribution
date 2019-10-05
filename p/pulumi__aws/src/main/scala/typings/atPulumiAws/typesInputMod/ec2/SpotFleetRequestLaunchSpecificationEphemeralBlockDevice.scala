package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpotFleetRequestLaunchSpecificationEphemeralBlockDevice extends js.Object {
  var deviceName: Input[String]
  var virtualName: Input[String]
}

object SpotFleetRequestLaunchSpecificationEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String], virtualName: Input[String]): SpotFleetRequestLaunchSpecificationEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpotFleetRequestLaunchSpecificationEphemeralBlockDevice]
  }
}

