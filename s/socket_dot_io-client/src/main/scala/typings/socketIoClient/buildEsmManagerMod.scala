package typings.socketIoClient

import org.scalablytyped.runtime.StringDictionary
import typings.engineIoClient.anon.Threshold
import typings.engineIoClient.buildEsmSocketMod.SocketOptions
import typings.socketIoClient.anon.PartialManagerOptions
import typings.socketIoClient.anon.PartialPacketquerystringo
import typings.socketIoClient.anon.PartialSocketOptions
import typings.socketIoClient.buildEsmSocketMod.DisconnectDescription
import typings.socketIoClient.buildEsmSocketMod.Socket
import typings.socketIoClient.socketIoClientStrings.closed
import typings.socketIoClient.socketIoClientStrings.open
import typings.socketIoClient.socketIoClientStrings.opening
import typings.socketIoComponentEmitter.mod.DefaultEventsMap
import typings.socketIoComponentEmitter.mod.Emitter
import typings.socketIoComponentEmitter.mod.EventsMap
import typings.socketIoParser.mod.Packet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmManagerMod {
  
  @JSImport("socket.io-client/build/esm/manager", "Manager")
  @js.native
  open class Manager[ListenEvents /* <: EventsMap */, EmitEvents /* <: EventsMap */] ()
    extends Emitter[js.Object, js.Object, ManagerReservedEvents] {
    /**
      * `Manager` constructor.
      *
      * @param uri - engine instance or engine uri/opts
      * @param opts - options
      * @public
      */
    def this(opts: PartialManagerOptions) = this()
    def this(uri: String) = this()
    def this(uri: String, opts: PartialManagerOptions) = this()
    def this(uri: Unit, opts: PartialManagerOptions) = this()
    def this(uri: PartialManagerOptions, opts: PartialManagerOptions) = this()
    
    /**
      * @private
      */
    var _autoConnect: Boolean = js.native
    
    /**
      * Close the current socket.
      *
      * @private
      */
    def _close(): Unit = js.native
    
    /**
      * Called upon a socket close.
      *
      * @param socket
      * @private
      */
    def _destroy(socket: Socket[DefaultEventsMap, DefaultEventsMap]): Unit = js.native
    
    /**
      * Writes a packet.
      *
      * @param packet
      * @private
      */
    def _packet(packet: PartialPacketquerystringo): Unit = js.native
    
    /* private */ var _randomizationFactor: Any = js.native
    
    /**
      * @private
      */
    var _readyState: opening | open | closed = js.native
    
    /**
      * @private
      */
    var _reconnecting: Boolean = js.native
    
    /* private */ var _reconnection: Any = js.native
    
    /* private */ var _reconnectionAttempts: Any = js.native
    
    /* private */ var _reconnectionDelay: Any = js.native
    
    /* private */ var _reconnectionDelayMax: Any = js.native
    
    /* private */ var _timeout: Any = js.native
    
    /* private */ var backoff: Any = js.native
    
    /**
      * Clean up transport subscriptions and packet buffer.
      *
      * @private
      */
    /* private */ var cleanup: Any = js.native
    
    /**
      * Alias for open()
      *
      * @return self
      * @public
      */
    def connect(): this.type = js.native
    def connect(fn: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    
    /* private */ var decoder: Any = js.native
    
    /**
      * Alias for close()
      *
      * @private
      */
    /* private */ var disconnect: Any = js.native
    
    /* private */ var encoder: Any = js.native
    
    /**
      * The Engine.IO client instance
      *
      * @public
      */
    var engine: typings.engineIoClient.mod.Socket = js.native
    
    /**
      * Starts trying to reconnect if reconnection is enabled and we have not
      * started reconnecting yet
      *
      * @private
      */
    /* private */ var maybeReconnectOnOpen: Any = js.native
    
    /* private */ var nsps: Any = js.native
    
    /**
      * Called upon engine close.
      *
      * @private
      */
    /* private */ var onclose: Any = js.native
    
    /**
      * Called with data.
      *
      * @private
      */
    /* private */ var ondata: Any = js.native
    
    /**
      * Called when parser fully decodes a packet.
      *
      * @private
      */
    /* private */ var ondecoded: Any = js.native
    
    /**
      * Called upon socket error.
      *
      * @private
      */
    /* private */ var onerror: Any = js.native
    
    /**
      * Called upon transport open.
      *
      * @private
      */
    /* private */ var onopen: Any = js.native
    
    /**
      * Called upon a ping.
      *
      * @private
      */
    /* private */ var onping: Any = js.native
    
    /**
      * Called upon successful reconnect.
      *
      * @private
      */
    /* private */ var onreconnect: Any = js.native
    
    /**
      * Sets the current transport `socket`.
      *
      * @param {Function} fn - optional, callback
      * @return self
      * @public
      */
    def open(): this.type = js.native
    def open(fn: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): this.type = js.native
    
    var opts: PartialManagerOptions = js.native
    
    def randomizationFactor(): this.type | Double = js.native
    /**
      * Sets the randomization factor
      *
      * @param v - the randomization factor
      * @return self or value
      * @public
      */
    def randomizationFactor(v: Double): this.type = js.native
    @JSName("randomizationFactor")
    def randomizationFactor_Double(): Double = js.native
    @JSName("randomizationFactor")
    def randomizationFactor_Union(v: Double): this.type | Double = js.native
    
    /**
      * Attempt a reconnection.
      *
      * @private
      */
    /* private */ var reconnect: Any = js.native
    
    def reconnection(): this.type | Boolean = js.native
    /**
      * Sets the `reconnection` config.
      *
      * @param {Boolean} v - true/false if it should automatically reconnect
      * @return {Manager} self or value
      * @public
      */
    def reconnection(v: Boolean): this.type = js.native
    
    def reconnectionAttempts(): this.type | Double = js.native
    /**
      * Sets the reconnection attempts config.
      *
      * @param {Number} v - max reconnection attempts before giving up
      * @return {Manager} self or value
      * @public
      */
    def reconnectionAttempts(v: Double): this.type = js.native
    @JSName("reconnectionAttempts")
    def reconnectionAttempts_Double(): Double = js.native
    @JSName("reconnectionAttempts")
    def reconnectionAttempts_Union(v: Double): this.type | Double = js.native
    
    def reconnectionDelay(): this.type | Double = js.native
    /**
      * Sets the delay between reconnections.
      *
      * @param {Number} v - delay
      * @return {Manager} self or value
      * @public
      */
    def reconnectionDelay(v: Double): this.type = js.native
    
    def reconnectionDelayMax(): this.type | Double = js.native
    /**
      * Sets the maximum delay between reconnections.
      *
      * @param v - delay
      * @return self or value
      * @public
      */
    def reconnectionDelayMax(v: Double): this.type = js.native
    @JSName("reconnectionDelayMax")
    def reconnectionDelayMax_Double(): Double = js.native
    @JSName("reconnectionDelayMax")
    def reconnectionDelayMax_Union(v: Double): this.type | Double = js.native
    
    @JSName("reconnectionDelay")
    def reconnectionDelay_Double(): Double = js.native
    @JSName("reconnectionDelay")
    def reconnectionDelay_Union(v: Double): this.type | Double = js.native
    
    @JSName("reconnection")
    def reconnection_Boolean(): Boolean = js.native
    @JSName("reconnection")
    def reconnection_Union(v: Boolean): this.type | Boolean = js.native
    
    /* private */ var setTimeoutFn: Any = js.native
    
    /* private */ var skipReconnect: Any = js.native
    
    /**
      * Creates a new socket for the given `nsp`.
      *
      * @return {Socket}
      * @public
      */
    def socket(nsp: String): Socket[DefaultEventsMap, DefaultEventsMap] = js.native
    def socket(nsp: String, opts: PartialSocketOptions): Socket[DefaultEventsMap, DefaultEventsMap] = js.native
    
    /* private */ var subs: Any = js.native
    
    def timeout(): Double | Boolean = js.native
    def timeout(v: Boolean): this.type = js.native
    /**
      * Sets the connection timeout. `false` to disable
      *
      * @param v - connection timeout
      * @return self or value
      * @public
      */
    def timeout(v: Double): this.type = js.native
    @JSName("timeout")
    def timeout_Union(v: Boolean): this.type | Double | Boolean = js.native
    @JSName("timeout")
    def timeout_Union(v: Double): this.type | Double | Boolean = js.native
    
    /* private */ val uri: Any = js.native
  }
  
  trait ManagerOptions
    extends StObject
       with SocketOptions {
    
    /**
      * Should we automatically connect?
      * @default true
      */
    var autoConnect: Boolean
    
    /**
      * Should we force a new Manager for this connection?
      * @default false
      */
    var forceNew: Boolean
    
    /**
      * Should we multiplex our connection (reuse existing Manager) ?
      * @default true
      */
    var multiplex: Boolean
    
    /**
      * the parser to use. Defaults to an instance of the Parser that ships with socket.io.
      */
    var parser: Any
    
    /**
      * Used in the exponential backoff jitter when reconnecting
      * @default 0.5
      */
    var randomizationFactor: Double
    
    /**
      * Should we allow reconnections?
      * @default true
      */
    var reconnection: Boolean
    
    /**
      * How many reconnection attempts should we try?
      * @default Infinity
      */
    var reconnectionAttempts: Double
    
    /**
      * The time delay in milliseconds between reconnection attempts
      * @default 1000
      */
    var reconnectionDelay: Double
    
    /**
      * The max time delay in milliseconds between reconnection attempts
      * @default 5000
      */
    var reconnectionDelayMax: Double
    
    /**
      * The timeout in milliseconds for our connection attempt
      * @default 20000
      */
    var timeout: Double
  }
  object ManagerOptions {
    
    inline def apply(
      addTrailingSlash: Boolean,
      agent: String | Boolean,
      autoConnect: Boolean,
      autoUnref: Boolean,
      ca: String | js.Array[String],
      cert: String,
      ciphers: String,
      closeOnBeforeunload: Boolean,
      forceBase64: Boolean,
      forceNew: Boolean,
      host: String,
      hostname: String,
      key: String,
      multiplex: Boolean,
      onlyBinaryUpgrades: Boolean,
      parser: Any,
      passphrase: String,
      path: String,
      perMessageDeflate: Threshold,
      pfx: String,
      port: String | Double,
      protocols: String | js.Array[String],
      query: StringDictionary[Any],
      randomizationFactor: Double,
      reconnection: Boolean,
      reconnectionAttempts: Double,
      reconnectionDelay: Double,
      reconnectionDelayMax: Double,
      rejectUnauthorized: Boolean,
      rememberUpgrade: Boolean,
      requestTimeout: Double,
      secure: Boolean,
      timeout: Double,
      timestampParam: String,
      timestampRequests: Boolean,
      transportOptions: js.Object,
      transports: js.Array[String],
      upgrade: Boolean,
      useNativeTimers: Boolean,
      withCredentials: Boolean
    ): ManagerOptions = {
      val __obj = js.Dynamic.literal(addTrailingSlash = addTrailingSlash.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], autoConnect = autoConnect.asInstanceOf[js.Any], autoUnref = autoUnref.asInstanceOf[js.Any], ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], ciphers = ciphers.asInstanceOf[js.Any], closeOnBeforeunload = closeOnBeforeunload.asInstanceOf[js.Any], forceBase64 = forceBase64.asInstanceOf[js.Any], forceNew = forceNew.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], multiplex = multiplex.asInstanceOf[js.Any], onlyBinaryUpgrades = onlyBinaryUpgrades.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], perMessageDeflate = perMessageDeflate.asInstanceOf[js.Any], pfx = pfx.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], randomizationFactor = randomizationFactor.asInstanceOf[js.Any], reconnection = reconnection.asInstanceOf[js.Any], reconnectionAttempts = reconnectionAttempts.asInstanceOf[js.Any], reconnectionDelay = reconnectionDelay.asInstanceOf[js.Any], reconnectionDelayMax = reconnectionDelayMax.asInstanceOf[js.Any], rejectUnauthorized = rejectUnauthorized.asInstanceOf[js.Any], rememberUpgrade = rememberUpgrade.asInstanceOf[js.Any], requestTimeout = requestTimeout.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], timestampParam = timestampParam.asInstanceOf[js.Any], timestampRequests = timestampRequests.asInstanceOf[js.Any], transportOptions = transportOptions.asInstanceOf[js.Any], transports = transports.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any], useNativeTimers = useNativeTimers.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
      
      inline def setForceNew(value: Boolean): Self = StObject.set(x, "forceNew", value.asInstanceOf[js.Any])
      
      inline def setMultiplex(value: Boolean): Self = StObject.set(x, "multiplex", value.asInstanceOf[js.Any])
      
      inline def setParser(value: Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setRandomizationFactor(value: Double): Self = StObject.set(x, "randomizationFactor", value.asInstanceOf[js.Any])
      
      inline def setReconnection(value: Boolean): Self = StObject.set(x, "reconnection", value.asInstanceOf[js.Any])
      
      inline def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
      
      inline def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
      
      inline def setReconnectionDelayMax(value: Double): Self = StObject.set(x, "reconnectionDelayMax", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ManagerReservedEvents extends StObject {
    
    def close(reason: String): Unit = js.native
    def close(reason: String, description: DisconnectDescription): Unit = js.native
    
    def error(err: js.Error): Unit = js.native
    
    def open(): Unit = js.native
    
    def packet(packet: Packet): Unit = js.native
    
    def ping(): Unit = js.native
    
    def reconnect(attempt: Double): Unit = js.native
    
    def reconnect_attempt(attempt: Double): Unit = js.native
    
    def reconnect_error(err: js.Error): Unit = js.native
    
    def reconnect_failed(): Unit = js.native
  }
}
