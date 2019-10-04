package typings.atPulumiAws.typesOutputMod.cognitoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolCognitoIdentityProvider extends js.Object {
  /**
    * The client ID for the Amazon Cognito Identity User Pool.
    */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * The provider name for an Amazon Cognito Identity User Pool.
    */
  var providerName: js.UndefOr[String] = js.undefined
  /**
    * Whether server-side token validation is enabled for the identity provider’s token or not.
    */
  var serverSideTokenCheck: js.UndefOr[Boolean] = js.undefined
}

object IdentityPoolCognitoIdentityProvider {
  @scala.inline
  def apply(
    clientId: String = null,
    providerName: String = null,
    serverSideTokenCheck: js.UndefOr[Boolean] = js.undefined
  ): IdentityPoolCognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (providerName != null) __obj.updateDynamic("providerName")(providerName)
    if (!js.isUndefined(serverSideTokenCheck)) __obj.updateDynamic("serverSideTokenCheck")(serverSideTokenCheck)
    __obj.asInstanceOf[IdentityPoolCognitoIdentityProvider]
  }
}

