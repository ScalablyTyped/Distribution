package typings.pusherJs

import typings.pusherJs.configMod.Config
import typings.pusherJs.coreOptionsMod.Options
import typings.pusherJs.interfaceMod.Runtime
import typings.pusherJs.timersMod.PeriodicTimer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pusherMod {
  
  @JSImport("pusher-js/types/src/core/pusher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Pusher {
    def this(app_key: String) = this()
    def this(app_key: String, options: Options) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pusher-js/types/src/core/pusher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pusher-js/types/src/core/pusher", "default.DependenciesReceivers")
    @js.native
    def DependenciesReceivers: Any = js.native
    inline def DependenciesReceivers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DependenciesReceivers")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/types/src/core/pusher", "default.Runtime")
    @js.native
    def Runtime: typings.pusherJs.interfaceMod.Runtime = js.native
    inline def Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/types/src/core/pusher", "default.ScriptReceivers")
    @js.native
    def ScriptReceivers: Any = js.native
    inline def ScriptReceivers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScriptReceivers")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/types/src/core/pusher", "default.auth_callbacks")
    @js.native
    def auth_callbacks: Any = js.native
    inline def auth_callbacks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auth_callbacks")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/types/src/core/pusher", "default.getClientFeatures")
    @js.native
    def getClientFeatures: Any = js.native
    inline def getClientFeatures_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClientFeatures")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/types/src/core/pusher", "default.instances")
    @js.native
    def instances: js.Array[Pusher] = js.native
    inline def instances_=(x: js.Array[Pusher]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instances")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/types/src/core/pusher", "default.isReady")
    @js.native
    def isReady: Boolean = js.native
    inline def isReady_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isReady")(x.asInstanceOf[js.Any])
    
    inline def log(message: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("pusher-js/types/src/core/pusher", "default.logToConsole")
    @js.native
    def logToConsole: Boolean = js.native
    inline def logToConsole_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logToConsole")(x.asInstanceOf[js.Any])
    
    inline def ready(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[Unit]
  }
  
  @js.native
  trait Pusher extends StObject {
    
    def allChannels(): js.Array[typings.pusherJs.channelMod.default] = js.native
    
    def bind(event_name: String, callback: js.Function): Pusher = js.native
    def bind(event_name: String, callback: js.Function, context: Any): Pusher = js.native
    
    def bind_global(callback: js.Function): Pusher = js.native
    
    def channel(name: String): typings.pusherJs.channelMod.default = js.native
    
    var channels: typings.pusherJs.channelsMod.default = js.native
    
    var config: Config = js.native
    
    def connect(): Unit = js.native
    
    var connection: typings.pusherJs.connectionManagerMod.default = js.native
    
    def disconnect(): Unit = js.native
    
    var global_emitter: typings.pusherJs.dispatcherMod.default = js.native
    
    var key: String = js.native
    
    def send_event(event_name: String, data: Any): Boolean = js.native
    def send_event(event_name: String, data: Any, channel: String): Boolean = js.native
    
    var sessionID: Double = js.native
    
    def shouldUseTLS(): Boolean = js.native
    
    def signin(): Unit = js.native
    
    def subscribe(channel_name: String): typings.pusherJs.channelMod.default = js.native
    
    def subscribeAll(): Unit = js.native
    
    var timeline: typings.pusherJs.timelineMod.default = js.native
    
    var timelineSender: typings.pusherJs.timelineSenderMod.default = js.native
    
    var timelineSenderTimer: PeriodicTimer = js.native
    
    def unbind(): Pusher = js.native
    def unbind(event_name: String): Pusher = js.native
    def unbind(event_name: String, callback: js.Function): Pusher = js.native
    def unbind(event_name: String, callback: js.Function, context: Any): Pusher = js.native
    def unbind(event_name: String, callback: Unit, context: Any): Pusher = js.native
    def unbind(event_name: Unit, callback: js.Function): Pusher = js.native
    def unbind(event_name: Unit, callback: js.Function, context: Any): Pusher = js.native
    def unbind(event_name: Unit, callback: Unit, context: Any): Pusher = js.native
    
    def unbind_all(): Pusher = js.native
    def unbind_all(callback: js.Function): Pusher = js.native
    
    def unbind_global(): Pusher = js.native
    def unbind_global(callback: js.Function): Pusher = js.native
    
    def unsubscribe(channel_name: String): Unit = js.native
    
    var user: typings.pusherJs.userMod.default = js.native
  }
}
