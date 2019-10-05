package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.error

import typings.seleniumDashWebdriver.Anon_Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaybeLegacyResponse extends js.Object {
  var getAlertText: js.UndefOr[js.Function0[String]] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Anon_Message] = js.undefined
}

object MaybeLegacyResponse {
  @scala.inline
  def apply(
    getAlertText: () => String = null,
    message: String = null,
    status: Int | Double = null,
    value: Anon_Message = null
  ): MaybeLegacyResponse = {
    val __obj = js.Dynamic.literal()
    if (getAlertText != null) __obj.updateDynamic("getAlertText")(js.Any.fromFunction0(getAlertText))
    if (message != null) __obj.updateDynamic("message")(message)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MaybeLegacyResponse]
  }
}

