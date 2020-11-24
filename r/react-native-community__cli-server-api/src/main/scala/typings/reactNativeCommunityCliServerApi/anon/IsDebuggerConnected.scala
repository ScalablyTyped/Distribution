package typings.reactNativeCommunityCliServerApi.anon

import typings.ws.mod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsDebuggerConnected extends js.Object {
  
  def isDebuggerConnected(): Boolean = js.native
  
  var server: Server = js.native
}
object IsDebuggerConnected {
  
  @scala.inline
  def apply(isDebuggerConnected: () => Boolean, server: Server): IsDebuggerConnected = {
    val __obj = js.Dynamic.literal(isDebuggerConnected = js.Any.fromFunction0(isDebuggerConnected), server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDebuggerConnected]
  }
  
  @scala.inline
  implicit class IsDebuggerConnectedOps[Self <: IsDebuggerConnected] (val x: Self) extends AnyVal {
    
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
    def setIsDebuggerConnected(value: () => Boolean): Self = this.set("isDebuggerConnected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
  }
}
