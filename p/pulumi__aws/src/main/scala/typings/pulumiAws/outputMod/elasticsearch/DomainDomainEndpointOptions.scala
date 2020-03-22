package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDomainEndpointOptions extends js.Object {
  /**
    * Whether or not to require HTTPS
    */
  var enforceHttps: Boolean = js.native
  var tlsSecurityPolicy: String = js.native
}

object DomainDomainEndpointOptions {
  @scala.inline
  def apply(enforceHttps: Boolean, tlsSecurityPolicy: String): DomainDomainEndpointOptions = {
    val __obj = js.Dynamic.literal(enforceHttps = enforceHttps.asInstanceOf[js.Any], tlsSecurityPolicy = tlsSecurityPolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainDomainEndpointOptions]
  }
}

