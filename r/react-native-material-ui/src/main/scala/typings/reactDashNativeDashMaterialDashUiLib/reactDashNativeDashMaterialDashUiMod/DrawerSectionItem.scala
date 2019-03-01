package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerSectionItem extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var value: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
}

object DrawerSectionItem {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    label: java.lang.String = null,
    onLongPress: js.Function0[scala.Unit] = null,
    onPress: js.Function0[scala.Unit] = null,
    value: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null
  ): DrawerSectionItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerSectionItem]
  }
}

