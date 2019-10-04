package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiEphemeralBlockDevice extends js.Object {
  var deviceName: Input[String]
  var virtualName: Input[String]
}

object AmiEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: Input[String], virtualName: Input[String]): AmiEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], virtualName = virtualName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AmiEphemeralBlockDevice]
  }
}

