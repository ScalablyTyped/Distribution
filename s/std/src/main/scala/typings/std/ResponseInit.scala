package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseInit extends js.Object {
  var headers: js.UndefOr[HeadersInit] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseInit {
  @scala.inline
  def apply(
    headers: HeadersInit = null,
    status: js.UndefOr[Double] = js.undefined,
    statusText: java.lang.String = null
  ): ResponseInit = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInit]
  }
}

