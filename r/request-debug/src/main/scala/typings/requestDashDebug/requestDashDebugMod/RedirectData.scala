package typings.requestDashDebug.requestDashDebugMod

import typings.request.requestMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectData extends LogData {
  var debugId: Double
  var headers: Headers
  var statusCode: Double
  var uri: String
}

object RedirectData {
  @scala.inline
  def apply(debugId: Double, headers: Headers, statusCode: Double, uri: String): RedirectData = {
    val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RedirectData]
  }
}

