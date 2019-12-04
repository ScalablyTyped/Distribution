package typings.rmcDashCalendar.libCalendarConfirmPanelMod

import typings.rmcDashCalendar.libDateDataTypesMod.Models.Locale
import typings.rmcDashCalendar.rmcDashCalendarStrings.one
import typings.rmcDashCalendar.rmcDashCalendarStrings.range
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmPanelPropsType extends js.Object {
  var disableBtn: js.UndefOr[Boolean] = js.undefined
  var endDateTime: js.UndefOr[Date] = js.undefined
  var formatStr: js.UndefOr[String] = js.undefined
  var locale: Locale
  var onlyConfirm: js.UndefOr[Boolean] = js.undefined
  var startDateTime: js.UndefOr[Date] = js.undefined
  var `type`: js.UndefOr[one | range] = js.undefined
  def onConfirm(): Unit
}

object ConfirmPanelPropsType {
  @scala.inline
  def apply(
    locale: Locale,
    onConfirm: () => Unit,
    disableBtn: js.UndefOr[Boolean] = js.undefined,
    endDateTime: Date = null,
    formatStr: String = null,
    onlyConfirm: js.UndefOr[Boolean] = js.undefined,
    startDateTime: Date = null,
    `type`: one | range = null
  ): ConfirmPanelPropsType = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onConfirm = js.Any.fromFunction0(onConfirm))
    if (!js.isUndefined(disableBtn)) __obj.updateDynamic("disableBtn")(disableBtn.asInstanceOf[js.Any])
    if (endDateTime != null) __obj.updateDynamic("endDateTime")(endDateTime.asInstanceOf[js.Any])
    if (formatStr != null) __obj.updateDynamic("formatStr")(formatStr.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyConfirm)) __obj.updateDynamic("onlyConfirm")(onlyConfirm.asInstanceOf[js.Any])
    if (startDateTime != null) __obj.updateDynamic("startDateTime")(startDateTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPanelPropsType]
  }
}

