package typings.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLApiOpenidConnectConfig extends js.Object {
  
  /**
    * Number of milliseconds a token is valid after being authenticated.
    */
  var authTtl: js.UndefOr[Double] = js.native
  
  /**
    * Client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * Number of milliseconds a token is valid after being issued to a user.
    */
  var iatTtl: js.UndefOr[Double] = js.native
  
  /**
    * Issuer for the OpenID Connect configuration. The issuer returned by discovery MUST exactly match the value of iss in the ID Token.
    */
  var issuer: String = js.native
}
object GraphQLApiOpenidConnectConfig {
  
  @scala.inline
  def apply(issuer: String): GraphQLApiOpenidConnectConfig = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiOpenidConnectConfig]
  }
  
  @scala.inline
  implicit class GraphQLApiOpenidConnectConfigOps[Self <: GraphQLApiOpenidConnectConfig] (val x: Self) extends AnyVal {
    
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
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTtl(value: Double): Self = this.set("authTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTtl: Self = this.set("authTtl", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setIatTtl(value: Double): Self = this.set("iatTtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIatTtl: Self = this.set("iatTtl", js.undefined)
  }
}
