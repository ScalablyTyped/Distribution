package typings.reactDashMdl.reactDashMdlMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
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
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    onActionClick: MouseEvent[Snackbar, NativeMouseEvent] => Unit = null,
    timeout: Int | Double = null
  ): SnackbarProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onTimeout = js.Any.fromFunction0(onTimeout))
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (onActionClick != null) __obj.updateDynamic("onActionClick")(js.Any.fromFunction1(onActionClick))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarProps]
  }
}

