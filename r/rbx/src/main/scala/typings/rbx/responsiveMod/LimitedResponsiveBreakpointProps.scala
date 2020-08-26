package typings.rbx.responsiveMod

import typings.rbx.anon.Value
import typings.rbx.anon.ValueBoolean
import typings.rbx.anon.`1`
import typings.rbx.anon.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimitedResponsiveBreakpointProps extends js.Object {
  var display: js.UndefOr[Value] = js.native
  var hide: js.UndefOr[ValueBoolean] = js.native
  var textAlign: js.UndefOr[`1`] = js.native
  var textSize: js.UndefOr[`2`] = js.native
}

object LimitedResponsiveBreakpointProps {
  @scala.inline
  def apply(): LimitedResponsiveBreakpointProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitedResponsiveBreakpointProps]
  }
  @scala.inline
  implicit class LimitedResponsiveBreakpointPropsOps[Self <: LimitedResponsiveBreakpointProps] (val x: Self) extends AnyVal {
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
    def setDisplay(value: Value): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setHide(value: ValueBoolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setTextAlign(value: `1`): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setTextSize(value: `2`): Self = this.set("textSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextSize: Self = this.set("textSize", js.undefined)
  }
  
}

