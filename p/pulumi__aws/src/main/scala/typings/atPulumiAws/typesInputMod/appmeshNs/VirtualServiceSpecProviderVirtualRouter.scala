package typings.atPulumiAws.typesInputMod.appmeshNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceSpecProviderVirtualRouter extends js.Object {
  /**
    * The name of the virtual router that is acting as a service provider.
    */
  var virtualRouterName: Input[String]
}

object VirtualServiceSpecProviderVirtualRouter {
  @scala.inline
  def apply(virtualRouterName: Input[String]): VirtualServiceSpecProviderVirtualRouter = {
    val __obj = js.Dynamic.literal(virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualRouter]
  }
}

