package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCall[T] extends js.Object {
  var headers: EventHttpHeaders
  var params: T
  var statusCode: Double
  var url: EventUrl
}

object EventCall {
  @scala.inline
  def apply[T](headers: EventHttpHeaders, params: T, statusCode: Double, url: EventUrl): EventCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCall[T]]
  }
}

