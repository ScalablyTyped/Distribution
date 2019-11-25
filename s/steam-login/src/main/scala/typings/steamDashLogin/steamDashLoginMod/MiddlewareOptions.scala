package typings.steamDashLogin.steamDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var apiKey: String
  var realm: String
  var useSession: js.UndefOr[Boolean] = js.undefined
  var verify: String
}

object MiddlewareOptions {
  @scala.inline
  def apply(apiKey: String, realm: String, verify: String, useSession: js.UndefOr[Boolean] = js.undefined): MiddlewareOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
    if (!js.isUndefined(useSession)) __obj.updateDynamic("useSession")(useSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

