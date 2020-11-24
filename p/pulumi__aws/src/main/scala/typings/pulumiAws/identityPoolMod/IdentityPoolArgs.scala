package typings.pulumiAws.identityPoolMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cognito.IdentityPoolCognitoIdentityProvider
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolArgs extends js.Object {
  
  /**
    * Whether the identity pool supports unauthenticated logins or not.
    */
  val allowUnauthenticatedIdentities: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * An array of Amazon Cognito Identity user pools and their client IDs.
    */
  val cognitoIdentityProviders: js.UndefOr[Input[js.Array[Input[IdentityPoolCognitoIdentityProvider]]]] = js.native
  
  /**
    * The "domain" by which Cognito will refer to your users. This name acts as a placeholder that allows your
    * backend and the Cognito service to communicate about the developer provider.
    */
  val developerProviderName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Cognito Identity Pool name.
    */
  val identityPoolName: Input[String] = js.native
  
  /**
    * Set of OpendID Connect provider ARNs.
    */
  val openidConnectProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * An array of Amazon Resource Names (ARNs) of the SAML provider for your identity.
    */
  val samlProviderArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Key-Value pairs mapping provider names to provider app IDs.
    */
  val supportedLoginProviders: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map of tags to assign to the Identity Pool.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object IdentityPoolArgs {
  
  @scala.inline
  def apply(identityPoolName: Input[String]): IdentityPoolArgs = {
    val __obj = js.Dynamic.literal(identityPoolName = identityPoolName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolArgs]
  }
  
  @scala.inline
  implicit class IdentityPoolArgsOps[Self <: IdentityPoolArgs] (val x: Self) extends AnyVal {
    
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
    def setIdentityPoolName(value: Input[String]): Self = this.set("identityPoolName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUnauthenticatedIdentities(value: Input[Boolean]): Self = this.set("allowUnauthenticatedIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUnauthenticatedIdentities: Self = this.set("allowUnauthenticatedIdentities", js.undefined)
    
    @scala.inline
    def setCognitoIdentityProvidersVarargs(value: Input[IdentityPoolCognitoIdentityProvider]*): Self = this.set("cognitoIdentityProviders", js.Array(value :_*))
    
    @scala.inline
    def setCognitoIdentityProviders(value: Input[js.Array[Input[IdentityPoolCognitoIdentityProvider]]]): Self = this.set("cognitoIdentityProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCognitoIdentityProviders: Self = this.set("cognitoIdentityProviders", js.undefined)
    
    @scala.inline
    def setDeveloperProviderName(value: Input[String]): Self = this.set("developerProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperProviderName: Self = this.set("developerProviderName", js.undefined)
    
    @scala.inline
    def setOpenidConnectProviderArnsVarargs(value: Input[String]*): Self = this.set("openidConnectProviderArns", js.Array(value :_*))
    
    @scala.inline
    def setOpenidConnectProviderArns(value: Input[js.Array[Input[String]]]): Self = this.set("openidConnectProviderArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenidConnectProviderArns: Self = this.set("openidConnectProviderArns", js.undefined)
    
    @scala.inline
    def setSamlProviderArnsVarargs(value: Input[String]*): Self = this.set("samlProviderArns", js.Array(value :_*))
    
    @scala.inline
    def setSamlProviderArns(value: Input[js.Array[Input[String]]]): Self = this.set("samlProviderArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamlProviderArns: Self = this.set("samlProviderArns", js.undefined)
    
    @scala.inline
    def setSupportedLoginProviders(value: Input[StringDictionary[Input[String]]]): Self = this.set("supportedLoginProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLoginProviders: Self = this.set("supportedLoginProviders", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
