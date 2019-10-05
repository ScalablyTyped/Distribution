package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerSectionItem extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var value: js.UndefOr[String | Element] = js.undefined
}

object DrawerSectionItem {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    label: String = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    value: String | Element = null
  ): DrawerSectionItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerSectionItem]
  }
}

