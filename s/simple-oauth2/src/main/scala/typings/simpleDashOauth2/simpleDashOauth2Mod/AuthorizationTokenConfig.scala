package typings.simpleDashOauth2.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationTokenConfig extends js.Object {
  /** Authorization code (from previous step) */
  var code: AuthorizationCode
  /** A string that represents the callback uri */
  var redirect_uri: String
}

object AuthorizationTokenConfig {
  @scala.inline
  def apply(code: AuthorizationCode, redirect_uri: String): AuthorizationTokenConfig = {
    val __obj = js.Dynamic.literal(code = code, redirect_uri = redirect_uri)
  
    __obj.asInstanceOf[AuthorizationTokenConfig]
  }
}

