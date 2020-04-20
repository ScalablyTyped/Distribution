package typings.rest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var entity: js.Any
  var headers: Headers
  var raw: js.Any
  var request: Request
  var status: Status
}

object Response {
  @scala.inline
  def apply(entity: js.Any, headers: Headers, raw: js.Any, request: Request, status: Status): Response = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

