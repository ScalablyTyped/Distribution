package typings.seleniumWebdriver.mod.error

import typings.seleniumWebdriver.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeLegacyResponse extends js.Object {
  var getAlertText: js.UndefOr[js.Function0[String]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Message] = js.undefined
}

object MaybeLegacyResponse {
  @scala.inline
  def apply(
    getAlertText: () => String = null,
    message: String = null,
    status: js.UndefOr[Double] = js.undefined,
    value: Message = null
  ): MaybeLegacyResponse = {
    val __obj = js.Dynamic.literal()
    if (getAlertText != null) __obj.updateDynamic("getAlertText")(js.Any.fromFunction0(getAlertText))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaybeLegacyResponse]
  }
}

