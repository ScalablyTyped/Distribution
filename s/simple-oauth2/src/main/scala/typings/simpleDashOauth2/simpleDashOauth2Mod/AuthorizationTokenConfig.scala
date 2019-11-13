package typings.simpleDashOauth2.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationTokenConfig extends js.Object {
  /** Authorization code (from previous step) */
  var code: AuthorizationCode
  /** A string that represents the callback uri */
  var redirect_uri: String
  /** A string or array of strings that represents the application privileges */
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
}

object AuthorizationTokenConfig {
  @scala.inline
  def apply(code: AuthorizationCode, redirect_uri: String, scope: String | js.Array[String] = null): AuthorizationTokenConfig = {
    val __obj = js.Dynamic.literal(code = code, redirect_uri = redirect_uri)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationTokenConfig]
  }
}

