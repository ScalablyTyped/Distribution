package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaultsClientPolicyTls extends StObject {
  
  var enforce: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more ports that the policy is enforced for.
    */
  var ports: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The TLS validation context.
    */
  var validation: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation
}
object VirtualGatewaySpecBackendDefaultsClientPolicyTls {
  
  inline def apply(validation: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation): VirtualGatewaySpecBackendDefaultsClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTls]
  }
  
  extension [Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTls](x: Self) {
    
    inline def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setPorts(value: js.Array[Double]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: Double*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    inline def setValidation(value: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
