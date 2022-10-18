package typings.pusherJs

import typings.pusherJs.typesSrcCoreConnectionConnectionManagerOptionsMod.ConnectionManagerOptions
import typings.pusherJs.typesSrcCoreOptionsMod.Options
import typings.pusherJs.typesSrcCorePusherMod.Pusher
import typings.pusherJs.typesSrcRuntimesInterfaceMod.Runtime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeMod {
  
  @JSImport("pusher-js/react-native", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.pusherJs.typesSrcCorePusherMod.default {
    def this(app_key: String) = this()
    def this(app_key: String, options: Options) = this()
  }
  /* static members */
  object default {
    
    @JSImport("pusher-js/react-native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pusher-js/react-native", "default.DependenciesReceivers")
    @js.native
    def DependenciesReceivers: Any = js.native
    inline def DependenciesReceivers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DependenciesReceivers")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/react-native", "default.Runtime")
    @js.native
    def Runtime: typings.pusherJs.typesSrcRuntimesInterfaceMod.Runtime = js.native
    inline def Runtime_=(x: Runtime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Runtime")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/react-native", "default.ScriptReceivers")
    @js.native
    def ScriptReceivers: Any = js.native
    inline def ScriptReceivers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ScriptReceivers")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/react-native", "default.auth_callbacks")
    @js.native
    def auth_callbacks: Any = js.native
    inline def auth_callbacks_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auth_callbacks")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/react-native", "default.getClientFeatures")
    @js.native
    def getClientFeatures: Any = js.native
    inline def getClientFeatures_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getClientFeatures")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/react-native", "default.instances")
    @js.native
    def instances: js.Array[Pusher] = js.native
    inline def instances_=(x: js.Array[Pusher]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instances")(x.asInstanceOf[js.Any])
    
    @JSImport("pusher-js/react-native", "default.isReady")
    @js.native
    def isReady: Boolean = js.native
    inline def isReady_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isReady")(x.asInstanceOf[js.Any])
    
    inline def log(message: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("pusher-js/react-native", "default.logToConsole")
    @js.native
    def logToConsole: Boolean = js.native
    inline def logToConsole_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logToConsole")(x.asInstanceOf[js.Any])
    
    inline def ready(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[Unit]
  }
  
  @JSImport("pusher-js/react-native", "Channel")
  @js.native
  open class Channel protected ()
    extends typings.pusherJs.typesSrcCoreChannelsChannelMod.default {
    def this(name: String, pusher: typings.pusherJs.typesSrcCorePusherMod.default) = this()
  }
  
  @JSImport("pusher-js/react-native", "ConnectionManager")
  @js.native
  open class ConnectionManager protected ()
    extends typings.pusherJs.typesSrcCoreConnectionConnectionManagerMod.default {
    def this(key: String, options: ConnectionManagerOptions) = this()
  }
  
  @JSImport("pusher-js/react-native", "Members")
  @js.native
  open class Members ()
    extends typings.pusherJs.typesSrcCoreChannelsMembersMod.default
  
  @JSImport("pusher-js/react-native", "PresenceChannel")
  @js.native
  open class PresenceChannel protected ()
    extends typings.pusherJs.typesSrcCoreChannelsPresenceChannelMod.default {
    def this(name: String, pusher: typings.pusherJs.typesSrcCorePusherMod.default) = this()
  }
}
