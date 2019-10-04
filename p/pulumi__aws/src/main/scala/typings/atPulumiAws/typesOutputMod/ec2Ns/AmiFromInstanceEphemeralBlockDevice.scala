package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiFromInstanceEphemeralBlockDevice extends js.Object {
  var deviceName: String
  var virtualName: String
}

object AmiFromInstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): AmiFromInstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, virtualName = virtualName)
  
    __obj.asInstanceOf[AmiFromInstanceEphemeralBlockDevice]
  }
}

