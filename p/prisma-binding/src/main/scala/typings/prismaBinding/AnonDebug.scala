package typings.prismaBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var endpoint: String
  var token: js.UndefOr[String] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(endpoint: String, debug: js.UndefOr[Boolean] = js.undefined, token: String = null): AnonDebug = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebug]
  }
}

