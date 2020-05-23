package typings.reactCopyToClipboard.mod

import typings.reactCopyToClipboard.reactCopyToClipboardStrings.textSlashhtml
import typings.reactCopyToClipboard.reactCopyToClipboardStrings.textSlashplain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[textSlashhtml | textSlashplain] = js.undefined
  var message: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    format: textSlashhtml | textSlashplain = null,
    message: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

