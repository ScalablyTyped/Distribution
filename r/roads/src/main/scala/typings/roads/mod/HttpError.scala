package typings.roads.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", "HttpError")
@js.native
class HttpError protected () extends js.Object {
  def this(message: String, code: Double) = this()
  var conflict: Double = js.native
  var forbidden: Double = js.native
  var gone: Double = js.native
  var internal_server_error: Double = js.native
  var invalid_request: Double = js.native
  var method_not_allowed: Double = js.native
  var not_acceptable: Double = js.native
  var not_found: Double = js.native
  var too_many_requests: Double = js.native
  var unauthorized: Double = js.native
  var unprocessable_entity: Double = js.native
}

