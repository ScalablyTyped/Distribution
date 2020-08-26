package typings.reactToastify.toastPositionerMod

import typings.react.mod.CSSProperties
import typings.reactToastify.typesMod.ClassName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-toastify.react-toastify/dist/types.ToastProps, 'className' | 'style' | 'in'> */
@js.native
trait ToastPositionerProps extends js.Object {
  var className: js.UndefOr[ClassName] = js.native
  var in: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object ToastPositionerProps {
  @scala.inline
  def apply(): ToastPositionerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastPositionerProps]
  }
  @scala.inline
  implicit class ToastPositionerPropsOps[Self <: ToastPositionerProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: ClassName): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClassNameNull: Self = this.set("className", null)
    @scala.inline
    def setIn(value: Boolean): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

