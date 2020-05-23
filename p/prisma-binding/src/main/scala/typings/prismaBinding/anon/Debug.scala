package typings.prismaBinding.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var endpoint: String
  var token: js.UndefOr[String] = js.undefined
}

object Debug {
  @scala.inline
  def apply(endpoint: String, debug: js.UndefOr[Boolean] = js.undefined, token: String = null): Debug = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Debug]
  }
}

