package typings
package slackDashNodeLib.slackDashNodeMod.SlackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookResponse extends js.Object {
  var headers: js.Any
  var response: js.Any
  var status: slackDashNodeLib.slackDashNodeLibStrings.fail | slackDashNodeLib.slackDashNodeLibStrings.ok
  var statusCode: scala.Double
}

object WebhookResponse {
  @scala.inline
  def apply(
    headers: js.Any,
    response: js.Any,
    status: slackDashNodeLib.slackDashNodeLibStrings.fail | slackDashNodeLib.slackDashNodeLibStrings.ok,
    statusCode: scala.Double
  ): WebhookResponse = {
    val __obj = js.Dynamic.literal(headers = headers, response = response, status = status.asInstanceOf[js.Any], statusCode = statusCode)
  
    __obj.asInstanceOf[WebhookResponse]
  }
}

