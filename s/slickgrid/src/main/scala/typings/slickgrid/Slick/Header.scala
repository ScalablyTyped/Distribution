package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Header extends js.Object {
  var buttons: js.Array[HeaderButton] = js.native
}

object Header {
  @scala.inline
  def apply(buttons: js.Array[HeaderButton]): Header = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  @scala.inline
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: HeaderButton*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[HeaderButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
  }
  
}

