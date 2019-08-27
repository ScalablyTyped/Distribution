package typings.requestDashDebug.requestDashDebugMod

import typings.request.requestMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestData extends LogData {
  var body: js.UndefOr[js.Any] = js.undefined
  var debugId: Double
  var headers: Headers
  var method: String
  var uri: String
}

object RequestData {
  @scala.inline
  def apply(debugId: Double, headers: Headers, method: String, uri: String, body: js.Any = null): RequestData = {
    val __obj = js.Dynamic.literal(debugId = debugId, headers = headers, method = method, uri = uri)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[RequestData]
  }
}

