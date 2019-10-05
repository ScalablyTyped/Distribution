package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterSpecListenerPortMapping extends js.Object {
  /**
    * The port used for the port mapping.
    */
  var port: Double
  /**
    * The protocol used for the port mapping. Valid values are `http` and `tcp`.
    */
  var protocol: String
}

object VirtualRouterSpecListenerPortMapping {
  @scala.inline
  def apply(port: Double, protocol: String): VirtualRouterSpecListenerPortMapping = {
    val __obj = js.Dynamic.literal(port = port, protocol = protocol)
  
    __obj.asInstanceOf[VirtualRouterSpecListenerPortMapping]
  }
}

