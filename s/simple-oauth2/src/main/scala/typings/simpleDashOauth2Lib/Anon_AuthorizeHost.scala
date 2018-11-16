package typings
package simpleDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_AuthorizeHost extends js.Object {
  /** String used to set the host to request an "authorization code". Default to the value set on auth.tokenHost. */
  var authorizeHost: js.UndefOr[java.lang.String] = js.undefined
  /** String path to request an authorization code. Default to /oauth/authorize. */
  var authorizePath: js.UndefOr[java.lang.String] = js.undefined
  /** String path to revoke an access token. Default to /oauth/revoke. */
  var revokePath: js.UndefOr[java.lang.String] = js.undefined
  /** String used to set the host to request the tokens to. Required. */
  var tokenHost: java.lang.String
  /** String path to request an access token. Default to /oauth/token. */
  var tokenPath: js.UndefOr[java.lang.String] = js.undefined
}

