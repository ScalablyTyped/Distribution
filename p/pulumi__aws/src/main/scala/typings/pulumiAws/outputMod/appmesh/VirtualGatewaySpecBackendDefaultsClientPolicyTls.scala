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
  
  @scala.inline
  def apply(validation: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation): VirtualGatewaySpecBackendDefaultsClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicyTls]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecBackendDefaultsClientPolicyTlsMutableBuilder[Self <: VirtualGatewaySpecBackendDefaultsClientPolicyTls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[Double]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: Double*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setValidation(value: VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
