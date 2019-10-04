package typings.reactDashCopyDashToDashClipboard.reactDashCopyDashToDashClipboardMod

import typings.reactDashCopyDashToDashClipboard.reactDashCopyDashToDashClipboardStrings.`text/html`
import typings.reactDashCopyDashToDashClipboard.reactDashCopyDashToDashClipboardStrings.`text/plain`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[`text/html` | `text/plain`] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    format: `text/html` | `text/plain` = null,
    message: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Options]
  }
}

