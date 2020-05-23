package typings.simpleOauth2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeHost extends js.Object {
  /** String used to set the host to request an "authorization code". Default to the value set on auth.tokenHost. */
  var authorizeHost: js.UndefOr[String] = js.undefined
  /** String path to request an authorization code. Default to /oauth/authorize. */
  var authorizePath: js.UndefOr[String] = js.undefined
  /** String path to revoke an access token. Default to /oauth/revoke. */
  var revokePath: js.UndefOr[String] = js.undefined
  /** String used to set the host to request the tokens to. Required. */
  var tokenHost: String
  /** String path to request an access token. Default to /oauth/token. */
  var tokenPath: js.UndefOr[String] = js.undefined
}

object AuthorizeHost {
  @scala.inline
  def apply(
    tokenHost: String,
    authorizeHost: String = null,
    authorizePath: String = null,
    revokePath: String = null,
    tokenPath: String = null
  ): AuthorizeHost = {
    val __obj = js.Dynamic.literal(tokenHost = tokenHost.asInstanceOf[js.Any])
    if (authorizeHost != null) __obj.updateDynamic("authorizeHost")(authorizeHost.asInstanceOf[js.Any])
    if (authorizePath != null) __obj.updateDynamic("authorizePath")(authorizePath.asInstanceOf[js.Any])
    if (revokePath != null) __obj.updateDynamic("revokePath")(revokePath.asInstanceOf[js.Any])
    if (tokenPath != null) __obj.updateDynamic("tokenPath")(tokenPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeHost]
  }
}

