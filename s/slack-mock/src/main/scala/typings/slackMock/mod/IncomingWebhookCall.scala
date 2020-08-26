package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingWebhookCall[T] extends js.Object {
  var headers: IncomingWebhookHttpHeaders = js.native
  var params: T = js.native
  var url: IncomingWebhookUrl = js.native
}

object IncomingWebhookCall {
  @scala.inline
  def apply[T](headers: IncomingWebhookHttpHeaders, params: T, url: IncomingWebhookUrl): IncomingWebhookCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingWebhookCall[T]]
  }
  @scala.inline
  implicit class IncomingWebhookCallOps[Self <: IncomingWebhookCall[_], T] (val x: Self with IncomingWebhookCall[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeadersVarargs(value: ReplyHeaderValue*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: IncomingWebhookHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: IncomingWebhookUrl): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

