package typings.pusherJs

import typings.pusherJs.typesSrcCoreSocketMod.Socket
import typings.pusherJs.typesSrcCoreTransportsTransportConnectionOptionsMod.TransportConnectionOptions
import typings.pusherJs.typesSrcCoreTransportsTransportHooksMod.TransportHooks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTransportsTransportConnectionMod {
  
  @JSImport("pusher-js/types/src/core/transports/transport_connection", JSImport.Default)
  @js.native
  open class default protected () extends TransportConnection {
    def this(
      hooks: TransportHooks,
      name: String,
      priority: Double,
      key: String,
      options: TransportConnectionOptions
    ) = this()
  }
  
  @js.native
  trait TransportConnection
    extends typings.pusherJs.typesSrcCoreEventsDispatcherMod.default {
    
    var activityTimeout: Double = js.native
    
    var beforeOpen: js.Function = js.native
    
    /* private */ var bindListeners: Any = js.native
    
    def buildTimelineMessage(message: Any): Any = js.native
    
    /* private */ var changeState: Any = js.native
    
    def close(): Boolean = js.native
    
    def connect(): Boolean = js.native
    
    def handlesActivityChecks(): Boolean = js.native
    
    var hooks: TransportHooks = js.native
    
    var id: Double = js.native
    
    var initialize: js.Function = js.native
    
    var key: String = js.native
    
    var name: String = js.native
    
    /* private */ var onActivity: Any = js.native
    
    /* private */ var onClose: Any = js.native
    
    /* private */ var onError: Any = js.native
    
    /* private */ var onMessage: Any = js.native
    
    /* private */ var onOpen: Any = js.native
    
    var options: TransportConnectionOptions = js.native
    
    def ping(): Unit = js.native
    
    var priority: Double = js.native
    
    def send(data: Any): Boolean = js.native
    
    var socket: Socket = js.native
    
    var state: String = js.native
    
    def supportsPing(): Boolean = js.native
    
    var timeline: typings.pusherJs.typesSrcCoreTimelineTimelineMod.default = js.native
    
    /* private */ var unbindListeners: Any = js.native
  }
}
