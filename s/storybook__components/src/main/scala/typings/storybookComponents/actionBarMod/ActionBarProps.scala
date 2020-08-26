package typings.storybookComponents.actionBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBarProps extends js.Object {
  var actionItems: js.Array[ActionItem] = js.native
}

object ActionBarProps {
  @scala.inline
  def apply(actionItems: js.Array[ActionItem]): ActionBarProps = {
    val __obj = js.Dynamic.literal(actionItems = actionItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBarProps]
  }
  @scala.inline
  implicit class ActionBarPropsOps[Self <: ActionBarProps] (val x: Self) extends AnyVal {
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
    def setActionItemsVarargs(value: ActionItem*): Self = this.set("actionItems", js.Array(value :_*))
    @scala.inline
    def setActionItems(value: js.Array[ActionItem]): Self = this.set("actionItems", value.asInstanceOf[js.Any])
  }
  
}

