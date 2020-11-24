package typings.reactMdAlert.useMessageQueueMod

import typings.reactMdAlert.messageQueueContextMod.DuplicateBehavior
import typings.reactMdAlert.messageQueueContextMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddMessageAction[M /* <: Message */] extends MessageActions[M] {
  
  var duplicates: DuplicateBehavior = js.native
  
  var message: M = js.native
  
  var `type`: /* "ADD_MESSAGE" */ String = js.native
}
object AddMessageAction {
  
  @scala.inline
  def apply[M /* <: Message */](duplicates: DuplicateBehavior, message: M, `type`: /* "ADD_MESSAGE" */ String): AddMessageAction[M] = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddMessageAction[M]]
  }
  
  @scala.inline
  implicit class AddMessageActionOps[Self <: AddMessageAction[_], M /* <: Message */] (val x: Self with AddMessageAction[M]) extends AnyVal {
    
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
    def setDuplicates(value: DuplicateBehavior): Self = this.set("duplicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: M): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: /* "ADD_MESSAGE" */ String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
