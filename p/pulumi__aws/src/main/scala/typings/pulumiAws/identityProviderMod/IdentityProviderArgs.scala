package typings.pulumiAws.identityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityProviderArgs extends js.Object {
  
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
  val providerDetails: Input[StringDictionary[Input[String]]] = js.native
  
  /**
    * The provider name
    */
  val providerName: Input[String] = js.native
  
  /**
    * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
    */
  val providerType: Input[String] = js.native
  
  /**
    * The user pool id
    */
  val userPoolId: Input[String] = js.native
}
object IdentityProviderArgs {
  
  @scala.inline
  def apply(
    providerDetails: Input[StringDictionary[Input[String]]],
    providerName: Input[String],
    providerType: Input[String],
    userPoolId: Input[String]
  ): IdentityProviderArgs = {
    val __obj = js.Dynamic.literal(providerDetails = providerDetails.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], providerType = providerType.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderArgs]
  }
  
  @scala.inline
  implicit class IdentityProviderArgsOps[Self <: IdentityProviderArgs] (val x: Self) extends AnyVal {
    
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
    def setProviderDetails(value: Input[StringDictionary[Input[String]]]): Self = this.set("providerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: Input[String]): Self = this.set("providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderType(value: Input[String]): Self = this.set("providerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: Input[String]): Self = this.set("userPoolId", value.asInstanceOf[js.Any])
    
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
  }
}
