package typings.pulumiAws.identityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderState extends js.Object {
  /**
    * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
    */
  val attributeMapping: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The list of identity providers.
    */
  val idpIdentifiers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The map of identity details, such as access token
    */
  val providerDetails: js.UndefOr[Input[StringDictionary[_]]] = js.native
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
  def apply(
    attributeMapping: Input[StringDictionary[_]] = null,
    idpIdentifiers: Input[js.Array[Input[String]]] = null,
    providerDetails: Input[StringDictionary[_]] = null,
    providerName: Input[String] = null,
    providerType: Input[String] = null,
    userPoolId: Input[String] = null
  ): IdentityProviderState = {
    val __obj = js.Dynamic.literal()
    if (attributeMapping != null) __obj.updateDynamic("attributeMapping")(attributeMapping.asInstanceOf[js.Any])
    if (idpIdentifiers != null) __obj.updateDynamic("idpIdentifiers")(idpIdentifiers.asInstanceOf[js.Any])
    if (providerDetails != null) __obj.updateDynamic("providerDetails")(providerDetails.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (providerType != null) __obj.updateDynamic("providerType")(providerType.asInstanceOf[js.Any])
    if (userPoolId != null) __obj.updateDynamic("userPoolId")(userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderState]
  }
}

