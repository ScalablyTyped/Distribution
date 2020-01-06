package typings.atPulumiAws.typesInputMod.appmesh

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpecProvider extends js.Object {
  /**
    * The virtual node associated with a virtual service.
    */
  var virtualNode: js.UndefOr[Input[VirtualServiceSpecProviderVirtualNode]] = js.native
  /**
    * The virtual router associated with a virtual service.
    */
  var virtualRouter: js.UndefOr[Input[VirtualServiceSpecProviderVirtualRouter]] = js.native
}

object VirtualServiceSpecProvider {
  @scala.inline
  def apply(
    virtualNode: Input[VirtualServiceSpecProviderVirtualNode] = null,
    virtualRouter: Input[VirtualServiceSpecProviderVirtualRouter] = null
  ): VirtualServiceSpecProvider = {
    val __obj = js.Dynamic.literal()
    if (virtualNode != null) __obj.updateDynamic("virtualNode")(virtualNode.asInstanceOf[js.Any])
    if (virtualRouter != null) __obj.updateDynamic("virtualRouter")(virtualRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpecProvider]
  }
}

