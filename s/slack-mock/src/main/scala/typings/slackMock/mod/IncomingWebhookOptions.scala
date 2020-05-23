package typings.slackMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingWebhookOptions[T] extends js.Object {
  var body: js.UndefOr[T] = js.undefined
  var headers: js.UndefOr[IncomingWebhookHttpHeaders] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[IncomingWebhookUrl] = js.undefined
}

object IncomingWebhookOptions {
  @scala.inline
  def apply[T](
    body: T = null,
    headers: IncomingWebhookHttpHeaders = null,
    statusCode: js.UndefOr[Double] = js.undefined,
    url: IncomingWebhookUrl = null
  ): IncomingWebhookOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingWebhookOptions[T]]
  }
}

