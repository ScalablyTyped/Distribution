package typings.stompit.socketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SocketOptions extends js.Object {
  
  var commandHandlers: js.UndefOr[CommandHandlers] = js.native
  
  var heartbeat: js.UndefOr[Heartbeat] = js.native
  
  var heartbeatDelayMargin: js.UndefOr[Double] = js.native
  
  var heartbeatOutputMargin: js.UndefOr[Double] = js.native
  
  var outgoingFrameStream: js.UndefOr[typings.stompit.outgoingFrameStreamMod.^] = js.native
  
  var resetDisconnect: js.UndefOr[Boolean] = js.native
  
  var unknownCommand: js.UndefOr[js.Function0[Unit]] = js.native
}
object SocketOptions {
  
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
    
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
    def setCommandHandlers(value: CommandHandlers): Self = this.set("commandHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandHandlers: Self = this.set("commandHandlers", js.undefined)
    
    @scala.inline
    def setHeartbeatVarargs(value: Double*): Self = this.set("heartbeat", js.Array(value :_*))
    
    @scala.inline
    def setHeartbeat(value: Heartbeat): Self = this.set("heartbeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeat: Self = this.set("heartbeat", js.undefined)
    
    @scala.inline
    def setHeartbeatDelayMargin(value: Double): Self = this.set("heartbeatDelayMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatDelayMargin: Self = this.set("heartbeatDelayMargin", js.undefined)
    
    @scala.inline
    def setHeartbeatOutputMargin(value: Double): Self = this.set("heartbeatOutputMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatOutputMargin: Self = this.set("heartbeatOutputMargin", js.undefined)
    
    @scala.inline
    def setOutgoingFrameStream(value: typings.stompit.outgoingFrameStreamMod.^): Self = this.set("outgoingFrameStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingFrameStream: Self = this.set("outgoingFrameStream", js.undefined)
    
    @scala.inline
    def setResetDisconnect(value: Boolean): Self = this.set("resetDisconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetDisconnect: Self = this.set("resetDisconnect", js.undefined)
    
    @scala.inline
    def setUnknownCommand(value: () => Unit): Self = this.set("unknownCommand", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteUnknownCommand: Self = this.set("unknownCommand", js.undefined)
  }
}
