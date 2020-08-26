package typings.storybookAddonA11y.reportMod

import typings.axeCore.mod.Result
import typings.storybookAddonA11y.a11YPanelMod.RuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportProps extends js.Object {
  var empty: String = js.native
  var items: js.Array[Result] = js.native
  var `type`: RuleType = js.native
}

object ReportProps {
  @scala.inline
  def apply(empty: String, items: js.Array[Result], `type`: RuleType): ReportProps = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportProps]
  }
  @scala.inline
  implicit class ReportPropsOps[Self <: ReportProps] (val x: Self) extends AnyVal {
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
    def setEmpty(value: String): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: Result*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Result]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: RuleType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

