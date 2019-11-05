package typings.simpleDashOauth2

import typings.simpleDashOauth2.simpleDashOauth2Mod.AuthorizationTokenConfig
import typings.simpleDashOauth2.simpleDashOauth2Mod.Token
import typings.simpleDashOauth2.simpleDashOauth2Mod.WreckHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AuthorizeURL[ClientIdName /* <: String */] extends js.Object {
  /**
    * Redirect the user to the autorization page
    * @return the absolute authorization url
    */
  def authorizeURL(): String = js.native
  def authorizeURL(
    params: typings.simpleDashOauth2.simpleDashOauth2Strings.Anon_AuthorizeURL with js.Any with Anon_Redirecturi
  ): String = js.native
  /** Returns the Access Token object */
  def getToken(params: AuthorizationTokenConfig): js.Promise[Token] = js.native
  def getToken(params: AuthorizationTokenConfig, httpOptions: WreckHttpOptions): js.Promise[Token] = js.native
}

