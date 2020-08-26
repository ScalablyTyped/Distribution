package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpecProviderVirtualNode extends js.Object {
  /**
    * The name of the virtual node that is acting as a service provider.
    */
  var virtualNodeName: String = js.native
}

object VirtualServiceSpecProviderVirtualNode {
  @scala.inline
  def apply(virtualNodeName: String): VirtualServiceSpecProviderVirtualNode = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpecProviderVirtualNode]
  }
  @scala.inline
  implicit class VirtualServiceSpecProviderVirtualNodeOps[Self <: VirtualServiceSpecProviderVirtualNode] (val x: Self) extends AnyVal {
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
    def setVirtualNodeName(value: String): Self = this.set("virtualNodeName", value.asInstanceOf[js.Any])
  }
  
}

