package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualServiceSpecProvider extends StObject {
  
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
  implicit class VirtualServiceSpecProviderMutableBuilder[Self <: VirtualServiceSpecProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualNode(value: VirtualServiceSpecProviderVirtualNode): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualNodeUndefined: Self = StObject.set(x, "virtualNode", js.undefined)
    
    @scala.inline
    def setVirtualRouter(value: VirtualServiceSpecProviderVirtualRouter): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualRouterUndefined: Self = StObject.set(x, "virtualRouter", js.undefined)
  }
}
