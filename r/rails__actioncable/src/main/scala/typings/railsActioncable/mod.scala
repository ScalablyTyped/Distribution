package typings.railsActioncable

import org.scalablytyped.runtime.StringDictionary
import typings.railsActioncable.anon.AllowReconnect
import typings.railsActioncable.anon.Close
import typings.railsActioncable.railsActioncableStrings.Slashcable
import typings.railsActioncable.railsActioncableStrings.`actioncable-unsupported`
import typings.railsActioncable.railsActioncableStrings.`actioncable-v1-json`
import typings.std.Console
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rails/actioncable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@rails/actioncable", "Connection")
  @js.native
  open class Connection[C] protected () extends StObject {
    def this(consumer: C) = this()
    
    def close(): Any = js.native
    def close(options: AllowReconnect): Any = js.native
    
    val consumer: C = js.native
    
    val disconnected: Boolean = js.native
    
    def getProtocol(): Unit | String = js.native
    
    def isActive(): Boolean = js.native
    
    def isOpen(): Boolean = js.native
    
    val monitor: ConnectionMonitor[C] = js.native
    
    def open(): Boolean = js.native
    
    def reopen(): Unit = js.native
    
    def send(data: js.Object): Boolean = js.native
    
    val subscriptions: Subscriptions[C] = js.native
  }
  /* static members */
  object Connection {
    
    @JSImport("@rails/actioncable", "Connection.events")
    @js.native
    val events: Close = js.native
    
    @JSImport("@rails/actioncable", "Connection.reopenDelay")
    @js.native
    val reopenDelay: Double = js.native
  }
  
  @JSImport("@rails/actioncable", "ConnectionMonitor")
  @js.native
  open class ConnectionMonitor[C] protected () extends StObject {
    def this(connection: C) = this()
    
    val connection: C = js.native
    
    def isRunning(): Boolean = js.native
    
    val reconnectAttempts: Double = js.native
    
    def recordConnect(): Unit = js.native
    
    def recordDisconnect(): Unit = js.native
    
    def recordPing(): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def visibilityDidChange(): Unit = js.native
  }
  /* static members */
  object ConnectionMonitor {
    
    @JSImport("@rails/actioncable", "ConnectionMonitor.reconnectionBackoffRate")
    @js.native
    val reconnectionBackoffRate: Double = js.native
    
    @JSImport("@rails/actioncable", "ConnectionMonitor.staleThreshold")
    @js.native
    val staleThreshold: Double = js.native
  }
  
  @JSImport("@rails/actioncable", "Consumer")
  @js.native
  open class Consumer protected () extends StObject {
    def this(url: String) = this()
    
    def connect(): Boolean = js.native
    
    val connection: Connection[this.type] = js.native
    
    def disconnect(): Any = js.native
    
    def ensureActiveConnection(): Unit | Boolean = js.native
    
    def send(data: js.Object): Boolean = js.native
    
    val subscriptions: Subscriptions[this.type] = js.native
    
    def url: String = js.native
  }
  
  @js.native
  sealed trait DisconnectReasons extends StObject
  @JSImport("@rails/actioncable", "DisconnectReasons")
  @js.native
  object DisconnectReasons extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DisconnectReasons & String] = js.native
    
    @js.native
    sealed trait invalid_request
      extends StObject
         with DisconnectReasons
    /* "invalid_request" */ val invalid_request: typings.railsActioncable.mod.DisconnectReasons.invalid_request & String = js.native
    
    @js.native
    sealed trait server_restart
      extends StObject
         with DisconnectReasons
    /* "server_restart" */ val server_restart: typings.railsActioncable.mod.DisconnectReasons.server_restart & String = js.native
    
    @js.native
    sealed trait unauthorized
      extends StObject
         with DisconnectReasons
    /* "unauthorized" */ val unauthorized: typings.railsActioncable.mod.DisconnectReasons.unauthorized & String = js.native
  }
  
  object INTERNAL {
    
    @JSImport("@rails/actioncable", "INTERNAL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rails/actioncable", "INTERNAL.default_mount_path")
    @js.native
    def defaultMountPath: Slashcable = js.native
    
    inline def defaultMountPath_=(x: Slashcable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default_mount_path")(x.asInstanceOf[js.Any])
    
    @JSImport("@rails/actioncable", "INTERNAL.disconnect_reasons")
    @js.native
    def disconnectReasons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisconnectReasons */ Any = js.native
    
    inline def disconnectReasons_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisconnectReasons */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disconnect_reasons")(x.asInstanceOf[js.Any])
    
    @JSImport("@rails/actioncable", "INTERNAL.message_types")
    @js.native
    def messageTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageTypes */ Any = js.native
    
    inline def messageTypes_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageTypes */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message_types")(x.asInstanceOf[js.Any])
    
    @JSImport("@rails/actioncable", "INTERNAL.protocols")
    @js.native
    def protocols: js.Tuple2[`actioncable-v1-json`, `actioncable-unsupported`] = js.native
    inline def protocols_=(x: js.Tuple2[`actioncable-v1-json`, `actioncable-unsupported`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocols")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait MessageTypes extends StObject
  @JSImport("@rails/actioncable", "MessageTypes")
  @js.native
  object MessageTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MessageTypes & String] = js.native
    
    @js.native
    sealed trait confirmation
      extends StObject
         with MessageTypes
    /* "confirm_subscription" */ val confirmation: typings.railsActioncable.mod.MessageTypes.confirmation & String = js.native
    
    @js.native
    sealed trait disconnect
      extends StObject
         with MessageTypes
    /* "disconnect" */ val disconnect: typings.railsActioncable.mod.MessageTypes.disconnect & String = js.native
    
    @js.native
    sealed trait ping
      extends StObject
         with MessageTypes
    /* "ping" */ val ping: typings.railsActioncable.mod.MessageTypes.ping & String = js.native
    
    @js.native
    sealed trait rejection
      extends StObject
         with MessageTypes
    /* "reject_subscription" */ val rejection: typings.railsActioncable.mod.MessageTypes.rejection & String = js.native
    
    @js.native
    sealed trait welcome
      extends StObject
         with MessageTypes
    /* "welcome" */ val welcome: typings.railsActioncable.mod.MessageTypes.welcome & String = js.native
  }
  
  @JSImport("@rails/actioncable", "Subscription")
  @js.native
  open class Subscription[C] protected () extends StObject {
    def this(consumer: C) = this()
    def this(consumer: C, params: js.Object) = this()
    def this(consumer: C, params: js.Object, mixin: Mixin) = this()
    def this(consumer: C, params: Unit, mixin: Mixin) = this()
    
    val consumer: C = js.native
    
    val identifier: String = js.native
    
    def perform(action: String): Boolean = js.native
    def perform(action: String, data: js.Object): Boolean = js.native
    
    def send(data: js.Object): Boolean = js.native
    
    def unsubscribe(): this.type = js.native
  }
  
  @JSImport("@rails/actioncable", "Subscriptions")
  @js.native
  open class Subscriptions[C] protected () extends StObject {
    def this(consumer: C) = this()
    
    /* private */ def add[T /* <: Subscription[Consumer] */](subscription: T): T = js.native
    
    /* private */ def confirmSubscription(identifier: String): Unit = js.native
    
    val consumer: C = js.native
    
    def create[M](channelName: String): Subscription[C] & Mixin & M = js.native
    def create[M](channelName: String, mixin: Mixin & M): Subscription[C] & Mixin & M = js.native
    def create[M](channelName: ChannelNameWithParams): Subscription[C] & Mixin & M = js.native
    def create[M](channelName: ChannelNameWithParams, mixin: Mixin & M): Subscription[C] & Mixin & M = js.native
    
    /* private */ def findAll(identifier: String): js.Array[Subscription[Consumer]] = js.native
    
    /* private */ def forget[T /* <: Subscription[Consumer] */](subscription: T): T = js.native
    
    /* private */ def notify(
      subscription: Subscription[Consumer],
      callbackName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): js.Array[Subscription[Consumer]] = js.native
    
    /* private */ def notifyAll(
      callbackName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): js.Array[Subscription[Consumer]] = js.native
    
    /* private */ def reject(identifier: String): js.Array[Subscription[Consumer]] = js.native
    
    /* private */ def reload(): js.Array[Subscription[Consumer]] = js.native
    
    /* private */ def remove[T /* <: Subscription[Consumer] */](subscription: T): T = js.native
    
    /* private */ def sendCommand(subscription: Subscription[Consumer], command: Any): Boolean = js.native
    
    /* private */ def subscribe(subscription: Subscription[Consumer]): Unit = js.native
    
    val subscriptions: js.Array[Subscription[C]] = js.native
  }
  
  object adapters {
    
    @JSImport("@rails/actioncable", "adapters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rails/actioncable", "adapters.WebSocket")
    @js.native
    def WebSocket: typings.std.WebSocket = js.native
    inline def WebSocket_=(x: WebSocket): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebSocket")(x.asInstanceOf[js.Any])
    
    @JSImport("@rails/actioncable", "adapters.logger")
    @js.native
    def logger: Console = js.native
    inline def logger_=(x: Console): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
  }
  
  inline def createConsumer(): Consumer = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsumer")().asInstanceOf[Consumer]
  inline def createConsumer(url: String): Consumer = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsumer")(url.asInstanceOf[js.Any]).asInstanceOf[Consumer]
  
  inline def createWebSocketURL(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebSocketURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getConfig(name: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(name.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  object logger {
    
    @JSImport("@rails/actioncable", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@rails/actioncable", "logger.enabled")
    @js.native
    def enabled: js.UndefOr[Boolean] = js.native
    inline def enabled_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
    
    inline def log(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  }
  
  trait ChannelNameWithParams
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var channel: String
  }
  object ChannelNameWithParams {
    
    inline def apply(channel: String): ChannelNameWithParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelNameWithParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelNameWithParams] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mixin
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var appear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val appearingOn: js.UndefOr[String | Null] = js.undefined
    
    var away: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var connected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disconnected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    val documentIsActive: js.UndefOr[Boolean] = js.undefined
    
    var initialized: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var install: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var received: js.UndefOr[js.Function1[/* data */ Any, Unit]] = js.undefined
    
    var rejected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var uninstall: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var update: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Mixin {
    
    inline def apply(): Mixin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mixin] (val x: Self) extends AnyVal {
      
      inline def setAppear(value: () => Unit): Self = StObject.set(x, "appear", js.Any.fromFunction0(value))
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setAppearingOn(value: String): Self = StObject.set(x, "appearingOn", value.asInstanceOf[js.Any])
      
      inline def setAppearingOnNull: Self = StObject.set(x, "appearingOn", null)
      
      inline def setAppearingOnUndefined: Self = StObject.set(x, "appearingOn", js.undefined)
      
      inline def setAway(value: () => Unit): Self = StObject.set(x, "away", js.Any.fromFunction0(value))
      
      inline def setAwayUndefined: Self = StObject.set(x, "away", js.undefined)
      
      inline def setConnected(value: () => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction0(value))
      
      inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
      
      inline def setDisconnected(value: () => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction0(value))
      
      inline def setDisconnectedUndefined: Self = StObject.set(x, "disconnected", js.undefined)
      
      inline def setDocumentIsActive(value: Boolean): Self = StObject.set(x, "documentIsActive", value.asInstanceOf[js.Any])
      
      inline def setDocumentIsActiveUndefined: Self = StObject.set(x, "documentIsActive", js.undefined)
      
      inline def setInitialized(value: () => Unit): Self = StObject.set(x, "initialized", js.Any.fromFunction0(value))
      
      inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
      
      inline def setInstall(value: () => Unit): Self = StObject.set(x, "install", js.Any.fromFunction0(value))
      
      inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
      
      inline def setReceived(value: /* data */ Any => Unit): Self = StObject.set(x, "received", js.Any.fromFunction1(value))
      
      inline def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
      
      inline def setRejected(value: () => Unit): Self = StObject.set(x, "rejected", js.Any.fromFunction0(value))
      
      inline def setRejectedUndefined: Self = StObject.set(x, "rejected", js.undefined)
      
      inline def setUninstall(value: () => Unit): Self = StObject.set(x, "uninstall", js.Any.fromFunction0(value))
      
      inline def setUninstallUndefined: Self = StObject.set(x, "uninstall", js.undefined)
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
}
