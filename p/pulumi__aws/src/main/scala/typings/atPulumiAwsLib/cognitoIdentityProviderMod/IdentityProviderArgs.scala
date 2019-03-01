package typings
package atPulumiAwsLib.cognitoIdentityProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityProviderArgs extends js.Object {
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
  val providerDetails: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  /**
    * The provider name
    */
  val providerName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The provider type.  [See AWS API for valid values](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateIdentityProvider.html#CognitoUserPools-CreateIdentityProvider-request-ProviderType)
    */
  val providerType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The user pool id
    */
  val userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object IdentityProviderArgs {
  @scala.inline
  def apply(
    providerDetails: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]],
    providerName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    providerType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    userPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    attributeMapping: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    idpIdentifiers: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): IdentityProviderArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("providerDetails")(providerDetails.asInstanceOf[js.Any])
    __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    __obj.updateDynamic("providerType")(providerType.asInstanceOf[js.Any])
    __obj.updateDynamic("userPoolId")(userPoolId.asInstanceOf[js.Any])
    if (attributeMapping != null) __obj.updateDynamic("attributeMapping")(attributeMapping.asInstanceOf[js.Any])
    if (idpIdentifiers != null) __obj.updateDynamic("idpIdentifiers")(idpIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderArgs]
  }
}

