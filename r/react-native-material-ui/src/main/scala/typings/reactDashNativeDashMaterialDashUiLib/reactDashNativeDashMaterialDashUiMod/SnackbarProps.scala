package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends js.Object {
  var actionText: js.UndefOr[java.lang.String] = js.undefined
  var bottomNavigation: scala.Boolean
  var button: js.UndefOr[ButtonProps] = js.undefined
  var message: java.lang.String
  var onActionPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerMessage] = js.undefined
  var timeout: scala.Double
  var visible: scala.Boolean
  def onRequestClose(): scala.Unit
}

object SnackbarProps {
  @scala.inline
  def apply(
    bottomNavigation: scala.Boolean,
    message: java.lang.String,
    onRequestClose: () => scala.Unit,
    timeout: scala.Double,
    visible: scala.Boolean,
    actionText: java.lang.String = null,
    button: ButtonProps = null,
    onActionPress: () => scala.Unit = null,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerMessage = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(bottomNavigation = bottomNavigation, message = message, onRequestClose = js.Any.fromFunction0(onRequestClose), timeout = timeout, visible = visible)
    if (actionText != null) __obj.updateDynamic("actionText")(actionText)
    if (button != null) __obj.updateDynamic("button")(button)
    if (onActionPress != null) __obj.updateDynamic("onActionPress")(js.Any.fromFunction0(onActionPress))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SnackbarProps]
  }
}

