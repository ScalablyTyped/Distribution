package typings.slackNode.mod

import typings.slackNode.slackNodeStrings.fail
import typings.slackNode.slackNodeStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookResponse extends js.Object {
  var headers: js.Any = js.native
  var response: js.Any = js.native
  var status: fail | ok = js.native
  var statusCode: Double = js.native
}

object WebhookResponse {
  @scala.inline
  def apply(headers: js.Any, response: js.Any, status: fail | ok, statusCode: Double): WebhookResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookResponse]
  }
  @scala.inline
  implicit class WebhookResponseOps[Self <: WebhookResponse] (val x: Self) extends AnyVal {
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
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: js.Any): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: fail | ok): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
  }
  
}

