package typings.storybookAddonA11y.infoMod

import typings.axeCore.mod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfoProps extends js.Object {
  var item: Result = js.native
}

object InfoProps {
  @scala.inline
  def apply(item: Result): InfoProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfoProps]
  }
  @scala.inline
  implicit class InfoPropsOps[Self <: InfoProps] (val x: Self) extends AnyVal {
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
    def setItem(value: Result): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

