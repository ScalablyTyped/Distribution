package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendVirtualService extends StObject {
  
  /**
    * The client policy for the backend.
    */
  var clientPolicy: js.UndefOr[Input[VirtualNodeSpecBackendVirtualServiceClientPolicy]] = js.undefined
  
  /**
    * The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
    */
  var virtualServiceName: Input[String]
}
object VirtualNodeSpecBackendVirtualService {
  
  inline def apply(virtualServiceName: Input[String]): VirtualNodeSpecBackendVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualService]
  }
  
  extension [Self <: VirtualNodeSpecBackendVirtualService](x: Self) {
    
    inline def setClientPolicy(value: Input[VirtualNodeSpecBackendVirtualServiceClientPolicy]): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    inline def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
    
    inline def setVirtualServiceName(value: Input[String]): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
