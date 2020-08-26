package typings.reflux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionDefinition extends ActionParameters {
  var actionName: js.UndefOr[String] = js.native
}

object ActionDefinition {
  @scala.inline
  def apply(): ActionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionDefinition]
  }
  @scala.inline
  implicit class ActionDefinitionOps[Self <: ActionDefinition] (val x: Self) extends AnyVal {
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
    def setActionName(value: String): Self = this.set("actionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
  }
  
}

