package typings
package ravenDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: js.UndefOr[stdLib.XMLHttpRequest] = js.undefined
}

object Anon_Request {
  @scala.inline
  def apply(request: stdLib.XMLHttpRequest = null): Anon_Request = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Anon_Request]
  }
}

