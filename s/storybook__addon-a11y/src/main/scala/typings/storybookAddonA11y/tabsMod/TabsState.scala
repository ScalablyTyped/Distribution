package typings.storybookAddonA11y.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsState extends js.Object {
  var active: Double = js.native
}

object TabsState {
  @scala.inline
  def apply(active: Double): TabsState = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsState]
  }
  @scala.inline
  implicit class TabsStateOps[Self <: TabsState] (val x: Self) extends AnyVal {
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
    def setActive(value: Double): Self = this.set("active", value.asInstanceOf[js.Any])
  }
  
}

