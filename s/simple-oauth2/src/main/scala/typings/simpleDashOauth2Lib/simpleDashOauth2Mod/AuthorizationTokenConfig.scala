package typings
package simpleDashOauth2Lib.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationTokenConfig extends js.Object {
  /** Authorization code (from previous step) */
  var code: AuthorizationCode
  /** A string that represents the callback uri */
  var redirect_uri: java.lang.String
}

object AuthorizationTokenConfig {
  @scala.inline
  def apply(code: AuthorizationCode, redirect_uri: java.lang.String): AuthorizationTokenConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("redirect_uri")(redirect_uri)
    __obj.asInstanceOf[AuthorizationTokenConfig]
  }
}

