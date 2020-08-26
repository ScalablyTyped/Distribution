package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var threeLine: js.UndefOr[Boolean] = js.native
  var twoLine: js.UndefOr[Boolean] = js.native
}

object ListItemProps {
  @scala.inline
  def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
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
    def setThreeLine(value: Boolean): Self = this.set("threeLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreeLine: Self = this.set("threeLine", js.undefined)
    @scala.inline
    def setTwoLine(value: Boolean): Self = this.set("twoLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwoLine: Self = this.set("twoLine", js.undefined)
  }
  
}

