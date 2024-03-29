package typings.pusherJs

import typings.pusherJs.typesSrcCoreSocketMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionConnectionMod {
  
  @JSImport("pusher-js/types/src/core/connection/connection", JSImport.Default)
  @js.native
  open class default protected () extends Connection {
    def this(id: String, transport: typings.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default) = this()
  }
  
  @js.native
  trait Connection
    extends typings.pusherJs.typesSrcCoreEventsDispatcherMod.default
       with Socket {
    
    var activityTimeout: Double = js.native
    
    /* private */ var bindListeners: Any = js.native
    
    /* private */ var handleCloseEvent: Any = js.native
    
    def handlesActivityChecks(): Boolean = js.native
    
    var id: String = js.native
    
    @JSName("ping")
    def ping_MConnection(): Unit = js.native
    
    def send_event(name: String, data: Any): Boolean = js.native
    def send_event(name: String, data: Any, channel: String): Boolean = js.native
    
    var transport: typings.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default = js.native
  }
}
