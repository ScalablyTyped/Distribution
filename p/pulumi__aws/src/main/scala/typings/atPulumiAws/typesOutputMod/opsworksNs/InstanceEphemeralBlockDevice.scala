package typings.atPulumiAws.typesOutputMod.opsworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceEphemeralBlockDevice extends js.Object {
  var deviceName: String
  var virtualName: String
}

object InstanceEphemeralBlockDevice {
  @scala.inline
  def apply(deviceName: String, virtualName: String): InstanceEphemeralBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, virtualName = virtualName)
  
    __obj.asInstanceOf[InstanceEphemeralBlockDevice]
  }
}

