package typings.reactDashMdl.reactDashMdlMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps
  extends HTMLProps[js.Any] {
  var active: Boolean
  var onActionClick: js.UndefOr[MouseEventHandler[Snackbar]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  def onTimeout(): js.Any
}

object SnackbarProps {
  @scala.inline
  def apply(
    active: Boolean,
    onTimeout: () => js.Any,
    HTMLProps: HTMLProps[js.Any] = null,
    action: String = null,
    onActionClick: MouseEvent[Snackbar, NativeMouseEvent] => Unit = null,
    timeout: Int | Double = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(active = active, onTimeout = js.Any.fromFunction0(onTimeout))
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (action != null) __obj.updateDynamic("action")(action)
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1(onActionClick))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

