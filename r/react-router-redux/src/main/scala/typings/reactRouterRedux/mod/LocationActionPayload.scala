package typings.reactRouterRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationActionPayload extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var method: String
}

object LocationActionPayload {
  @scala.inline
  def apply(method: String, args: js.Array[_] = null): LocationActionPayload = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationActionPayload]
  }
}

