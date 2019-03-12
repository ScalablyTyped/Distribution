package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomNavigationAction extends js.Object {
  var active: scala.Boolean
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var icon: reactLib.reactMod.Global.JSXNs.Element | java.lang.String
  var key: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_Active] = js.undefined
}

object BottomNavigationAction {
  @scala.inline
  def apply(
    active: scala.Boolean,
    icon: reactLib.reactMod.Global.JSXNs.Element | java.lang.String,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    label: java.lang.String = null,
    onPress: () => scala.Unit = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_Active = null
  ): BottomNavigationAction = {
    val __obj = js.Dynamic.literal(active = active, icon = icon.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[BottomNavigationAction]
  }
}

