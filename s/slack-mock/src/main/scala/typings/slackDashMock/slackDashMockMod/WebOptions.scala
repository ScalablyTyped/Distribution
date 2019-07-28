package typings.slackDashMock.slackDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebOptions[T] extends js.Object {
  var body: js.UndefOr[T] = js.undefined
  var headers: js.UndefOr[WebHttpHeaders] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[WebUrl] = js.undefined
}

object WebOptions {
  @scala.inline
  def apply[T](
    body: T = null,
    headers: WebHttpHeaders = null,
    statusCode: Int | Double = null,
    url: WebUrl = null
  ): WebOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WebOptions[T]]
  }
}

