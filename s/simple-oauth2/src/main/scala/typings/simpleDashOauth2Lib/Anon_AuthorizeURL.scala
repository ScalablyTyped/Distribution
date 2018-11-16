package typings
package simpleDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AuthorizeURL extends js.Object {
  /**
           * Redirect the user to the autorization page
           * @return the absolute authorization url
           */
  def authorizeURL(): java.lang.String = js.native
  /**
           * Redirect the user to the autorization page
           * @return the absolute authorization url
           */
  def authorizeURL(
    params: (/** A key-value pair where key is ModuleOptions#client.idParamName and the value represents the Client-ID */
  ScalablyTyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]) with Anon_Redirecturi
  ): java.lang.String = js.native
  /** Returns the Access Token object */
  def getToken(params: simpleDashOauth2Lib.simpleDashOauth2Mod.AuthorizationTokenConfig): stdLib.Promise[simpleDashOauth2Lib.simpleDashOauth2Mod.Token] = js.native
}

