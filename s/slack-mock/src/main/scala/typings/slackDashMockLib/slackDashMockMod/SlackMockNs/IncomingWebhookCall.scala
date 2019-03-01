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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IncomingWebhookCall[T]]
  }
}

