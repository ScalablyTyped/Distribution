package typings.railsActioncable

import typings.railsActioncable.anon.Close
import typings.railsActioncable.mod.Mixin
import typings.railsActioncable.railsActioncableStrings.Slashcable
import typings.railsActioncable.railsActioncableStrings.`actioncable-unsupported`
import typings.railsActioncable.railsActioncableStrings.`actioncable-v1-json`
import typings.std.Console
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ActionCable {
    
    @JSGlobal("ActionCable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ActionCable.Connection")
    @js.native
    open class Connection[C] protected ()
      extends typings.railsActioncable.mod.Connection[C] {
      def this(consumer: C) = this()
    }
    /* static members */
    object Connection {
      
      @JSGlobal("ActionCable.Connection.events")
      @js.native
      val events: Close = js.native
      
      @JSGlobal("ActionCable.Connection.reopenDelay")
      @js.native
      val reopenDelay: Double = js.native
    }
    
    @JSGlobal("ActionCable.ConnectionMonitor")
    @js.native
    open class ConnectionMonitor[C] protected ()
      extends typings.railsActioncable.mod.ConnectionMonitor[C] {
      def this(connection: C) = this()
    }
    /* static members */
    object ConnectionMonitor {
      
      @JSGlobal("ActionCable.ConnectionMonitor.reconnectionBackoffRate")
      @js.native
      val reconnectionBackoffRate: Double = js.native
      
      @JSGlobal("ActionCable.ConnectionMonitor.staleThreshold")
      @js.native
      val staleThreshold: Double = js.native
    }
    
    @JSGlobal("ActionCable.Consumer")
    @js.native
    open class Consumer protected ()
      extends typings.railsActioncable.mod.Consumer {
      def this(url: String) = this()
    }
    
    @JSGlobal("ActionCable.DisconnectReasons")
    @js.native
    object DisconnectReasons extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.railsActioncable.mod.DisconnectReasons & String] = js.native
      
      /* "invalid_request" */ val invalid_request: typings.railsActioncable.mod.DisconnectReasons.invalid_request & String = js.native
      
      /* "server_restart" */ val server_restart: typings.railsActioncable.mod.DisconnectReasons.server_restart & String = js.native
      
      /* "unauthorized" */ val unauthorized: typings.railsActioncable.mod.DisconnectReasons.unauthorized & String = js.native
    }
    
    object INTERNAL {
      
      @JSGlobal("ActionCable.INTERNAL")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ActionCable.INTERNAL.default_mount_path")
      @js.native
      def defaultMountPath: Slashcable = js.native
      
      inline def defaultMountPath_=(x: Slashcable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default_mount_path")(x.asInstanceOf[js.Any])
      
      @JSGlobal("ActionCable.INTERNAL.disconnect_reasons")
      @js.native
      def disconnectReasons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisconnectReasons */ Any = js.native
      
      inline def disconnectReasons_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DisconnectReasons */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disconnect_reasons")(x.asInstanceOf[js.Any])
      
      @JSGlobal("ActionCable.INTERNAL.message_types")
      @js.native
      def messageTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageTypes */ Any = js.native
      
      inline def messageTypes_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageTypes */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message_types")(x.asInstanceOf[js.Any])
      
      @JSGlobal("ActionCable.INTERNAL.protocols")
      @js.native
      def protocols: js.Tuple2[`actioncable-v1-json`, `actioncable-unsupported`] = js.native
      inline def protocols_=(x: js.Tuple2[`actioncable-v1-json`, `actioncable-unsupported`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("protocols")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("ActionCable.MessageTypes")
    @js.native
    object MessageTypes extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.railsActioncable.mod.MessageTypes & String] = js.native
      
      /* "confirm_subscription" */ val confirmation: typings.railsActioncable.mod.MessageTypes.confirmation & String = js.native
      
      /* "disconnect" */ val disconnect: typings.railsActioncable.mod.MessageTypes.disconnect & String = js.native
      
      /* "ping" */ val ping: typings.railsActioncable.mod.MessageTypes.ping & String = js.native
      
      /* "reject_subscription" */ val rejection: typings.railsActioncable.mod.MessageTypes.rejection & String = js.native
      
      /* "welcome" */ val welcome: typings.railsActioncable.mod.MessageTypes.welcome & String = js.native
    }
    
    @JSGlobal("ActionCable.Subscription")
    @js.native
    open class Subscription[C] protected ()
      extends typings.railsActioncable.mod.Subscription[C] {
      def this(consumer: C) = this()
      def this(consumer: C, params: js.Object) = this()
      def this(consumer: C, params: js.Object, mixin: Mixin) = this()
      def this(consumer: C, params: Unit, mixin: Mixin) = this()
    }
    
    @JSGlobal("ActionCable.Subscriptions")
    @js.native
    open class Subscriptions[C] protected ()
      extends typings.railsActioncable.mod.Subscriptions[C] {
      def this(consumer: C) = this()
    }
    
    object adapters {
      
      @JSGlobal("ActionCable.adapters")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ActionCable.adapters.WebSocket")
      @js.native
      def WebSocket: typings.std.WebSocket = js.native
      inline def WebSocket_=(x: WebSocket): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebSocket")(x.asInstanceOf[js.Any])
      
      @JSGlobal("ActionCable.adapters.logger")
      @js.native
      def logger: Console = js.native
      inline def logger_=(x: Console): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
    }
    
    inline def createConsumer(): typings.railsActioncable.mod.Consumer = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsumer")().asInstanceOf[typings.railsActioncable.mod.Consumer]
    inline def createConsumer(url: String): typings.railsActioncable.mod.Consumer = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsumer")(url.asInstanceOf[js.Any]).asInstanceOf[typings.railsActioncable.mod.Consumer]
    
    inline def createWebSocketURL(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebSocketURL")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getConfig(name: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(name.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
    
    object logger {
      
      @JSGlobal("ActionCable.logger")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("ActionCable.logger.enabled")
      @js.native
      def enabled: js.UndefOr[Boolean] = js.native
      inline def enabled_=(x: js.UndefOr[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
      
      inline def log(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    }
  }
}
