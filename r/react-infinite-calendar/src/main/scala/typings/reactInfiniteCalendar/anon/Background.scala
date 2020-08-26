package typings.reactInfiniteCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Background extends js.Object {
  var background: js.UndefOr[String] = js.native
  var chevron: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
}

object Background {
  @scala.inline
  def apply(): Background = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Background]
  }
  @scala.inline
  implicit class BackgroundOps[Self <: Background] (val x: Self) extends AnyVal {
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setChevron(value: String): Self = this.set("chevron", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChevron: Self = this.set("chevron", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
  
}

