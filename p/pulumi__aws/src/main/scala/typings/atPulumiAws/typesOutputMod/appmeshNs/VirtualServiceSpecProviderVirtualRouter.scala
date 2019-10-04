package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceSpecProviderVirtualRouter extends js.Object {
  /**
    * The name of the virtual router that is acting as a service provider.
    */
  var virtualRouterName: String
}

object VirtualServiceSpecProviderVirtualRouter {
  @scala.inline
  def apply(virtualRouterName: String): VirtualServiceSpecProviderVirtualRouter = {
    val __obj = js.Dynamic.literal(virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualRouter]
  }
}

