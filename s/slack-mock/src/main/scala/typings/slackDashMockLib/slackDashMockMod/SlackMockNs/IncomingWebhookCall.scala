package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

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
    val __obj = js.Dynamic.literal(headers = headers, params = params.asInstanceOf[js.Any], url = url)
  
    __obj.asInstanceOf[IncomingWebhookCall[T]]
  }
}

