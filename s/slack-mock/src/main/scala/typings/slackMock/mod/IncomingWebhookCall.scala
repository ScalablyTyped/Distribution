package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingWebhookCall[T] extends js.Object {
  var headers: IncomingWebhookHttpHeaders
  var params: T
  var url: IncomingWebhookUrl
}

object IncomingWebhookCall {
  @scala.inline
  def apply[T](headers: IncomingWebhookHttpHeaders, params: T, url: IncomingWebhookUrl): IncomingWebhookCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingWebhookCall[T]]
  }
}

