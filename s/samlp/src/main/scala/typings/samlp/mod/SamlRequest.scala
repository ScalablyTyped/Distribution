package typings.samlp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamlRequest extends js.Object {
  
  var assertionConsumerServiceURL: js.UndefOr[String] = js.native
  
  var destination: js.UndefOr[String] = js.native
  
  var forceAuthn: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var issuer: js.UndefOr[String] = js.native
}
object SamlRequest {
  
  @scala.inline
  def apply(): SamlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamlRequest]
  }
  
  @scala.inline
  implicit class SamlRequestOps[Self <: SamlRequest] (val x: Self) extends AnyVal {
    
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
    def setAssertionConsumerServiceURL(value: String): Self = this.set("assertionConsumerServiceURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssertionConsumerServiceURL: Self = this.set("assertionConsumerServiceURL", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setForceAuthn(value: String): Self = this.set("forceAuthn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceAuthn: Self = this.set("forceAuthn", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
  }
}
