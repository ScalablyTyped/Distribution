package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecBackendDefaultsClientPolicy extends StObject {
  
  /**
    * The Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[Input[VirtualGatewaySpecBackendDefaultsClientPolicyTls]] = js.undefined
}
object VirtualGatewaySpecBackendDefaultsClientPolicy {
  
  @scala.inline
  def apply(): VirtualGatewaySpecBackendDefaultsClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecBackendDefaultsClientPolicy]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecBackendDefaultsClientPolicyMutableBuilder[Self <: VirtualGatewaySpecBackendDefaultsClientPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTls(value: Input[VirtualGatewaySpecBackendDefaultsClientPolicyTls]): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}
