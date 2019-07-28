package typings.rest.restMod

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
    val __obj = js.Dynamic.literal(entity = entity, headers = headers, raw = raw, request = request, status = status)
  
    __obj.asInstanceOf[Response]
  }
}

