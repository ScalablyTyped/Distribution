package typings
package slackDashMockLib.slackDashMockMod.SlackMockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveButtonOptions[T] extends js.Object {
  var body: js.UndefOr[T] = js.undefined
  var headers: js.UndefOr[InteractiveButtonHttpHeaders] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[InteractiveButtonUrl] = js.undefined
}

object InteractiveButtonOptions {
  @scala.inline
  def apply[T](
    body: T = null,
    headers: InteractiveButtonHttpHeaders = null,
    statusCode: scala.Int | scala.Double = null,
    url: InteractiveButtonUrl = null
  ): InteractiveButtonOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveButtonOptions[T]]
  }
}

