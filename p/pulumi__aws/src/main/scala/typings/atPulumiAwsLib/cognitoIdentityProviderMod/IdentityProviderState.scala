package typings
package atPulumiAwsLib.cognitoIdentityProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityProviderState extends js.Object {
  /**
    * The map of attribute mapping of user pool attributes. [AttributeMapping in AWS API documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-AttributeMapping)
    */
  val attributeMapping: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The list of identity providers.
    */
  val idpIdentifiers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The map of identity details, such as access token
    */
  val providerDetails: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The provider name
    */
  val providerName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
    */
  val providerType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The user pool id
    */
  val userPoolId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object IdentityProviderState {
  @scala.inline
  def apply(
    attributeMapping: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    idpIdentifiers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    providerDetails: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    providerName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    providerType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

