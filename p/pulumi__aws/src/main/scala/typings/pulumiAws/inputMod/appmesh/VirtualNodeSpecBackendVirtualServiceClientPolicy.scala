package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecBackendVirtualServiceClientPolicy extends StObject {
  
  /**
    * The Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[Input[VirtualNodeSpecBackendVirtualServiceClientPolicyTls]] = js.undefined
}
object VirtualNodeSpecBackendVirtualServiceClientPolicy {
  
  inline def apply(): VirtualNodeSpecBackendVirtualServiceClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecBackendVirtualServiceClientPolicy]
  }
  
  extension [Self <: VirtualNodeSpecBackendVirtualServiceClientPolicy](x: Self) {
    
    inline def setTls(value: Input[VirtualNodeSpecBackendVirtualServiceClientPolicyTls]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
