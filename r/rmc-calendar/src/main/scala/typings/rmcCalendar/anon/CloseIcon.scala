package typings.rmcCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloseIcon extends js.Object {
  var closeIcon: String = js.native
}

object CloseIcon {
  @scala.inline
  def apply(closeIcon: String): CloseIcon = {
    val __obj = js.Dynamic.literal(closeIcon = closeIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseIcon]
  }
  @scala.inline
  implicit class CloseIconOps[Self <: CloseIcon] (val x: Self) extends AnyVal {
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
    def setCloseIcon(value: String): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
  }
  
}

