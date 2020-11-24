package typings.slackMock.mod

import typings.node.Buffer
import typings.ws.mod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RtmCall[T] extends js.Object {
  
  var message: T = js.native
  
  var rawMessage: Data = js.native
  
  var token: String = js.native
}
object RtmCall {
  
  @scala.inline
  def apply[T](message: T, rawMessage: Data, token: String): RtmCall[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], rawMessage = rawMessage.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[RtmCall[T]]
  }
  
  @scala.inline
  implicit class RtmCallOps[Self <: RtmCall[_], T] (val x: Self with RtmCall[T]) extends AnyVal {
    
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
    def setMessage(value: T): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawMessageVarargs(value: Buffer*): Self = this.set("rawMessage", js.Array(value :_*))
    
    @scala.inline
    def setRawMessage(value: Data): Self = this.set("rawMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
