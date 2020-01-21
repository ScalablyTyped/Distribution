package typings.ravenJs

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest extends js.Object {
  var request: js.UndefOr[XMLHttpRequest] = js.undefined
}

object AnonRequest {
  @scala.inline
  def apply(request: XMLHttpRequest = null): AnonRequest = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequest]
  }
}

