package typings.pusherJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.pusherJs.anon.Activity
import typings.pusherJs.anon.Authorize
import typings.pusherJs.anon.Backoff
import typings.pusherJs.anon.Connected
import typings.pusherJs.pusherJsStrings.ajax
import typings.pusherJs.pusherJsStrings.jsonp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pusher-js", JSImport.Namespace)
  @js.native
  class ^ protected () extends Pusher {
    def this(apiKey: String) = this()
    def this(apiKey: String, config: Config) = this()
  }
  @JSImport("pusher-js", JSImport.Namespace)
  @js.native
  val ^ : PusherStatic = js.native
  
  @js.native
  trait AuthConfig extends StObject {
    
    var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var params: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object AuthConfig {
    
    @scala.inline
    def apply(): AuthConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthConfig]
    }
    
    @scala.inline
    implicit class AuthConfigMutableBuilder[Self <: AuthConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  @js.native
  trait AuthInfo extends StObject {
    
    var auth: String = js.native
    
    var channel_data: js.UndefOr[String] = js.native
  }
  object AuthInfo {
    
    @scala.inline
    def apply(auth: String): AuthInfo = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthInfo]
    }
    
    @scala.inline
    implicit class AuthInfoMutableBuilder[Self <: AuthInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel_data(value: String): Self = StObject.set(x, "channel_data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannel_dataUndefined: Self = StObject.set(x, "channel_data", js.undefined)
    }
  }
  
  type Authorizer = js.Function2[/* channel */ Channel, /* options */ Config, Authorize]
  
  @js.native
  trait Channel extends EventsDispatcher {
    
    /**
      * Authenticates the connection as a member of the channel.
      */
    def authorize(socketId: String, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
    
    var name: String = js.native
    
    var pusher: Pusher = js.native
    
    var subscribed: Boolean = js.native
    
    /** Triggers an event */
    def trigger(eventName: String): Boolean = js.native
    def trigger(eventName: String, data: js.Any): Boolean = js.native
  }
  
  @js.native
  trait Config extends StObject {
    
    /**
      * After this time (in miliseconds) without any messages received from the server,
      * a ping message will be sent to check if the connection is still working.
      * Default value is is supplied by the server, low values will result in unnecessary traffic.
      */
    var activityTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Allows passing additional data to authorizers. Supports query string params and headers (AJAX only).
      * For example, following will pass foo=bar via the query string and baz: boo via headers:
      */
    var auth: js.UndefOr[AuthConfig] = js.native
    
    /**
      * Endpoint on your server that will return the authentication signature needed for private channels.
      */
    var authEndpoint: js.UndefOr[String] = js.native
    
    /**
      * Defines how the authentication endpoint, defined using authEndpoint, will be called.
      * There are two options available: ajax and jsonp.
      */
    var authTransport: js.UndefOr[ajax | jsonp] = js.native
    
    /**
      * If you need custom authorization behavior you can provide your own authorizer function as follows:
      */
    var authorizer: js.UndefOr[Authorizer] = js.native
    
    /**
      * Allows connecting to a different datacenter by setting up correct hostnames and ports for the connection.
      */
    var cluster: js.UndefOr[String] = js.native
    
    /**
      * Disables stats collection, so that connection metrics are not submitted to Pusher’s servers. These stats
      * are used for internal monitoring only and they do not affect the account stats.
      */
    var disableStats: js.UndefOr[Boolean] = js.native
    
    /**
      * Specified which transports must not be used by Pusher to establish a connection.
      * This settings overwrites transports whitelisted via the enabledTransports options.
      * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
      * Additional transports may be added in the future and without adding them to this list, they will be enabled.
      */
    var disabledTransports: js.UndefOr[js.Array[Transport]] = js.native
    
    /**
      * Specifies which transports should be used by Pusher to establish a connection.
      * Useful for applications running in controlled, well-behaving environments.
      * Available transports: ws, wss, xhr_streaming, xhr_polling, sockjs.
      * Additional transports may be added in the future and without adding them to this list, they will be disabled.
      */
    var enabledTransports: js.UndefOr[js.Array[Transport]] = js.native
    
    /**
      * Forces the connection to use encrypted transports.
      * @deprecated
      */
    var encrypted: js.UndefOr[Boolean] = js.native
    
    /**
      * Forces the connection to use encrypted transports.
      */
    var forceTLS: js.UndefOr[Boolean] = js.native
    
    var httpHost: js.UndefOr[String] = js.native
    
    var httpPort: js.UndefOr[Double] = js.native
    
    var httpsPort: js.UndefOr[Double] = js.native
    
    /**
      * Ignores null origin checks for HTTP fallbacks. Use with care, it should be disabled only if necessary (i.e. PhoneGap).
      */
    var ignoreNullOrigin: js.UndefOr[Boolean] = js.native
    
    /**
      * Time before the connection is terminated after sending a ping message.
      * Default is 30000 (30s). Low values will cause false disconnections, if latency is high.
      */
    var pongTimeout: js.UndefOr[Double] = js.native
    
    var wsHost: js.UndefOr[String] = js.native
    
    var wsPath: js.UndefOr[String] = js.native
    
    var wsPort: js.UndefOr[Double] = js.native
    
    var wssPort: js.UndefOr[Double] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityTimeout(value: Double): Self = StObject.set(x, "activityTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityTimeoutUndefined: Self = StObject.set(x, "activityTimeout", js.undefined)
      
      @scala.inline
      def setAuth(value: AuthConfig): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthEndpoint(value: String): Self = StObject.set(x, "authEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthEndpointUndefined: Self = StObject.set(x, "authEndpoint", js.undefined)
      
      @scala.inline
      def setAuthTransport(value: ajax | jsonp): Self = StObject.set(x, "authTransport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTransportUndefined: Self = StObject.set(x, "authTransport", js.undefined)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setAuthorizer(value: (/* channel */ Channel, /* options */ Config) => Authorize): Self = StObject.set(x, "authorizer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAuthorizerUndefined: Self = StObject.set(x, "authorizer", js.undefined)
      
      @scala.inline
      def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
      
      @scala.inline
      def setDisableStats(value: Boolean): Self = StObject.set(x, "disableStats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStatsUndefined: Self = StObject.set(x, "disableStats", js.undefined)
      
      @scala.inline
      def setDisabledTransports(value: js.Array[Transport]): Self = StObject.set(x, "disabledTransports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledTransportsUndefined: Self = StObject.set(x, "disabledTransports", js.undefined)
      
      @scala.inline
      def setDisabledTransportsVarargs(value: Transport*): Self = StObject.set(x, "disabledTransports", js.Array(value :_*))
      
      @scala.inline
      def setEnabledTransports(value: js.Array[Transport]): Self = StObject.set(x, "enabledTransports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledTransportsUndefined: Self = StObject.set(x, "enabledTransports", js.undefined)
      
      @scala.inline
      def setEnabledTransportsVarargs(value: Transport*): Self = StObject.set(x, "enabledTransports", js.Array(value :_*))
      
      @scala.inline
      def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
      
      @scala.inline
      def setForceTLS(value: Boolean): Self = StObject.set(x, "forceTLS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceTLSUndefined: Self = StObject.set(x, "forceTLS", js.undefined)
      
      @scala.inline
      def setHttpHost(value: String): Self = StObject.set(x, "httpHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpHostUndefined: Self = StObject.set(x, "httpHost", js.undefined)
      
      @scala.inline
      def setHttpPort(value: Double): Self = StObject.set(x, "httpPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpPortUndefined: Self = StObject.set(x, "httpPort", js.undefined)
      
      @scala.inline
      def setHttpsPort(value: Double): Self = StObject.set(x, "httpsPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsPortUndefined: Self = StObject.set(x, "httpsPort", js.undefined)
      
      @scala.inline
      def setIgnoreNullOrigin(value: Boolean): Self = StObject.set(x, "ignoreNullOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNullOriginUndefined: Self = StObject.set(x, "ignoreNullOrigin", js.undefined)
      
      @scala.inline
      def setPongTimeout(value: Double): Self = StObject.set(x, "pongTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPongTimeoutUndefined: Self = StObject.set(x, "pongTimeout", js.undefined)
      
      @scala.inline
      def setWsHost(value: String): Self = StObject.set(x, "wsHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsHostUndefined: Self = StObject.set(x, "wsHost", js.undefined)
      
      @scala.inline
      def setWsPath(value: String): Self = StObject.set(x, "wsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsPathUndefined: Self = StObject.set(x, "wsPath", js.undefined)
      
      @scala.inline
      def setWsPort(value: Double): Self = StObject.set(x, "wsPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsPortUndefined: Self = StObject.set(x, "wsPort", js.undefined)
      
      @scala.inline
      def setWssPort(value: Double): Self = StObject.set(x, "wssPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWssPortUndefined: Self = StObject.set(x, "wssPort", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionManager extends EventsDispatcher {
    
    /**
      * Establishes a connection to Pusher.
      *
      * Does nothing when connection is already established. See top-level doc
      * to find events emitted on connection attempts.
      */
    def connect(): Unit = js.native
    
    var connection: js.Any = js.native
    
    // TODO: Type this
    var connectionCallbacks: Activity = js.native
    
    /** Closes the connection. */
    def disconnect(): Unit = js.native
    
    // TODO: Type this
    var encrypted: Boolean = js.native
    
    var errorCallbacks: Backoff = js.native
    
    var handshakeCallbacks: Connected = js.native
    
    def isEncrypted(): Boolean = js.native
    
    var key: String = js.native
    
    var options: js.Any = js.native
    
    /**
      * Sends raw data.
      */
    def send(data: String): Boolean = js.native
    
    /**
      * Sends an event.
      */
    def send_event(name: String, data: String, channel: String): Boolean = js.native
    
    var socket_id: String = js.native
    
    // TODO: Timeline.js
    var state: String = js.native
    
    var timeline: js.Any = js.native
  }
  
  type EventCallback = js.Function2[/* context */ js.Any, /* data */ js.Any, Unit]
  
  @js.native
  trait EventsDispatcher extends StObject {
    
    def bind(eventName: String, callback: EventCallback): this.type = js.native
    def bind(eventName: String, callback: EventCallback, context: js.Any): this.type = js.native
    
    def bind_global(callback: EventCallback): this.type = js.native
    
    def emit(eventName: String): this.type = js.native
    def emit(eventName: String, data: js.Any): this.type = js.native
    
    def unbind(): this.type = js.native
    def unbind(eventName: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def unbind(eventName: js.UndefOr[scala.Nothing], callback: Null, context: js.Any): this.type = js.native
    def unbind(eventName: js.UndefOr[scala.Nothing], callback: EventCallback): this.type = js.native
    def unbind(eventName: js.UndefOr[scala.Nothing], callback: EventCallback, context: js.Any): this.type = js.native
    def unbind(eventName: String): this.type = js.native
    def unbind(eventName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def unbind(eventName: String, callback: Null, context: js.Any): this.type = js.native
    def unbind(eventName: String, callback: EventCallback): this.type = js.native
    def unbind(eventName: String, callback: EventCallback, context: js.Any): this.type = js.native
    def unbind(eventName: Null, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
    def unbind(eventName: Null, callback: Null, context: js.Any): this.type = js.native
    def unbind(eventName: Null, callback: EventCallback): this.type = js.native
    def unbind(eventName: Null, callback: EventCallback, context: js.Any): this.type = js.native
    
    def unbind_all(): this.type = js.native
    
    def unbind_global(): this.type = js.native
    def unbind_global(callback: EventCallback): this.type = js.native
  }
  
  @js.native
  trait Member[T] extends StObject {
    
    var id: String = js.native
    
    var info: T = js.native
  }
  object Member {
    
    @scala.inline
    def apply[T](id: String, info: T): Member[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Member[T]]
    }
    
    @scala.inline
    implicit class MemberMutableBuilder[Self <: Member[_], T] (val x: Self with Member[T]) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: T): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Members[T] extends StObject {
    
    var count: Double = js.native
    
    /**
      * Calls back for each member in unspecified order.
      */
    def each(callback: js.Function1[/* member */ Member[T], Unit]): Unit = js.native
    
    /**
      * Returns member's info for given id.
      *
      * Resulting object containts two fields - id and info.
      */
    def get(id: String): Null | T = js.native
    
    var me: Member[T] = js.native
    
    var members: StringDictionary[Member[T]] = js.native
    
    var myID: String = js.native
  }
  object Members {
    
    @scala.inline
    def apply[T](
      count: Double,
      each: js.Function1[/* member */ Member[T], Unit] => Unit,
      get: String => Null | T,
      me: Member[T],
      members: StringDictionary[Member[T]],
      myID: String
    ): Members[T] = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], each = js.Any.fromFunction1(each), get = js.Any.fromFunction1(get), me = me.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], myID = myID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Members[T]]
    }
    
    @scala.inline
    implicit class MembersMutableBuilder[Self <: Members[_], T] (val x: Self with Members[T]) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEach(value: js.Function1[/* member */ Member[T], Unit] => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => Null | T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMe(value: Member[T]): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers(value: StringDictionary[Member[T]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMyID(value: String): Self = StObject.set(x, "myID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PresenceChannel[T] extends Channel {
    
    var members: Members[T] = js.native
  }
  
  @js.native
  trait Pusher extends EventsDispatcher {
    
    def allChannels(): js.Array[Channel] = js.native
    
    def channel(name: String): Channel = js.native
    
    // TODO: add GlobalConfig typings
    var channels: js.Any = js.native
    
    var config: Config = js.native
    
    def connect(): Unit = js.native
    
    // TODO: Type this
    var connection: ConnectionManager = js.native
    
    def disconnect(): Unit = js.native
    
    // TODO: Type this
    var global_emitter: EventsDispatcher = js.native
    
    def isEncrypted(): Boolean = js.native
    
    var key: String = js.native
    
    var sessionID: Double = js.native
    
    def subscribe(name: String): Channel = js.native
    
    def subscribeAll(): Unit = js.native
    
    var timeline: js.Any = js.native
    
    def unsubscribe(name: String): Unit = js.native
  }
  
  @js.native
  trait PusherStatic
    extends Instantiable1[/* apiKey */ String, Pusher]
       with Instantiable2[/* apiKey */ String, /* config */ Config, Pusher] {
    
    var instances: js.Array[Pusher] = js.native
    
    var isReady: Boolean = js.native
    
    def log(msg: String): Unit = js.native
    
    var logToConsole: Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pusherJs.pusherJsStrings.ws
    - typings.pusherJs.pusherJsStrings.wss
    - typings.pusherJs.pusherJsStrings.xhr_streaming
    - typings.pusherJs.pusherJsStrings.xhr_polling
    - typings.pusherJs.pusherJsStrings.sockjs
  */
  trait Transport extends StObject
  object Transport {
    
    @scala.inline
    def sockjs: typings.pusherJs.pusherJsStrings.sockjs = "sockjs".asInstanceOf[typings.pusherJs.pusherJsStrings.sockjs]
    
    @scala.inline
    def ws: typings.pusherJs.pusherJsStrings.ws = "ws".asInstanceOf[typings.pusherJs.pusherJsStrings.ws]
    
    @scala.inline
    def wss: typings.pusherJs.pusherJsStrings.wss = "wss".asInstanceOf[typings.pusherJs.pusherJsStrings.wss]
    
    @scala.inline
    def xhr_polling: typings.pusherJs.pusherJsStrings.xhr_polling = "xhr_polling".asInstanceOf[typings.pusherJs.pusherJsStrings.xhr_polling]
    
    @scala.inline
    def xhr_streaming: typings.pusherJs.pusherJsStrings.xhr_streaming = "xhr_streaming".asInstanceOf[typings.pusherJs.pusherJsStrings.xhr_streaming]
  }
  
  type _To = PusherStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PusherStatic = ^
}
