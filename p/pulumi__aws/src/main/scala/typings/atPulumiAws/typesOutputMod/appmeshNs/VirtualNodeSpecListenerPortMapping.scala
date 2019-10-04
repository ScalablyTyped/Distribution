package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecListenerPortMapping extends js.Object {
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: Double
  /**
    * The protocol for the health check request. Valid values are `http` and `tcp`.
    */
  var protocol: String
}

object VirtualNodeSpecListenerPortMapping {
  @scala.inline
  def apply(port: Double, protocol: String): VirtualNodeSpecListenerPortMapping = {
    val __obj = js.Dynamic.literal(port = port, protocol = protocol)
  
    __obj.asInstanceOf[VirtualNodeSpecListenerPortMapping]
  }
}

