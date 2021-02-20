package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation extends StObject {
  
  /**
    * The TLS validation context trust.
    */
  var trust: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust = js.native
}
object VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation {
  
  @scala.inline
  def apply(trust: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust): VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationMutableBuilder[Self <: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrust(value: VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}
