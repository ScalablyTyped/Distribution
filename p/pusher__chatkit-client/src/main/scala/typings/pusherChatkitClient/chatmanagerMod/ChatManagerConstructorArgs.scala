package typings.pusherChatkitClient.chatmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatManagerConstructorArgs extends js.Object {
  
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  var instanceLocator: String = js.native
  
  var logger: js.UndefOr[Logger] = js.native
  
  var userId: String = js.native
}
object ChatManagerConstructorArgs {
  
  @scala.inline
  def apply(instanceLocator: String, userId: String): ChatManagerConstructorArgs = {
    val __obj = js.Dynamic.literal(instanceLocator = instanceLocator.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatManagerConstructorArgs]
  }
  
  @scala.inline
  implicit class ChatManagerConstructorArgsOps[Self <: ChatManagerConstructorArgs] (val x: Self) extends AnyVal {
    
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
    def setInstanceLocator(value: String): Self = this.set("instanceLocator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
  }
}
