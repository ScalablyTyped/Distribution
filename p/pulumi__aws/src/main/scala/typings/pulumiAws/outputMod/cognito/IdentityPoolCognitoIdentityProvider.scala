package typings.pulumiAws.outputMod.cognito

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolCognitoIdentityProvider extends js.Object {
  /**
    * The client ID for the Amazon Cognito Identity User Pool.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The provider name for an Amazon Cognito Identity User Pool.
    */
  var providerName: js.UndefOr[String] = js.native
  /**
    * Whether server-side token validation is enabled for the identity provider’s token or not.
    */
  var serverSideTokenCheck: js.UndefOr[Boolean] = js.native
}

object IdentityPoolCognitoIdentityProvider {
  @scala.inline
  def apply(
    clientId: String = null,
    providerName: String = null,
    serverSideTokenCheck: js.UndefOr[Boolean] = js.undefined
  ): IdentityPoolCognitoIdentityProvider = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSideTokenCheck)) __obj.updateDynamic("serverSideTokenCheck")(serverSideTokenCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolCognitoIdentityProvider]
  }
}

