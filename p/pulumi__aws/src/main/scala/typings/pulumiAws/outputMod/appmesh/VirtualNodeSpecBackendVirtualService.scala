package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendVirtualService extends StObject {
  
  /**
    * The client policy for the backend.
    */
  var clientPolicy: js.UndefOr[VirtualNodeSpecBackendVirtualServiceClientPolicy] = js.undefined
  
  /**
    * The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
    */
  var virtualServiceName: String
}
object VirtualNodeSpecBackendVirtualService {
  
  inline def apply(virtualServiceName: String): VirtualNodeSpecBackendVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualService]
  }
  
  extension [Self <: VirtualNodeSpecBackendVirtualService](x: Self) {
    
    inline def setClientPolicy(value: VirtualNodeSpecBackendVirtualServiceClientPolicy): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    inline def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
    
    inline def setVirtualServiceName(value: String): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
