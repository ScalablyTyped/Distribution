package typings.reactTether.mod.ReactTether

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateEventData extends js.Object {
  
  var attachment: TetherAttachment = js.native
  
  var targetAttachment: TetherAttachment = js.native
}
object UpdateEventData {
  
  @scala.inline
  def apply(attachment: TetherAttachment, targetAttachment: TetherAttachment): UpdateEventData = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any], targetAttachment = targetAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventData]
  }
  
  @scala.inline
  implicit class UpdateEventDataOps[Self <: UpdateEventData] (val x: Self) extends AnyVal {
    
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
    def setAttachment(value: TetherAttachment): Self = this.set("attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAttachment(value: TetherAttachment): Self = this.set("targetAttachment", value.asInstanceOf[js.Any])
  }
}
