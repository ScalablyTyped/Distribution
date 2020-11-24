package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionClient extends js.Object {
  
  var actionClient: typings.roslib.mod.ActionClient = js.native
  
  var goalMessage: js.Any = js.native
}
object ActionClient {
  
  @scala.inline
  def apply(actionClient: typings.roslib.mod.ActionClient, goalMessage: js.Any): ActionClient = {
    val __obj = js.Dynamic.literal(actionClient = actionClient.asInstanceOf[js.Any], goalMessage = goalMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionClient]
  }
  
  @scala.inline
  implicit class ActionClientOps[Self <: ActionClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionClient(value: typings.roslib.mod.ActionClient): Self = this.set("actionClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalMessage(value: js.Any): Self = this.set("goalMessage", value.asInstanceOf[js.Any])
  }
}
