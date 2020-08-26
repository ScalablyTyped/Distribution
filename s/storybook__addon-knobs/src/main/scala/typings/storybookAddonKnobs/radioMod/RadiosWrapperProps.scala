package typings.storybookAddonKnobs.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadiosWrapperProps extends js.Object {
  var isInline: Boolean = js.native
}

object RadiosWrapperProps {
  @scala.inline
  def apply(isInline: Boolean): RadiosWrapperProps = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadiosWrapperProps]
  }
  @scala.inline
  implicit class RadiosWrapperPropsOps[Self <: RadiosWrapperProps] (val x: Self) extends AnyVal {
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
    def setIsInline(value: Boolean): Self = this.set("isInline", value.asInstanceOf[js.Any])
  }
  
}

