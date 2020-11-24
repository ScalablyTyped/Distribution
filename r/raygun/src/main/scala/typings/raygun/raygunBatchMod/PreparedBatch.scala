package typings.raygun.raygunBatchMod

import typings.node.httpMod.IncomingMessage
import typings.raygun.typesMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreparedBatch extends js.Object {
  
  var callbacks: js.Array[Callback[IncomingMessage]] = js.native
  
  var messageCount: Double = js.native
  
  var payload: String = js.native
}
object PreparedBatch {
  
  @scala.inline
  def apply(callbacks: js.Array[Callback[IncomingMessage]], messageCount: Double, payload: String): PreparedBatch = {
    val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreparedBatch]
  }
  
  @scala.inline
  implicit class PreparedBatchOps[Self <: PreparedBatch] (val x: Self) extends AnyVal {
    
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
    def setCallbacksVarargs(value: Callback[IncomingMessage]*): Self = this.set("callbacks", js.Array(value :_*))
    
    @scala.inline
    def setCallbacks(value: js.Array[Callback[IncomingMessage]]): Self = this.set("callbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageCount(value: Double): Self = this.set("messageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
}
