package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transports extends js.Object {
  
  var foreverFrame: Transport = js.native
  
  var longPolling: Transport = js.native
  
  var serverSentEvents: Transport = js.native
  
  var webSockets: Transport = js.native
}
object Transports {
  
  @scala.inline
  def apply(
    foreverFrame: Transport,
    longPolling: Transport,
    serverSentEvents: Transport,
    webSockets: Transport
  ): Transports = {
    val __obj = js.Dynamic.literal(foreverFrame = foreverFrame.asInstanceOf[js.Any], longPolling = longPolling.asInstanceOf[js.Any], serverSentEvents = serverSentEvents.asInstanceOf[js.Any], webSockets = webSockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transports]
  }
  
  @scala.inline
  implicit class TransportsOps[Self <: Transports] (val x: Self) extends AnyVal {
    
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
    def setForeverFrame(value: Transport): Self = this.set("foreverFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongPolling(value: Transport): Self = this.set("longPolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSentEvents(value: Transport): Self = this.set("serverSentEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebSockets(value: Transport): Self = this.set("webSockets", value.asInstanceOf[js.Any])
  }
}
