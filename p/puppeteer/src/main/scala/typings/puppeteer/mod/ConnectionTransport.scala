package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionTransport extends js.Object {
  
  def close(): Unit = js.native
  
  var onclose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onmessage: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  
  def send(message: String): Unit = js.native
}
object ConnectionTransport {
  
  @scala.inline
  def apply(close: () => Unit, send: String => Unit): ConnectionTransport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[ConnectionTransport]
  }
  
  @scala.inline
  implicit class ConnectionTransportOps[Self <: ConnectionTransport] (val x: Self) extends AnyVal {
    
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
    def setSend(value: String => Unit): Self = this.set("send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnclose(value: () => Unit): Self = this.set("onclose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnclose: Self = this.set("onclose", js.undefined)
    
    @scala.inline
    def setOnmessage(value: /* message */ String => Unit): Self = this.set("onmessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmessage: Self = this.set("onmessage", js.undefined)
  }
}
