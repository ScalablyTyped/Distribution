package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ObtainTokenRequest")
@js.native
class ObtainTokenRequest () extends js.Object {
  /**
    * The Square-issued ID of your application, available from the [application dashboard](https://connect.squareup.com/apps).
    */
  var client_id: java.lang.String = js.native
  /**
    * The Square-issued application secret for your application, available from the
    * [application dashboard](https://connect.squareup.com/apps).
    */
  var client_secret: java.lang.String = js.native
  /**
    * The authorization code to exchange. This is required if `grant_type` is set to `authorization_code`, to indicate
    * that the application wants to exchange an authorization code for an OAuth access token.
    */
  var code: js.UndefOr[java.lang.String] = js.native
  /**
    * Specifies the method to request an OAuth access token.
    * Valid values are: `authorization_code`, `refresh_token`, and `migration_token`.
    */
  var grant_type: java.lang.String = js.native
  /**
    * Legacy OAuth access token obtained using a Connect API version prior to 2019-03-13. This parameter is required
    * if `grant_type` is set to `migration_token` to indicate that the application wants to get a replacement OAuth access token.
    * The response also returns a refresh token. For more information, see [Migrate to Using Refresh Tokens](/authz/oauth/migration).
    */
  var migration_token: js.UndefOr[java.lang.String] = js.native
  /**
    * The redirect URL assigned in the [application dashboard](https://connect.squareup.com/apps).
    */
  var redirect_uri: js.UndefOr[java.lang.String] = js.native
  /**
    * A valid refresh token for generating a new OAuth access token. A valid refresh token is required if `grant_type`
    * is set to `refresh_token`, to indicate the application wants a replacement for an expired OAuth access token.
    */
  var refresh_token: js.UndefOr[java.lang.String] = js.native
}

