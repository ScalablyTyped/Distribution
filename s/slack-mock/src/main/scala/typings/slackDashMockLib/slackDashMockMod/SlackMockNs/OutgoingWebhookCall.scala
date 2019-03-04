package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingWebhookCall[T] extends js.Object {
  var headers: OutgoingWebhookHttpHeaders
  var params: T
  var statusCode: scala.Double
  var url: OutgoingWebhookUrl
}

object OutgoingWebhookCall {
  @scala.inline
  def apply[T](headers: OutgoingWebhookHttpHeaders, params: T, statusCode: scala.Double, url: OutgoingWebhookUrl): OutgoingWebhookCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers, params = params.asInstanceOf[js.Any], statusCode = statusCode, url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OutgoingWebhookCall[T]]
  }
}

