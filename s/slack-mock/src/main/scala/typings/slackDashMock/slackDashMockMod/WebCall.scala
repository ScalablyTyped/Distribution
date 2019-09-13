package typings.slackDashMock.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebCall[T] extends js.Object {
  var headers: WebHttpHeaders
  var params: T
  var url: WebUrl
}

object WebCall {
  @scala.inline
  def apply[T](headers: WebHttpHeaders, params: T, url: WebUrl): WebCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url)
  
    __obj.asInstanceOf[WebCall[T]]
  }
}

