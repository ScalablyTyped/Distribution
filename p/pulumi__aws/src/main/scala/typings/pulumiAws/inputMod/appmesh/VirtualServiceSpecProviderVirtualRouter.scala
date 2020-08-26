package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpecProviderVirtualRouter extends js.Object {
  /**
    * The name of the virtual router that is acting as a service provider.
    */
  var virtualRouterName: Input[String] = js.native
}

object VirtualServiceSpecProviderVirtualRouter {
  @scala.inline
  def apply(virtualRouterName: Input[String]): VirtualServiceSpecProviderVirtualRouter = {
    val __obj = js.Dynamic.literal(virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualRouter]
  }
  @scala.inline
  implicit class VirtualServiceSpecProviderVirtualRouterOps[Self <: VirtualServiceSpecProviderVirtualRouter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVirtualRouterName(value: Input[String]): Self = this.set("virtualRouterName", value.asInstanceOf[js.Any])
  }
  
}

