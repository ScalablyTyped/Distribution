package typings.simpleOauth2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-oauth2", "ResourceOwnerPassword")
@js.native
class ResourceOwnerPassword[ClientIdName /* <: String */] protected () extends js.Object {
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
    * @param params.username A string representing the registered username
    * @param params.password A string representing the registered password
    * @param [params.scope] A String or array of strings representing the application privileges
    * @param [httpOptions] Optional http options passed through the underlying http library
    */
  def getToken(params: PasswordTokenConfig): js.Promise[AccessToken] = js.native
  def getToken(params: PasswordTokenConfig, httpOptions: WreckHttpOptions): js.Promise[AccessToken] = js.native
}

