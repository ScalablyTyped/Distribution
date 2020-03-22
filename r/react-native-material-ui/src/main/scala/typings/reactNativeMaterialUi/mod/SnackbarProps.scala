package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.AnonMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps extends js.Object {
  var actionText: js.UndefOr[String] = js.undefined
  var bottomNavigation: Boolean
  var button: js.UndefOr[ButtonProps] = js.undefined
  var message: String
  var onActionPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[AnonMessage] = js.undefined
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
    style: AnonMessage = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(bottomNavigation = bottomNavigation.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction0(onRequestClose), timeout = timeout.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    if (actionText != null) __obj.updateDynamic("actionText")(actionText.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (onActionPress != null) __obj.updateDynamic("onActionPress")(js.Any.fromFunction0(onActionPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

