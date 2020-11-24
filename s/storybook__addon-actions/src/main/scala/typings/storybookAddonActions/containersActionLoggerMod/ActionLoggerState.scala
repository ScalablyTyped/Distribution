package typings.storybookAddonActions.containersActionLoggerMod

import typings.storybookAddonActions.actionDisplayMod.ActionDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionLoggerState extends js.Object {
  
  var actions: js.Array[ActionDisplay] = js.native
}
object ActionLoggerState {
  
  @scala.inline
  def apply(actions: js.Array[ActionDisplay]): ActionLoggerState = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionLoggerState]
  }
  
  @scala.inline
  implicit class ActionLoggerStateOps[Self <: ActionLoggerState] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: ActionDisplay*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[ActionDisplay]): Self = this.set("actions", value.asInstanceOf[js.Any])
  }
}
