package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonProps extends js.Object {
  var actions: js.UndefOr[
    js.Array[
      reactDashNativeDashMaterialDashUiLib.Anon_Icon | reactLib.reactMod.Global.JSXNs.Element | java.lang.String
    ]
  ] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_Container] = js.undefined
  var transition: js.UndefOr[
    reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.toolbar | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.speedDial
  ] = js.undefined
}

object ActionButtonProps {
  @scala.inline
  def apply(
    actions: js.Array[
      reactDashNativeDashMaterialDashUiLib.Anon_Icon | reactLib.reactMod.Global.JSXNs.Element | java.lang.String
    ] = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    onLongPress: () => scala.Unit = null,
    onPress: () => scala.Unit = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_Container = null,
    transition: reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.toolbar | reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiLibStrings.speedDial = null
  ): ActionButtonProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style)
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonProps]
  }
}

