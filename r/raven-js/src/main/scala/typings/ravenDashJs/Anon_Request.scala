package typings.ravenDashJs

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: js.UndefOr[XMLHttpRequest] = js.undefined
}

object Anon_Request {
  @scala.inline
  def apply(request: XMLHttpRequest = null): Anon_Request = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Request]
  }
}

