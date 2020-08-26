package typings.reactBootstrapTypeahead.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomOption extends js.Object {
  var customOption: Boolean = js.native
}

object CustomOption {
  @scala.inline
  def apply(customOption: Boolean): CustomOption = {
    val __obj = js.Dynamic.literal(customOption = customOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomOption]
  }
  @scala.inline
  implicit class CustomOptionOps[Self <: CustomOption] (val x: Self) extends AnyVal {
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
    def setCustomOption(value: Boolean): Self = this.set("customOption", value.asInstanceOf[js.Any])
  }
  
}

