package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "OAuthApi")
@js.native
/**
  * Constructs a new OAuthApi.
  * @param apiClient Optional API client implementation to use, default to ApiClient.instance if unspecified.
  */
open class OAuthApi () extends StObject {
  def this(apiClient: ApiClient) = this()
  
  /**
    * Returns an OAuth access token. The endpoint supports distinct methods of obtaining OAuth access tokens.
    * Applications specify a method by adding the `grant_type` parameter  in the request and also provide relevant information.
    * For more information, see [OAuth access token management](/authz/oauth/how-it-works#oauth-access-token-management).
    * @note Regardless of the method application specified, the endpoint always returns two items; an OAuth access token and
    * a refresh token in the response. __OAuth tokens should only live on secure servers. Application clients should never
    * interact directly with OAuth tokens__.
    */
  def obtainToken(body: ObtainTokenRequest): js.Promise[ObtainTokenResponse] = js.native
  
  /**
    * `RenewToken` is deprecated. For information about refreshing OAuth access tokens,
    * see [Renew OAuth Token](https://developer.squareup.com/docs/oauth-api/cookbook/renew-oauth-tokens).
    * Renews an OAuth access token before it expires. OAuth access tokens besides your application's personal access
    * token expire after __30 days__. You can also renew expired tokens within __15 days__ of their expiration.
    * You cannot renew an access token that has been expired for more than 15 days. Instead, the associated user
    * must re-complete the OAuth flow from the beginning.
    * @note The `Authorization` header for this endpoint must have the following format:
    * ``` Authorization: Client APPLICATION_SECRET ```  Replace `APPLICATION_SECRET`
    * with the application secret on the Credentials page in the [application dashboard](https://connect.squareup.com/apps).
    */
  def renewToken(clientId: String, body: RenewTokenRequest): js.Promise[RenewTokenResponse] = js.native
  
  /**
    * Revokes an access token generated with the OAuth flow. If an account has more than one OAuth access token for
    * your application, this endpoint revokes all of them, regardless of which token you specify. When an OAuth access
    * token is revoked, all of the active subscriptions associated with that OAuth token are canceled immediately.
    * @note The `Authorization` header for this endpoint must have the following format:
    * ``` Authorization: Client APPLICATION_SECRET ```  Replace `APPLICATION_SECRET` with the application secret on the
    * Credentials page in the [application dashboard](https://connect.squareup.com/apps).
    */
  def revokeToken(body: RevokeTokenRequest): js.Promise[RevokeTokenResponse] = js.native
}
