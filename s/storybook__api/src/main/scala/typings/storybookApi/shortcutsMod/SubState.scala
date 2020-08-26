package typings.storybookApi.shortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubState extends js.Object {
  var shortcuts: Shortcuts = js.native
}

object SubState {
  @scala.inline
  def apply(shortcuts: Shortcuts): SubState = {
    val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubState]
  }
  @scala.inline
  implicit class SubStateOps[Self <: SubState] (val x: Self) extends AnyVal {
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
    def setShortcuts(value: Shortcuts): Self = this.set("shortcuts", value.asInstanceOf[js.Any])
  }
  
}

