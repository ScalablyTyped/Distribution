package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionClient extends StObject {
  
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
  implicit class ActionClientMutableBuilder[Self <: ActionClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionClient(value: typings.roslib.mod.ActionClient): Self = StObject.set(x, "actionClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalMessage(value: js.Any): Self = StObject.set(x, "goalMessage", value.asInstanceOf[js.Any])
  }
}
