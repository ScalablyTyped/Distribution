package typings.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLApiAdditionalAuthenticationProvider extends js.Object {
  
  /**
    * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`
    */
  var authenticationType: String = js.native
  
  /**
    * Nested argument containing OpenID Connect configuration. Defined below.
    */
  var openidConnectConfig: js.UndefOr[GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig] = js.native
  
  /**
    * The Amazon Cognito User Pool configuration. Defined below.
    */
  var userPoolConfig: js.UndefOr[GraphQLApiAdditionalAuthenticationProviderUserPoolConfig] = js.native
}
object GraphQLApiAdditionalAuthenticationProvider {
  
  @scala.inline
  def apply(authenticationType: String): GraphQLApiAdditionalAuthenticationProvider = {
    val __obj = js.Dynamic.literal(authenticationType = authenticationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLApiAdditionalAuthenticationProvider]
  }
  
  @scala.inline
  implicit class GraphQLApiAdditionalAuthenticationProviderOps[Self <: GraphQLApiAdditionalAuthenticationProvider] (val x: Self) extends AnyVal {
    
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
    def setAuthenticationType(value: String): Self = this.set("authenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenidConnectConfig(value: GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfig): Self = this.set("openidConnectConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenidConnectConfig: Self = this.set("openidConnectConfig", js.undefined)
    
    @scala.inline
    def setUserPoolConfig(value: GraphQLApiAdditionalAuthenticationProviderUserPoolConfig): Self = this.set("userPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolConfig: Self = this.set("userPoolConfig", js.undefined)
  }
}
