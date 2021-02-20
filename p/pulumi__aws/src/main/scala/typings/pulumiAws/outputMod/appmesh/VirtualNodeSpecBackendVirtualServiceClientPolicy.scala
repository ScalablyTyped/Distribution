package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendVirtualServiceClientPolicy extends StObject {
  
  /**
    * The Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[VirtualNodeSpecBackendVirtualServiceClientPolicyTls] = js.native
}
object VirtualNodeSpecBackendVirtualServiceClientPolicy {
  
  @scala.inline
  def apply(): VirtualNodeSpecBackendVirtualServiceClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualServiceClientPolicy]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendVirtualServiceClientPolicyMutableBuilder[Self <: VirtualNodeSpecBackendVirtualServiceClientPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTls(value: VirtualNodeSpecBackendVirtualServiceClientPolicyTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
