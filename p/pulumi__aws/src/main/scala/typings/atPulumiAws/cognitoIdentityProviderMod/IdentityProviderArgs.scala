package typings.atPulumiAws.cognitoIdentityProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityProviderArgs extends js.Object {
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
  val providerDetails: Input[StringDictionary[_]] = js.native
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
    providerDetails: Input[StringDictionary[_]],
    providerName: Input[String],
    providerType: Input[String],
    userPoolId: Input[String],
    attributeMapping: Input[StringDictionary[_]] = null,
    idpIdentifiers: Input[js.Array[Input[String]]] = null
  ): IdentityProviderArgs = {
    val __obj = js.Dynamic.literal(providerDetails = providerDetails.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], providerType = providerType.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    if (attributeMapping != null) __obj.updateDynamic("attributeMapping")(attributeMapping.asInstanceOf[js.Any])
    if (idpIdentifiers != null) __obj.updateDynamic("idpIdentifiers")(idpIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderArgs]
  }
}

