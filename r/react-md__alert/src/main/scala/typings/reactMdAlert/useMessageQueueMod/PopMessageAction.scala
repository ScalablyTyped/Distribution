package typings.reactMdAlert.useMessageQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopMessageAction
  extends MessageActions[js.Any] {
  
  var `type`: /* "POP_MESSAGE" */ String = js.native
}
object PopMessageAction {
  
  @scala.inline
  def apply(`type`: /* "POP_MESSAGE" */ String): PopMessageAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopMessageAction]
  }
  
  @scala.inline
  implicit class PopMessageActionOps[Self <: PopMessageAction] (val x: Self) extends AnyVal {
    
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
    def setType(value: /* "POP_MESSAGE" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
