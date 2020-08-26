package typings.reactOutsideClickHandler.mod

import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline-block`
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.`inline`
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.block
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.contents
import typings.reactOutsideClickHandler.reactOutsideClickHandlerStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultProps extends js.Object {
  var disabled: Boolean = js.native
  var display: block | flex | `inline` | `inline-block` | contents = js.native
  var useCapture: Boolean = js.native
}

object DefaultProps {
  @scala.inline
  def apply(
    disabled: Boolean,
    display: block | flex | `inline` | `inline-block` | contents,
    useCapture: Boolean
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], useCapture = useCapture.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
  @scala.inline
  implicit class DefaultPropsOps[Self <: DefaultProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplay(value: block | flex | `inline` | `inline-block` | contents): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCapture(value: Boolean): Self = this.set("useCapture", value.asInstanceOf[js.Any])
  }
  
}

