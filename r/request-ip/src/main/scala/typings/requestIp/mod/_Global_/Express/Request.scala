package typings.requestIp.mod._Global_.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var clientIp: js.UndefOr[String] = js.undefined
}

object Request {
  @scala.inline
  def apply(clientIp: String = null): Request = {
    val __obj = js.Dynamic.literal()
    if (clientIp != null) __obj.updateDynamic("clientIp")(clientIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

