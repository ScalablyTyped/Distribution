package typings.requestDashDebug.requestDashDebugMod

import typings.request.requestMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseData extends LogData {
  var body: js.UndefOr[js.Any] = js.undefined
  var debugId: Double
  var headers: Headers
  var statusCode: Double
}

object ResponseData {
  @scala.inline
  def apply(debugId: Double, headers: Headers, statusCode: Double, body: js.Any = null): ResponseData = {
    val __obj = js.Dynamic.literal(debugId = debugId, headers = headers, statusCode = statusCode)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[ResponseData]
  }
}

