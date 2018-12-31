package typings
package simpleDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AuthorizeURL[ClientIdName /* <: java.lang.String */] extends js.Object {
  /**
    * Redirect the user to the autorization page
    * @return the absolute authorization url
    */
  def authorizeURL(): java.lang.String = js.native
  def authorizeURL(params: Anon_Redirecturi[ClientIdName]): java.lang.String = js.native
  /** Returns the Access Token object */
  def getToken(params: simpleDashOauth2Lib.simpleDashOauth2Mod.AuthorizationTokenConfig): js.Promise[simpleDashOauth2Lib.simpleDashOauth2Mod.Token] = js.native
}

