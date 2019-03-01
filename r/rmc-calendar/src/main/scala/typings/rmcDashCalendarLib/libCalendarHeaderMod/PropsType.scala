package typings
package rmcDashCalendarLib.libCalendarHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var clearIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var closeIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var locale: js.UndefOr[rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale] = js.undefined
  var onCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var showClear: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    clearIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    closeIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    locale: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale = null,
    onCancel: js.Function0[scala.Unit] = null,
    onClear: js.Function0[scala.Unit] = null,
    showClear: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onClear != null) __obj.updateDynamic("onClear")(onClear)
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PropsType]
  }
}

