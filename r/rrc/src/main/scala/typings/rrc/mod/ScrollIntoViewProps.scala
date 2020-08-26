package typings.rrc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollIntoViewProps extends js.Object {
  var alignToTop: js.UndefOr[Boolean] = js.native
  var id: String = js.native
}

object ScrollIntoViewProps {
  @scala.inline
  def apply(id: String): ScrollIntoViewProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollIntoViewProps]
  }
  @scala.inline
  implicit class ScrollIntoViewPropsOps[Self <: ScrollIntoViewProps] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlignToTop(value: Boolean): Self = this.set("alignToTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignToTop: Self = this.set("alignToTop", js.undefined)
  }
  
}

