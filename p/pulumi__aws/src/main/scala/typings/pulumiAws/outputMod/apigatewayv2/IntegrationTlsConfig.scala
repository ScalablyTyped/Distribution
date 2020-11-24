package typings.pulumiAws.outputMod.apigatewayv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationTlsConfig extends js.Object {
  
  /**
    * If you specify a server name, API Gateway uses it to verify the hostname on the integration's certificate. The server name is also included in the TLS handshake to support Server Name Indication (SNI) or virtual hosting.
    */
  var serverNameToVerify: js.UndefOr[String] = js.native
}
object IntegrationTlsConfig {
  
  @scala.inline
  def apply(): IntegrationTlsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationTlsConfig]
  }
  
  @scala.inline
  implicit class IntegrationTlsConfigOps[Self <: IntegrationTlsConfig] (val x: Self) extends AnyVal {
    
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
    def setServerNameToVerify(value: String): Self = this.set("serverNameToVerify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerNameToVerify: Self = this.set("serverNameToVerify", js.undefined)
  }
}
