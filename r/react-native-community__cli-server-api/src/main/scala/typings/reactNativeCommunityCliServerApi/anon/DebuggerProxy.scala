package typings.reactNativeCommunityCliServerApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebuggerProxy extends js.Object {
  
  var debuggerProxy: IsDebuggerConnected = js.native
  
  var eventsSocket: ReportEvent = js.native
  
  var messageSocket: Broadcast = js.native
}
object DebuggerProxy {
  
  @scala.inline
  def apply(debuggerProxy: IsDebuggerConnected, eventsSocket: ReportEvent, messageSocket: Broadcast): DebuggerProxy = {
    val __obj = js.Dynamic.literal(debuggerProxy = debuggerProxy.asInstanceOf[js.Any], eventsSocket = eventsSocket.asInstanceOf[js.Any], messageSocket = messageSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerProxy]
  }
  
  @scala.inline
  implicit class DebuggerProxyOps[Self <: DebuggerProxy] (val x: Self) extends AnyVal {
    
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
    def setDebuggerProxy(value: IsDebuggerConnected): Self = this.set("debuggerProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsSocket(value: ReportEvent): Self = this.set("eventsSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageSocket(value: Broadcast): Self = this.set("messageSocket", value.asInstanceOf[js.Any])
  }
}
