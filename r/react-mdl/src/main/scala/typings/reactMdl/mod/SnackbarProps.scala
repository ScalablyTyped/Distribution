package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackbarProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var active: Boolean = js.native
  var onActionClick: js.UndefOr[MouseEventHandler[Snackbar]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  def onTimeout(): js.Any = js.native
}

object SnackbarProps {
  @scala.inline
  def apply(active: Boolean, onTimeout: () => js.Any): SnackbarProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], onTimeout = js.Any.fromFunction0(onTimeout))
    __obj.asInstanceOf[SnackbarProps]
  }
  @scala.inline
  implicit class SnackbarPropsOps[Self <: SnackbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnTimeout(value: () => js.Any): Self = this.set("onTimeout", js.Any.fromFunction0(value))
    @scala.inline
    def setOnActionClick(value: MouseEvent[Snackbar, NativeMouseEvent] => Unit): Self = this.set("onActionClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnActionClick: Self = this.set("onActionClick", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

