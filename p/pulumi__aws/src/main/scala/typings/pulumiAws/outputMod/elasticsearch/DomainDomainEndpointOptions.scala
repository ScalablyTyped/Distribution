package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDomainEndpointOptions extends StObject {
  
  /**
    * Whether or not to require HTTPS
    */
  var enforceHttps: Boolean = js.native
  
  /**
    * The name of the TLS security policy that needs to be applied to the HTTPS endpoint. Valid values:  `Policy-Min-TLS-1-0-2019-07` and `Policy-Min-TLS-1-2-2019-07`. This provider will only perform drift detection if a configuration value is provided.
    */
  var tlsSecurityPolicy: String = js.native
}
object DomainDomainEndpointOptions {
  
  @scala.inline
  def apply(enforceHttps: Boolean, tlsSecurityPolicy: String): DomainDomainEndpointOptions = {
    val __obj = js.Dynamic.literal(enforceHttps = enforceHttps.asInstanceOf[js.Any], tlsSecurityPolicy = tlsSecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDomainEndpointOptions]
  }
  
  @scala.inline
  implicit class DomainDomainEndpointOptionsMutableBuilder[Self <: DomainDomainEndpointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnforceHttps(value: Boolean): Self = StObject.set(x, "enforceHttps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsSecurityPolicy(value: String): Self = StObject.set(x, "tlsSecurityPolicy", value.asInstanceOf[js.Any])
  }
}
