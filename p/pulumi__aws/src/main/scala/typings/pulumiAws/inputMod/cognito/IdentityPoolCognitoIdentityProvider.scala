package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolCognitoIdentityProvider extends js.Object {
  
  /**
    * The client ID for the Amazon Cognito Identity User Pool.
    */
  var clientId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The provider name for an Amazon Cognito Identity User Pool.
    */
  var providerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether server-side token validation is enabled for the identity provider’s token or not.
    */
  var serverSideTokenCheck: js.UndefOr[Input[Boolean]] = js.native
}
object IdentityPoolCognitoIdentityProvider {
  
  @scala.inline
  def apply(): IdentityPoolCognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolCognitoIdentityProvider]
  }
  
  @scala.inline
  implicit class IdentityPoolCognitoIdentityProviderOps[Self <: IdentityPoolCognitoIdentityProvider] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: Input[String]): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setProviderName(value: Input[String]): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    
    @scala.inline
    def setServerSideTokenCheck(value: Input[Boolean]): Self = this.set("serverSideTokenCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideTokenCheck: Self = this.set("serverSideTokenCheck", js.undefined)
  }
}
