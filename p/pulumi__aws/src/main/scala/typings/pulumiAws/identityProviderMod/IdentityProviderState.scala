package typings.pulumiAws.identityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityProviderState extends js.Object {
  
  /**
    * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
    */
  val attributeMapping: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The list of identity providers.
    */
  val idpIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The map of identity details, such as access token
    */
  val providerDetails: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The provider name
    */
  val providerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
    */
  val providerType: js.UndefOr[Input[String]] = js.native
  
  /**
    * The user pool id
    */
  val userPoolId: js.UndefOr[Input[String]] = js.native
}
object IdentityProviderState {
  
  @scala.inline
  def apply(): IdentityProviderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProviderState]
  }
  
  @scala.inline
  implicit class IdentityProviderStateOps[Self <: IdentityProviderState] (val x: Self) extends AnyVal {
    
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
    def setAttributeMapping(value: Input[StringDictionary[Input[String]]]): Self = this.set("attributeMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeMapping: Self = this.set("attributeMapping", js.undefined)
    
    @scala.inline
    def setIdpIdentifiersVarargs(value: Input[String]*): Self = this.set("idpIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setIdpIdentifiers(value: Input[js.Array[Input[String]]]): Self = this.set("idpIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdpIdentifiers: Self = this.set("idpIdentifiers", js.undefined)
    
    @scala.inline
    def setProviderDetails(value: Input[StringDictionary[Input[String]]]): Self = this.set("providerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderDetails: Self = this.set("providerDetails", js.undefined)
    
    @scala.inline
    def setProviderName(value: Input[String]): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderName: Self = this.set("providerName", js.undefined)
    
    @scala.inline
    def setProviderType(value: Input[String]): Self = this.set("providerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProviderType: Self = this.set("providerType", js.undefined)
    
    @scala.inline
    def setUserPoolId(value: Input[String]): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPoolId: Self = this.set("userPoolId", js.undefined)
  }
}
