package typings.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Addons extends js.Object {
  var selectedPanel: String = js.native
}

object Addons {
  @scala.inline
  def apply(selectedPanel: String): Addons = {
    val __obj = js.Dynamic.literal(selectedPanel = selectedPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addons]
  }
  @scala.inline
  implicit class AddonsOps[Self <: Addons] (val x: Self) extends AnyVal {
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
    def setSelectedPanel(value: String): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
  }
  
}

