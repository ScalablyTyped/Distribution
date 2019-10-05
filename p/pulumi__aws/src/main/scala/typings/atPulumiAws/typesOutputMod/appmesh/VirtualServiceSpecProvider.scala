package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceSpecProvider extends js.Object {
  /**
    * The virtual node associated with a virtual service.
    */
  var virtualNode: js.UndefOr[VirtualServiceSpecProviderVirtualNode] = js.undefined
  /**
    * The virtual router associated with a virtual service.
    */
  var virtualRouter: js.UndefOr[VirtualServiceSpecProviderVirtualRouter] = js.undefined
}

object VirtualServiceSpecProvider {
  @scala.inline
  def apply(
    virtualNode: VirtualServiceSpecProviderVirtualNode = null,
    virtualRouter: VirtualServiceSpecProviderVirtualRouter = null
  ): VirtualServiceSpecProvider = {
    val __obj = js.Dynamic.literal()
    if (virtualNode != null) __obj.updateDynamic("virtualNode")(virtualNode)
    if (virtualRouter != null) __obj.updateDynamic("virtualRouter")(virtualRouter)
    __obj.asInstanceOf[VirtualServiceSpecProvider]
  }
}

