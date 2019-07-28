package typings.rmcDashCalendar.libCalendarHeaderMod

import typings.react.reactMod.ReactNode
import typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.Locale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var clearIcon: js.UndefOr[ReactNode] = js.undefined
  var closeIcon: js.UndefOr[ReactNode] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var showClear: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    clearIcon: ReactNode = null,
    closeIcon: ReactNode = null,
    locale: Locale = null,
    onCancel: () => Unit = null,
    onClear: () => Unit = null,
    showClear: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PropsType]
  }
}

