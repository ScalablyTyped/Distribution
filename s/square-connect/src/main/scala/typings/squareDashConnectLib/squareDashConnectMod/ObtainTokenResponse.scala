package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ObtainTokenResponse")
@js.native
class ObtainTokenResponse () extends js.Object {
  /**
    * A valid OAuth access token. OAuth access tokens are 64 bytes long.
    * Provide the access token in a header with every request to Connect API endpoints.
    * See the [Build with OAuth](/authz/oauth/build-with-the-api) guide for more information.
    */
  var access_token: js.UndefOr[java.lang.String] = js.native
  /**
    * The date when access_token expires, in [ISO 8601](http://www.iso.org/iso/home/standards/iso8601.htm) format.
    */
  var expires_at: js.UndefOr[java.lang.String] = js.native
  /**
    * Then OpenID token belonging to this this person.
    * Only present if the OPENID scope is included in the authorize request.
    */
  var id_token: js.UndefOr[java.lang.String] = js.native
  /**
    * The ID of the authorizing merchant's business.
    */
  var merchant_id: js.UndefOr[java.lang.String] = js.native
  /**
    * The ID of the [subscription](https://docs.connect.squareup.com/api/connect/v1/#navsection-subscriptionmanagement)
    * plan the merchant signed up for. Only present if the merchant signed up for a subscription during authorization.
    */
  var plan_id: js.UndefOr[java.lang.String] = js.native
  /**
    * A refresh token.
    * For more information, see [OAuth access token management](/authz/oauth/how-it-works#oauth-access-token-management).
    */
  var refresh_token: js.UndefOr[java.lang.String] = js.native
  /**
    * @deprecated The ID of a subscription plan the merchant signed up for.
    * Only present if the merchant signed up for a subscription during authorization.
    */
  var subscription_id: js.UndefOr[java.lang.String] = js.native
  /**
    * This value is always "bearer".
    */
  var token_type: js.UndefOr[java.lang.String] = js.native
}

