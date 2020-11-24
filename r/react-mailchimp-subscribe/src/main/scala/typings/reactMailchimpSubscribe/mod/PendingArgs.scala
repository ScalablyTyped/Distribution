package typings.reactMailchimpSubscribe.mod

import typings.reactMailchimpSubscribe.reactMailchimpSubscribeStrings.sending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingArgs extends js.Object {
  
  var message: Null = js.native
  
  var status: sending | Null = js.native
}
object PendingArgs {
  
  @scala.inline
  def apply(message: Null): PendingArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingArgs]
  }
  
  @scala.inline
  implicit class PendingArgsOps[Self <: PendingArgs] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: Null): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: sending): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
