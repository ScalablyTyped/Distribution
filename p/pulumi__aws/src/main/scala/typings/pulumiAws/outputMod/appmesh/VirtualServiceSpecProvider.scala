package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualServiceSpecProvider extends StObject {
  
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
  
  inline def apply(): VirtualServiceSpecProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualServiceSpecProvider]
  }
  
  extension [Self <: VirtualServiceSpecProvider](x: Self) {
    
    inline def setVirtualNode(value: VirtualServiceSpecProviderVirtualNode): Self = StObject.set(x, "virtualNode", value.asInstanceOf[js.Any])
    
    inline def setVirtualNodeUndefined: Self = StObject.set(x, "virtualNode", js.undefined)
    
    inline def setVirtualRouter(value: VirtualServiceSpecProviderVirtualRouter): Self = StObject.set(x, "virtualRouter", value.asInstanceOf[js.Any])
    
    inline def setVirtualRouterUndefined: Self = StObject.set(x, "virtualRouter", js.undefined)
  }
}
