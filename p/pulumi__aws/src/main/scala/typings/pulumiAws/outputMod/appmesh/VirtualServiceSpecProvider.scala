package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): VirtualServiceSpecProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceSpecProvider]
  }
  
  @scala.inline
  implicit class VirtualServiceSpecProviderOps[Self <: VirtualServiceSpecProvider] (val x: Self) extends AnyVal {
    
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
    def setVirtualNode(value: VirtualServiceSpecProviderVirtualNode): Self = this.set("virtualNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualNode: Self = this.set("virtualNode", js.undefined)
    
    @scala.inline
    def setVirtualRouter(value: VirtualServiceSpecProviderVirtualRouter): Self = this.set("virtualRouter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualRouter: Self = this.set("virtualRouter", js.undefined)
  }
}
