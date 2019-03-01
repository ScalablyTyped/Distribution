package typings
package restLib.restMod.restNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("entity")(entity)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Response]
  }
}

