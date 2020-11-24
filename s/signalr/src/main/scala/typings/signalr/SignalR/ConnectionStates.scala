package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStates extends js.Object {
  
  var connected: Double = js.native
  
  var connecting: Double = js.native
  
  var disconnected: Double = js.native
  
  var reconnecting: Double = js.native
}
object ConnectionStates {
  
  @scala.inline
  def apply(connected: Double, connecting: Double, disconnected: Double, reconnecting: Double): ConnectionStates = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], reconnecting = reconnecting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionStates]
  }
  
  @scala.inline
  implicit class ConnectionStatesOps[Self <: ConnectionStates] (val x: Self) extends AnyVal {
    
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
    def setConnected(value: Double): Self = this.set("connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnecting(value: Double): Self = this.set("connecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnected(value: Double): Self = this.set("disconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnecting(value: Double): Self = this.set("reconnecting", value.asInstanceOf[js.Any])
  }
}
