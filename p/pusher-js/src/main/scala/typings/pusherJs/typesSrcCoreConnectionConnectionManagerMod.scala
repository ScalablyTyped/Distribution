package typings.pusherJs

import typings.pusherJs.typesSrcCoreConnectionCallbacksMod.ConnectionCallbacks
import typings.pusherJs.typesSrcCoreConnectionCallbacksMod.ErrorCallbacks
import typings.pusherJs.typesSrcCoreConnectionCallbacksMod.HandshakeCallbacks
import typings.pusherJs.typesSrcCoreConnectionConnectionManagerOptionsMod.ConnectionManagerOptions
import typings.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typings.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import typings.pusherJs.typesSrcCoreUtilsTimersMod.OneOffTimer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionConnectionManagerMod {
  
  @JSImport("pusher-js/types/src/core/connection/connection_manager", JSImport.Default)
  @js.native
  open class default protected () extends ConnectionManager {
    def this(key: String, options: ConnectionManagerOptions) = this()
  }
  
  @js.native
  trait ConnectionManager
    extends typings.pusherJs.typesSrcCoreEventsDispatcherMod.default {
    
    /* private */ var abandonConnection: Any = js.native
    
    /* private */ var abortConnecting: Any = js.native
    
    var activityTimeout: Double = js.native
    
    var activityTimer: OneOffTimer = js.native
    
    /* private */ var buildConnectionCallbacks: Any = js.native
    
    /* private */ var buildErrorCallbacks: Any = js.native
    
    /* private */ var buildHandshakeCallbacks: Any = js.native
    
    /* private */ var clearRetryTimer: Any = js.native
    
    /* private */ var clearUnavailableTimer: Any = js.native
    
    def connect(): Unit = js.native
    
    var connection: typings.pusherJs.typesSrcCoreConnectionConnectionMod.default = js.native
    
    var connectionCallbacks: ConnectionCallbacks = js.native
    
    def disconnect(): Unit = js.native
    
    /* private */ var disconnectInternally: Any = js.native
    
    var errorCallbacks: ErrorCallbacks = js.native
    
    var handshakeCallbacks: HandshakeCallbacks = js.native
    
    def isUsingTLS(): Boolean = js.native
    
    var key: String = js.native
    
    var options: ConnectionManagerOptions = js.native
    
    /* private */ var resetActivityCheck: Any = js.native
    
    /* private */ var retryIn: Any = js.native
    
    var retryTimer: OneOffTimer = js.native
    
    var runner: StrategyRunner = js.native
    
    def send(data: Any): Boolean = js.native
    
    /* private */ var sendActivityCheck: Any = js.native
    
    def send_event(name: String, data: Any): Boolean = js.native
    def send_event(name: String, data: Any, channel: String): Boolean = js.native
    
    /* private */ var setConnection: Any = js.native
    
    /* private */ var setUnavailableTimer: Any = js.native
    
    /* private */ var shouldRetry: Any = js.native
    
    var socket_id: String = js.native
    
    /* private */ var startConnecting: Any = js.native
    
    var state: String = js.native
    
    /* private */ var stopActivityCheck: Any = js.native
    
    var strategy: Strategy = js.native
    
    var timeline: typings.pusherJs.typesSrcCoreTimelineTimelineMod.default = js.native
    
    var unavailableTimer: OneOffTimer = js.native
    
    /* private */ var updateState: Any = js.native
    
    /* private */ var updateStrategy: Any = js.native
    
    var usingTLS: Boolean = js.native
  }
}
