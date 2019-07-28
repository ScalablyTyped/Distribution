package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends js.Object {
  var actionText: js.UndefOr[String] = js.undefined
  var bottomNavigation: Boolean
  var button: js.UndefOr[ButtonProps] = js.undefined
  var message: String
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[Anon_ContainerMessage] = js.undefined
  var timeout: Double
  var visible: Boolean
  def onRequestClose(): Unit
}

object SnackbarProps {
  @scala.inline
  def apply(
    bottomNavigation: Boolean,
    message: String,
    onRequestClose: () => Unit,
    timeout: Double,
    visible: Boolean,
    actionText: String = null,
    button: ButtonProps = null,
    onActionPress: () => Unit = null,
    style: Anon_ContainerMessage = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(bottomNavigation = bottomNavigation, message = message, onRequestClose = js.Any.fromFunction0(onRequestClose), timeout = timeout, visible = visible)
    if (actionText != null) __obj.updateDynamic("actionText")(actionText)
    if (button != null) __obj.updateDynamic("button")(button)
    if (onActionPress != null) __obj.updateDynamic("onActionPress")(js.Any.fromFunction0(onActionPress))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SnackbarProps]
  }
}

