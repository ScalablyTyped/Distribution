package typings.requestDashDebug.requestDashDebugMod

import typings.request.requestMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.requestDashDebug.requestDashDebugMod.RequestData
  - typings.requestDashDebug.requestDashDebugMod.ResponseData
  - typings.requestDashDebug.requestDashDebugMod.RedirectData
*/
trait LogData extends js.Object

object LogData {
  @scala.inline
  def RequestData(debugId: Double, headers: Headers, method: String, uri: String, body: js.Any = null): LogData = {
    val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogData]
  }
  @scala.inline
  def ResponseData(debugId: Double, headers: Headers, statusCode: Double, body: js.Any = null): LogData = {
    val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogData]
  }
  @scala.inline
  def RedirectData(debugId: Double, headers: Headers, statusCode: Double, uri: String): LogData = {
    val __obj = js.Dynamic.literal(debugId = debugId.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LogData]
  }
}

