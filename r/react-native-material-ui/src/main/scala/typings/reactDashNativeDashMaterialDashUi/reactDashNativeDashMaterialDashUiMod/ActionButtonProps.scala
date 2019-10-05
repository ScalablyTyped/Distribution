package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSX.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_Container
import typings.reactDashNativeDashMaterialDashUi.Anon_Icon
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiStrings.speedDial
import typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiStrings.toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonProps extends js.Object {
  var actions: js.UndefOr[js.Array[Anon_Icon | Element | String]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[Anon_Container] = js.undefined
  var transition: js.UndefOr[toolbar | speedDial] = js.undefined
}

object ActionButtonProps {
  @scala.inline
  def apply(
    actions: js.Array[Anon_Icon | Element | String] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    style: Anon_Container = null,
    transition: toolbar | speedDial = null
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

