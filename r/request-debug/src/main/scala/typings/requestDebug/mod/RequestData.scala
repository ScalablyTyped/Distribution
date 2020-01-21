package typings.requestDebug.mod

import typings.request.mod.Headers
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
    val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestData]
  }
}

