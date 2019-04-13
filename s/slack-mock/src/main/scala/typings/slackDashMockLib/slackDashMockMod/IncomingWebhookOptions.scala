package typings
package slackDashMockLib.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingWebhookOptions[T] extends js.Object {
  var body: js.UndefOr[T] = js.undefined
  var headers: js.UndefOr[IncomingWebhookHttpHeaders] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[IncomingWebhookUrl] = js.undefined
}

object IncomingWebhookOptions {
  @scala.inline
  def apply[T](
    body: T = null,
    headers: IncomingWebhookHttpHeaders = null,
    statusCode: scala.Int | scala.Double = null,
    url: IncomingWebhookUrl = null
  ): IncomingWebhookOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[IncomingWebhookOptions[T]]
  }
}

