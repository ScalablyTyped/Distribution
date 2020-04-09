package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecListenerPortMapping extends js.Object {
  /**
    * The port used for the port mapping.
    */
  var port: Double = js.native
  /**
    * The protocol used for the port mapping. Valid values are `http` and `tcp`.
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

