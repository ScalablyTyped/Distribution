package typings.raygun.raygunBatchMod

import typings.node.httpMod.IncomingMessage
import typings.raygun.typesMod.Callback
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageAndCallback extends js.Object {
  
  var callback: Callback[IncomingMessage] | Null = js.native
  
  var serializedMessage: String = js.native
}
object MessageAndCallback {
  
  @scala.inline
  def apply(serializedMessage: String): MessageAndCallback = {
    val __obj = js.Dynamic.literal(serializedMessage = serializedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAndCallback]
  }
  
  @scala.inline
  implicit class MessageAndCallbackOps[Self <: MessageAndCallback] (val x: Self) extends AnyVal {
    
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
    def setSerializedMessage(value: String): Self = this.set("serializedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackFunction2(value: (/* e */ Error | Null, /* t */ IncomingMessage | Null) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallbackFunction1(value: /* t */ IncomingMessage | Null => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallback(value: Callback[IncomingMessage]): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackNull: Self = this.set("callback", null)
  }
}
