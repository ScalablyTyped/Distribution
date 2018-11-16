package typings
package roadsLib.roadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", "HttpError")
@js.native
class HttpError protected () extends js.Object {
  def this(message: java.lang.String, code: scala.Double) = this()
  var conflict: scala.Double = js.native
  var forbidden: scala.Double = js.native
  var gone: scala.Double = js.native
  var internal_server_error: scala.Double = js.native
  var invalid_request: scala.Double = js.native
  var method_not_allowed: scala.Double = js.native
  var not_acceptable: scala.Double = js.native
  var not_found: scala.Double = js.native
  var too_many_requests: scala.Double = js.native
  var unauthorized: scala.Double = js.native
  var unprocessable_entity: scala.Double = js.native
}

