package typings
package steamDashLoginLib.steamDashLoginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var apiKey: java.lang.String
  var realm: java.lang.String
  var useSession: js.UndefOr[scala.Boolean] = js.undefined
  var verify: java.lang.String
}

object MiddlewareOptions {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    realm: java.lang.String,
    verify: java.lang.String,
    useSession: js.UndefOr[scala.Boolean] = js.undefined
  ): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apiKey")(apiKey)
    __obj.updateDynamic("realm")(realm)
    __obj.updateDynamic("verify")(verify)
    if (!js.isUndefined(useSession)) __obj.updateDynamic("useSession")(useSession)
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

