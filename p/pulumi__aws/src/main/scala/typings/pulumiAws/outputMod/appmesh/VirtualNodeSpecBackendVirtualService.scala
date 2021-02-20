package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendVirtualService extends StObject {
  
  /**
    * The client policy for the backend.
    */
  var clientPolicy: js.UndefOr[VirtualNodeSpecBackendVirtualServiceClientPolicy] = js.native
  
  /**
    * The name of the virtual service that is acting as a virtual node backend. Must be between 1 and 255 characters in length.
    */
  var virtualServiceName: String = js.native
}
object VirtualNodeSpecBackendVirtualService {
  
  @scala.inline
  def apply(virtualServiceName: String): VirtualNodeSpecBackendVirtualService = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualService]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendVirtualServiceMutableBuilder[Self <: VirtualNodeSpecBackendVirtualService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientPolicy(value: VirtualNodeSpecBackendVirtualServiceClientPolicy): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
    
    @scala.inline
    def setVirtualServiceName(value: String): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
