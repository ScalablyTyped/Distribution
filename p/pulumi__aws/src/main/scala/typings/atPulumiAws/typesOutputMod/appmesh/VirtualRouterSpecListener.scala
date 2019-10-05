package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterSpecListener extends js.Object {
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualRouterSpecListenerPortMapping
}

object VirtualRouterSpecListener {
  @scala.inline
  def apply(portMapping: VirtualRouterSpecListenerPortMapping): VirtualRouterSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping)
  
    __obj.asInstanceOf[VirtualRouterSpecListener]
  }
}

