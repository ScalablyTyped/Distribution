package typings.rcPicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Focused extends js.Object {
  var focused: Boolean = js.native
  var typing: Boolean = js.native
}

object Focused {
  @scala.inline
  def apply(focused: Boolean, typing: Boolean): Focused = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], typing = typing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  @scala.inline
  implicit class FocusedOps[Self <: Focused] (val x: Self) extends AnyVal {
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
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    @scala.inline
    def setTyping(value: Boolean): Self = this.set("typing", value.asInstanceOf[js.Any])
  }
  
}

