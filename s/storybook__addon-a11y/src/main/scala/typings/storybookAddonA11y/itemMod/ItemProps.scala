package typings.storybookAddonA11y.itemMod

import typings.axeCore.mod.Result
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemProps extends js.Object {
  var item: Result = js.native
  var `type`: RuleType = js.native
}

object ItemProps {
  @scala.inline
  def apply(item: Result, `type`: RuleType): ItemProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProps]
  }
  @scala.inline
  implicit class ItemPropsOps[Self <: ItemProps] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setType(value: RuleType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

