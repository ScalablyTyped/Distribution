package typings.reactMdl.mod

import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BadgeProps
  extends ClassAttributes[js.Any] {
  var className: js.UndefOr[String] = js.native
  var noBackground: js.UndefOr[Boolean] = js.native
  var overlap: js.UndefOr[Boolean] = js.native
  var text: String | Double = js.native
}

object BadgeProps {
  @scala.inline
  def apply(text: String | Double): BadgeProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
  @scala.inline
  implicit class BadgePropsOps[Self <: BadgeProps] (val x: Self) extends AnyVal {
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
    def setText(value: String | Double): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setNoBackground(value: Boolean): Self = this.set("noBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoBackground: Self = this.set("noBackground", js.undefined)
    @scala.inline
    def setOverlap(value: Boolean): Self = this.set("overlap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlap: Self = this.set("overlap", js.undefined)
  }
  
}

