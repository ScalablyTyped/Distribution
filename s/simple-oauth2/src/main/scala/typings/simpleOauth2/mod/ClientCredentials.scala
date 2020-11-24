package typings.simpleOauth2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("simple-oauth2", "ClientCredentials")
@js.native
class ClientCredentials[ClientIdName /* <: String */] protected () extends js.Object {
  def this(options: ModuleOptions[ClientIdName]) = this()
  
  /**
    * Creates a new access token by providing a token object as specified by RFC6750.
    *
    * @param token Plain object representation of an access token
    */
  def createToken(token: Token): AccessToken = js.native
  
  /**
    * Requests and returns an access token from the authorization server
    *
    * @param params
    * @param [params.scope] A String or array of strings representing the application privileges
    * @param [httpOptions] Optional http options passed through the underlying http library
    */
  def getToken(params: ClientCredentialTokenConfig): js.Promise[AccessToken] = js.native
  def getToken(params: ClientCredentialTokenConfig, httpOptions: WreckHttpOptions): js.Promise[AccessToken] = js.native
}
