package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecListenerPortMapping extends js.Object {
  /**
    * The destination port for the health check request. This port must match the port defined in the `portMapping` for the listener.
    */
  var port: Double = js.native
  /**
    * The protocol for the health check request. Valid values are `http` and `tcp`.
    */
  var protocol: String = js.native
}

object VirtualNodeSpecListenerPortMapping {
  @scala.inline
  def apply(port: Double, protocol: String): VirtualNodeSpecListenerPortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualNodeSpecListenerPortMapping]
  }
}

