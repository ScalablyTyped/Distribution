package typings.pulumiAws.inputMod.elasticsearch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDomainEndpointOptions extends js.Object {
  
  /**
    * Whether or not to require HTTPS
    */
  var enforceHttps: Input[Boolean] = js.native
  
  /**
    * The name of the TLS security policy that needs to be applied to the HTTPS endpoint. Valid values:  `Policy-Min-TLS-1-0-2019-07` and `Policy-Min-TLS-1-2-2019-07`. This provider will only perform drift detection if a configuration value is provided.
    */
  var tlsSecurityPolicy: js.UndefOr[Input[String]] = js.native
}
object DomainDomainEndpointOptions {
  
  @scala.inline
  def apply(enforceHttps: Input[Boolean]): DomainDomainEndpointOptions = {
    val __obj = js.Dynamic.literal(enforceHttps = enforceHttps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainDomainEndpointOptions]
  }
  
  @scala.inline
  implicit class DomainDomainEndpointOptionsOps[Self <: DomainDomainEndpointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnforceHttps(value: Input[Boolean]): Self = this.set("enforceHttps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsSecurityPolicy(value: Input[String]): Self = this.set("tlsSecurityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsSecurityPolicy: Self = this.set("tlsSecurityPolicy", js.undefined)
  }
}
