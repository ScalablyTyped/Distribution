package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterSpecListener extends js.Object {
  /**
    * The port mapping information for the listener.
    */
  var portMapping: VirtualRouterSpecListenerPortMapping = js.native
}

object VirtualRouterSpecListener {
  @scala.inline
  def apply(portMapping: VirtualRouterSpecListenerPortMapping): VirtualRouterSpecListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualRouterSpecListener]
  }
}

