package typings.simpleOauth2.mod

import org.scalablytyped.runtime.TopLevel
import typings.simpleOauth2.anon.Redirecturi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-oauth2", "AuthorizationCode")
@js.native
class AuthorizationCode[ClientIdName /* <: String */] protected () extends js.Object {
  def this(options: ModuleOptions[ClientIdName]) = this()
  /**
    * Get a valid redirect URL used to redirect users to an authorization page
    *
    * @param params
    * @param params.redirectURI String representing the registered application URI where the user is redirected after authentication
    * @param params.scope String or array of strings representing the application privileges
    * @param params.state String representing an opaque value used by the client to main the state between the request and the callback
    *
    * @return the absolute authorization url
    */
  def authorizeURL(): String = js.native
  def authorizeURL(
    params: typings.simpleOauth2.simpleOauth2Strings.AuthorizationCode with TopLevel[js.Any] with Redirecturi
  ): String = js.native
  /**
    * Creates a new access token by providing a token object as specified by RFC6750.
    * @param token
    */
  def createToken(token: Token): AccessToken = js.native
  /**
    * Requests and returns an access token from the authorization server
    *
    * @param params
    * @param params.code Authorization code received by the callback URL
    * @param params.redirectURI String representing the registered application URI where the user is redirected after authentication
    * @param [params.scope] String or array of strings representing the application privileges
    * @param [httpOptions] Optional http options passed through the underlying http library
    */
  def getToken(params: AuthorizationTokenConfig): js.Promise[AccessToken] = js.native
  def getToken(params: AuthorizationTokenConfig, httpOptions: WreckHttpOptions): js.Promise[AccessToken] = js.native
}

