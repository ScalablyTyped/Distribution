package typings.atPulumiAws.typesInputMod.opsworks

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceEphemeralBlockDevice extends js.Object {
  var deviceName: Input[String]
  var virtualName: Input[String]
}

object InstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String], virtualName: Input[String]): InstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InstanceEphemeralBlockDevice]
  }
}

