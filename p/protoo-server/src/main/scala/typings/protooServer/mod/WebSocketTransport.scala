package typings.protooServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocketTransport extends js.Object {
  
  def close(): Unit = js.native
  
  var closed: Boolean = js.native
  
  def send(message: js.Any): js.Promise[Unit] = js.native
}
object WebSocketTransport {
  
  @scala.inline
  def apply(close: () => Unit, closed: Boolean, send: js.Any => js.Promise[Unit]): WebSocketTransport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = closed.asInstanceOf[js.Any], send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[WebSocketTransport]
  }
  
  @scala.inline
  implicit class WebSocketTransportOps[Self <: WebSocketTransport] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: js.Any => js.Promise[Unit]): Self = this.set("send", js.Any.fromFunction1(value))
  }
}
