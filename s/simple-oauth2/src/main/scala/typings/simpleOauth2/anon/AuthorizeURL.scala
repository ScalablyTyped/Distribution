package typings.simpleOauth2.anon

import org.scalablytyped.runtime.TopLevel
import typings.simpleOauth2.mod.AuthorizationTokenConfig
import typings.simpleOauth2.mod.Token
import typings.simpleOauth2.mod.WreckHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeURL[ClientIdName /* <: String */] extends js.Object {
  /**
    * Redirect the user to the autorization page
    * @return the absolute authorization url
    */
  def authorizeURL(): String = js.native
  def authorizeURL(
    params: typings.simpleOauth2.simpleOauth2Strings.AuthorizeURL with TopLevel[js.Any] with Redirecturi
  ): String = js.native
  /** Returns the Access Token object */
  def getToken(params: AuthorizationTokenConfig): js.Promise[Token] = js.native
  def getToken(params: AuthorizationTokenConfig, httpOptions: WreckHttpOptions): js.Promise[Token] = js.native
}

