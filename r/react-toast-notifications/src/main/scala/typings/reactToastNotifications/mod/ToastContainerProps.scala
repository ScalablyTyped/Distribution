package typings.reactToastNotifications.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastContainerProps extends js.Object {
  var children: ReactNode = js.native
  var hasToasts: Boolean = js.native
  var placement: Placement = js.native
}

object ToastContainerProps {
  @scala.inline
  def apply(hasToasts: Boolean, placement: Placement): ToastContainerProps = {
    val __obj = js.Dynamic.literal(hasToasts = hasToasts.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastContainerProps]
  }
  @scala.inline
  implicit class ToastContainerPropsOps[Self <: ToastContainerProps] (val x: Self) extends AnyVal {
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
    def setHasToasts(value: Boolean): Self = this.set("hasToasts", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

