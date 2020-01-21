package typings.reactNativeMaterialUi.mod

import typings.react.mod._Global_.JSX.Element
import typings.reactNativeMaterialUi.AnonContainer
import typings.reactNativeMaterialUi.AnonIcon
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.speedDial
import typings.reactNativeMaterialUi.reactNativeMaterialUiStrings.toolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonProps extends js.Object {
  var actions: js.UndefOr[js.Array[AnonIcon | Element | String]] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var onLongPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[AnonContainer] = js.undefined
  var transition: js.UndefOr[toolbar | speedDial] = js.undefined
}

object ActionButtonProps {
  @scala.inline
  def apply(
    actions: js.Array[AnonIcon | Element | String] = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    onLongPress: () => Unit = null,
    onPress: () => Unit = null,
    style: AnonContainer = null,
    transition: toolbar | speedDial = null
  ): ActionButtonProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction0(onLongPress))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButtonProps]
  }
}

