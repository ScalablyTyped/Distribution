package typings.slackNode.mod

import typings.slackNode.slackNodeStrings.fail
import typings.slackNode.slackNodeStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookResponse extends js.Object {
  var headers: js.Any
  var response: js.Any
  var status: fail | ok
  var statusCode: Double
}

object WebhookResponse {
  @scala.inline
  def apply(headers: js.Any, response: js.Any, status: fail | ok, statusCode: Double): WebhookResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookResponse]
  }
}

