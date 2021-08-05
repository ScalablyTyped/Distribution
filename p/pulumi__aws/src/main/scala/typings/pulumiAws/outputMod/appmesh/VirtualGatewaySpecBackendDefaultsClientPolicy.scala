package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaultsClientPolicy extends StObject {
  
  /**
    * The Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[VirtualGatewaySpecBackendDefaultsClientPolicyTls] = js.undefined
}
object VirtualGatewaySpecBackendDefaultsClientPolicy {
  
  inline def apply(): VirtualGatewaySpecBackendDefaultsClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicy]
  }
  
  extension [Self <: VirtualGatewaySpecBackendDefaultsClientPolicy](x: Self) {
    
    inline def setTls(value: VirtualGatewaySpecBackendDefaultsClientPolicyTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
