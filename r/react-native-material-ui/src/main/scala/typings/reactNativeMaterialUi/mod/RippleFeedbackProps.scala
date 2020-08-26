package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RippleFeedbackProps extends js.Object {
  var borderless: js.UndefOr[Boolean] = js.native
  var children: Element = js.native
  var color: js.UndefOr[String] = js.native
}

object RippleFeedbackProps {
  @scala.inline
  def apply(children: Element): RippleFeedbackProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleFeedbackProps]
  }
  @scala.inline
  implicit class RippleFeedbackPropsOps[Self <: RippleFeedbackProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: Element): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
  
}

