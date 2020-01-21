package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpecProvider extends js.Object {
  /**
    * The virtual node associated with a virtual service.
    */
  var virtualNode: js.UndefOr[VirtualServiceSpecProviderVirtualNode] = js.native
  /**
    * The virtual router associated with a virtual service.
    */
  var virtualRouter: js.UndefOr[VirtualServiceSpecProviderVirtualRouter] = js.native
}

object VirtualServiceSpecProvider {
  @scala.inline
  def apply(
    virtualNode: VirtualServiceSpecProviderVirtualNode = null,
    virtualRouter: VirtualServiceSpecProviderVirtualRouter = null
  ): VirtualServiceSpecProvider = {
    val __obj = js.Dynamic.literal()
    if (virtualNode != null) __obj.updateDynamic("virtualNode")(virtualNode.asInstanceOf[js.Any])
    if (virtualRouter != null) __obj.updateDynamic("virtualRouter")(virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpecProvider]
  }
}

