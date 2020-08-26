package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingWebhookOptions[T] extends js.Object {
  var body: js.UndefOr[T] = js.native
  var headers: js.UndefOr[IncomingWebhookHttpHeaders] = js.native
  var statusCode: js.UndefOr[Double] = js.native
  var url: js.UndefOr[IncomingWebhookUrl] = js.native
}

object IncomingWebhookOptions {
  @scala.inline
  def apply[T](): IncomingWebhookOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncomingWebhookOptions[T]]
  }
  @scala.inline
  implicit class IncomingWebhookOptionsOps[Self <: IncomingWebhookOptions[_], T] (val x: Self with IncomingWebhookOptions[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: ReplyHeaderValue*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: IncomingWebhookHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    @scala.inline
    def setUrl(value: IncomingWebhookUrl): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

