package typings.socketIoClient

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.socketIoClient.socketIoClientStrings.arraybuffer
import typings.socketIoClient.socketIoClientStrings.blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SocketIOClient {
  
  /**
    * Options we can pass to the socket when connecting
    */
  @js.native
  trait ConnectOpts extends StObject {
    
    /**
      * `http.Agent` to use, defaults to `false` (NodeJS only)
      */
    var agent: js.UndefOr[String | Boolean] = js.native
    
    /**
      * Should we automically connect?
      * @default true
      */
    var autoConnect: js.UndefOr[Boolean] = js.native
    
    /**
      * (SSL) An authority certificate or array of authority certificates to
      * check the remote host against.. Can be used in Node.js client
      * environment to manually specify certificate information.
      */
    var ca: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * (SSL) Public x509 certificate to use. Can be used in Node.js client
      * environment to manually specify certificate information.
      */
    var cert: js.UndefOr[String] = js.native
    
    /**
      * (SSL) A string describing the ciphers to use or exclude. Consult the
      * [cipher format list]
      * (http://www.openssl.org/docs/apps/ciphers.html#CIPHER_LIST_FORMAT) for
      * details on the format.. Can be used in Node.js client environment to
      * manually specify certificate information.
      */
    var ciphers: js.UndefOr[String] = js.native
    
    /**
      * Enables XDomainRequest for IE8 to avoid loading bar flashing with
      * click sound. default to `false` because XDomainRequest has a flaw
      * of not sending cookie.
      * @default false
      */
    var enablesXDR: js.UndefOr[Boolean] = js.native
    
    /**
      * Forces base 64 encoding for polling transport even when XHR2
      * responseType is available and WebSocket even if the used standard
      * supports binary.
      */
    var forceBase64: js.UndefOr[Boolean] = js.native
    
    /**
      * Forces JSONP for polling transport.
      */
    var forceJSONP: js.UndefOr[Boolean] = js.native
    
    /**
      * Should we force a new Manager for this connection?
      * @default false
      */
    var forceNew: js.UndefOr[Boolean] = js.native
    
    /**
      * The host that we're connecting to. Set from the URI passed when connecting
      */
    var host: js.UndefOr[String] = js.native
    
    /**
      * The hostname for our connection. Set from the URI passed when connecting
      */
    var hostname: js.UndefOr[String] = js.native
    
    /**
      * Determines whether to use JSONP when necessary for polling. If
      * disabled (by settings to false) an error will be emitted (saying
      * "No transports available") if no other transports are available.
      * If another transport is available for opening a connection (e.g.
      * WebSocket) that transport will be used instead.
      * @default true
      */
    var jsonp: js.UndefOr[Boolean] = js.native
    
    /**
      * (SSL) Private key to use for SSL. Can be used in Node.js client
      * environment to manually specify certificate information.
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * Should we multiplex our connection (reuse existing Manager) ?
      * @default true
      */
    var multiplex: js.UndefOr[Boolean] = js.native
    
    /**
      * Are we only interested in transports that support binary?
      */
    var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.native
    
    /**
      * (SSL) A string or passphrase for the private key or pfx. Can be
      * used in Node.js client environment to manually specify certificate
      * information.
      */
    var passphrase: js.UndefOr[String] = js.native
    
    /**
      * The path to get our client file from, in the case of the server
      * serving it
      * @default '/socket.io'
      */
    var path: js.UndefOr[String] = js.native
    
    /**
      * (SSL) Certificate, Private key and CA certificates to use for SSL.
      * Can be used in Node.js client environment to manually specify
      * certificate information.
      */
    var pfx: js.UndefOr[String] = js.native
    
    /**
      * The port the policy server listens on
      * @default 843
      */
    var policyPost: js.UndefOr[Double] = js.native
    
    /**
      * The port for our connection. Set from the URI passed when connecting
      */
    var port: js.UndefOr[String] = js.native
    
    /**
      * Any query parameters in our uri. Set from the URI passed when connecting
      */
    var query: js.UndefOr[js.Object] = js.native
    
    /**
      * Used in the exponential backoff jitter when reconnecting
      * @default 0.5
      */
    var randomizationFactor: js.UndefOr[Double] = js.native
    
    /**
      * Should we allow reconnections?
      * @default true
      */
    var reconnection: js.UndefOr[Boolean] = js.native
    
    /**
      * How many reconnection attempts should we try?
      * @default Infinity
      */
    var reconnectionAttempts: js.UndefOr[Double] = js.native
    
    /**
      * The time delay in milliseconds between reconnection attempts
      * @default 1000
      */
    var reconnectionDelay: js.UndefOr[Double] = js.native
    
    /**
      * The max time delay in milliseconds between reconnection attempts
      * @default 5000
      */
    var reconnectionDelayMax: js.UndefOr[Double] = js.native
    
    /**
      * (SSL) If true, the server certificate is verified against the list of
      * supplied CAs. An 'error' event is emitted if verification fails.
      * Verification happens at the connection level, before the HTTP request
      * is sent. Can be used in Node.js client environment to manually specify
      * certificate information.
      */
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    /**
      * If true and if the previous websocket connection to the server succeeded,
      * the connection attempt will bypass the normal upgrade process and will
      * initially try websocket. A connection attempt following a transport error
      * will use the normal upgrade process. It is recommended you turn this on
      * only when using SSL/TLS connections, or if you know that your network does
      * not block websockets.
      * @default false
      */
    var rememberUpgrade: js.UndefOr[Boolean] = js.native
    
    /**
      * If this is a secure connection. Set from the URI passed when connecting
      */
    var secure: js.UndefOr[Boolean] = js.native
    
    /**
      * The timeout in milliseconds for our connection attempt
      * @default 20000
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * The param name to use as our timestamp key
      * @default 't'
      */
    var timestampParam: js.UndefOr[String] = js.native
    
    /**
      * Whether to add the timestamp with each transport request. Note: this
      * is ignored if the browser is IE or Android, in which case requests
      * are always stamped
      * @default false
      */
    var timestampRequests: js.UndefOr[Boolean] = js.native
    
    /**
      * Transport options for Node.js client (headers etc)
      */
    var transportOptions: js.UndefOr[js.Object] = js.native
    
    /**
      * A list of transports to try (in order). Engine.io always attempts to
      * connect directly with the first one, provided the feature detection test
      * for it passes.
      * @default ['polling','websocket']
      */
    var transports: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Whether the client should try to upgrade the transport from
      * long-polling to something better.
      * @default true
      */
    var upgrade: js.UndefOr[Boolean] = js.native
  }
  object ConnectOpts {
    
    @scala.inline
    def apply(): ConnectOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOpts]
    }
    
    @scala.inline
    implicit class ConnectOptsMutableBuilder[Self <: ConnectOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: String | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
      
      @scala.inline
      def setCa(value: String | js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setEnablesXDR(value: Boolean): Self = StObject.set(x, "enablesXDR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablesXDRUndefined: Self = StObject.set(x, "enablesXDR", js.undefined)
      
      @scala.inline
      def setForceBase64(value: Boolean): Self = StObject.set(x, "forceBase64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceBase64Undefined: Self = StObject.set(x, "forceBase64", js.undefined)
      
      @scala.inline
      def setForceJSONP(value: Boolean): Self = StObject.set(x, "forceJSONP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceJSONPUndefined: Self = StObject.set(x, "forceJSONP", js.undefined)
      
      @scala.inline
      def setForceNew(value: Boolean): Self = StObject.set(x, "forceNew", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceNewUndefined: Self = StObject.set(x, "forceNew", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMultiplex(value: Boolean): Self = StObject.set(x, "multiplex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplexUndefined: Self = StObject.set(x, "multiplex", js.undefined)
      
      @scala.inline
      def setOnlyBinaryUpgrades(value: Boolean): Self = StObject.set(x, "onlyBinaryUpgrades", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyBinaryUpgradesUndefined: Self = StObject.set(x, "onlyBinaryUpgrades", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPfx(value: String): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPolicyPost(value: Double): Self = StObject.set(x, "policyPost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyPostUndefined: Self = StObject.set(x, "policyPost", js.undefined)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRandomizationFactor(value: Double): Self = StObject.set(x, "randomizationFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomizationFactorUndefined: Self = StObject.set(x, "randomizationFactor", js.undefined)
      
      @scala.inline
      def setReconnection(value: Boolean): Self = StObject.set(x, "reconnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectionAttemptsUndefined: Self = StObject.set(x, "reconnectionAttempts", js.undefined)
      
      @scala.inline
      def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectionDelayMax(value: Double): Self = StObject.set(x, "reconnectionDelayMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectionDelayMaxUndefined: Self = StObject.set(x, "reconnectionDelayMax", js.undefined)
      
      @scala.inline
      def setReconnectionDelayUndefined: Self = StObject.set(x, "reconnectionDelay", js.undefined)
      
      @scala.inline
      def setReconnectionUndefined: Self = StObject.set(x, "reconnection", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setRememberUpgrade(value: Boolean): Self = StObject.set(x, "rememberUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRememberUpgradeUndefined: Self = StObject.set(x, "rememberUpgrade", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTimestampParam(value: String): Self = StObject.set(x, "timestampParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampParamUndefined: Self = StObject.set(x, "timestampParam", js.undefined)
      
      @scala.inline
      def setTimestampRequests(value: Boolean): Self = StObject.set(x, "timestampRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampRequestsUndefined: Self = StObject.set(x, "timestampRequests", js.undefined)
      
      @scala.inline
      def setTransportOptions(value: js.Object): Self = StObject.set(x, "transportOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportOptionsUndefined: Self = StObject.set(x, "transportOptions", js.undefined)
      
      @scala.inline
      def setTransports(value: js.Array[String]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      @scala.inline
      def setTransportsVarargs(value: String*): Self = StObject.set(x, "transports", js.Array(value :_*))
      
      @scala.inline
      def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
    }
  }
  
  /**
    * The base emiter class, used by Socket and Manager
    */
  @js.native
  trait Emitter extends StObject {
    
    /**
      * @see on( event, fn )
      */
    def addEventListener(event: String, fn: js.Function): Emitter = js.native
    
    /**
      * Emits 'event' with the given args
      * @param event The event that we want to emit
      * @param args Optional arguments to emit with the event
      * @return Emitter
      */
    def emit(event: String, args: js.Any*): Emitter = js.native
    
    /**
      * Returns if we have listeners for a particular event
      * @param event The event that we want to check if we've listeners for
      * @return True if we have listeners for this event, false otherwise
      */
    def hasListeners(event: String): Boolean = js.native
    
    /**
      * Returns all the callbacks for a particular event
      * @param event The event that we're looking for the callbacks of
      * @return An array of callback Functions, or an empty array if we don't have any
      */
    def listeners(event: String): js.Array[js.Function] = js.native
    
    /**
      * Removes a listener for a particular type of event. This will either
      * remove a specific listener, or all listeners for this type of event
      * @param event The event that we want to remove the listener of
      * @param fn The function to remove, or null if we want to remove all functions
      * @return This Emitter
      */
    def off(event: String): Emitter = js.native
    def off(event: String, fn: js.Function): Emitter = js.native
    
    /**
      * Adds a listener for a particular event. Calling multiple times will add
      * multiple listeners
      * @param event The event that we're listening for
      * @param fn The function to call when we get the event. Parameters depend on the
      * event in question
      * @return This Emitter
      */
    def on(event: String, fn: js.Function): Emitter = js.native
    
    /**
      * Adds a listener for a particular event that will be invoked
      * a single time before being automatically removed
      * @param event The event that we're listening for
      * @param fn The function to call when we get the event. Parameters depend on
      * the event in question
      * @return This Emitter
      */
    def once(event: String, fn: js.Function): Emitter = js.native
    
    /**
      * Removes all event listeners on this object
      * @return This Emitter
      */
    def removeAllListeners(): Emitter = js.native
    
    /**
      * @see off( event, fn )
      */
    def removeEventListener(event: String): Emitter = js.native
    def removeEventListener(event: String, fn: js.Function): Emitter = js.native
    
    /**
      * @see off( event, fn )
      */
    def removeListener(event: String): Emitter = js.native
    def removeListener(event: String, fn: js.Function): Emitter = js.native
  }
  
  /**
    * The Manager class handles all the Namespaces and Sockets that we're using
    */
  @js.native
  trait Manager extends Emitter {
    
    /**
      * If we should auto connect (also used when creating Sockets). Set via the
      * opts object
      */
    var autoConnect: Boolean = js.native
    
    /**
      * @see open( fn );
      */
    def connect(): Manager = js.native
    def connect(fn: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Manager = js.native
    
    /**
      * The currently connected sockets
      */
    var connecting: js.Array[Socket] = js.native
    
    /**
      * All the namespaces currently controlled by this Manager, and the Sockets
      * that we're using to communicate with them
      */
    var nsps: StringDictionary[Socket] = js.native
    
    /**
      * Sets the current transport socket and opens our connection
      * @param fn An optional callback to call when our socket has either opened, or
      * failed. It can take one optional parameter of type Error
      * @return This Manager
      */
    def open(): Manager = js.native
    def open(fn: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Manager = js.native
    
    /**
      * The connect options that we used when creating this Manager
      */
    var opts: ConnectOpts = js.native
    
    /**
      * Gets the randomisation factor used in the exponential backoff jitter
      * when reconnecting
      * @default 0.5
      */
    def randomizationFactor(): Double = js.native
    /**
      * Sets the randomisation factor used in the exponential backoff jitter
      * when reconnecting
      * @param The reconnection randomisation factor
      * @default 0.5
      * @return This Manager
      */
    def randomizationFactor(v: Double): Manager = js.native
    
    /**
      * The state of the Manager. Either 'closed', 'opening', or 'open'
      */
    var readyState: String = js.native
    
    /**
      * Gets if we should reconnect automatically
      * @default true
      */
    def reconnection(): Boolean = js.native
    /**
      * Sets if we should reconnect automatically
      * @param v True if we should reconnect automatically, false otherwise
      * @default true
      * @return This Manager
      */
    def reconnection(v: Boolean): Manager = js.native
    
    /**
      * Gets the number of reconnection attempts we should try before giving up
      * @default Infinity
      */
    def reconnectionAttempts(): Double = js.native
    /**
      * Sets the number of reconnection attempts we should try before giving up
      * @param v The number of attempts we should do before giving up
      * @default Infinity
      * @return This Manager
      */
    def reconnectionAttempts(v: Double): Manager = js.native
    
    /**
      * Gets the delay in milliseconds between each reconnection attempt
      * @default 1000
      */
    def reconnectionDelay(): Double = js.native
    /**
      * Sets the delay in milliseconds between each reconnection attempt
      * @param v The delay in milliseconds
      * @default 1000
      * @return This Manager
      */
    def reconnectionDelay(v: Double): Manager = js.native
    
    /**
      * Gets the max reconnection delay in milliseconds between each reconnection
      * attempt
      * @default 5000
      */
    def reconnectionDelayMax(): Double = js.native
    /**
      * Sets the max reconnection delay in milliseconds between each reconnection
      * attempt
      * @param v The max reconnection dleay in milliseconds
      * @return This Manager
      */
    def reconnectionDelayMax(v: Double): Manager = js.native
    
    /**
      * Creates a new Socket for the given namespace
      * @param nsp The namespace that this Socket is for
      * @return A new Socket, or if one has already been created for this namespace,
      * an existing one
      */
    def socket(nsp: String): Socket = js.native
    
    /**
      * Gets the timeout in milliseconds for our connection attempts
      * @default 20000
      */
    def timeout(): Double = js.native
    /**
      * Sets the timeout in milliseconds for our connection attempts
      * @param The connection timeout milliseconds
      * @return This Manager
      */
    def timeout(v: Double): Manager = js.native
    
    /**
      * The URI that this manager is for (host + port), e.g. 'http://localhost:4000'
      */
    var uri: String = js.native
  }
  
  /**
    * The Manager static interface
    */
  @js.native
  trait ManagerStatic
    extends /**
    * @see default constructor
    */
  Instantiable1[(/* opts */ ConnectOpts) | (/* uri */ String), Manager]
       with Instantiable2[/* uri */ String, /* opts */ ConnectOpts, Manager] {
    
    /**
      * Creates a new Manager with the default URI (window host)
      * @param opts Any connection options that we want to use (and pass to engine.io)
      */
    def apply(opts: ConnectOpts): Manager = js.native
    /**
      * Creates a new Manager
      * @param uri The URI that we're connecting to (e.g. http://localhost:4000)
      * @param opts Any connection options that we want to use (and pass to engine.io)
      * @return A Manager
      */
    def apply(uri: String): Manager = js.native
    def apply(uri: String, opts: ConnectOpts): Manager = js.native
  }
  
  /**
    * The Socket that we use to connect to a Namespace on the server
    */
  @js.native
  trait Socket extends Emitter {
    
    /**
      * The type of binary data being transmitted by the connection.
      * https://developer.mozilla.org/en-US/docs/Web/API/WebSocket/binaryType
      */
    var binaryType: blob | arraybuffer = js.native
    
    /**
      * Disconnects the socket manually
      * @return This Socket
      */
    def close(): Socket = js.native
    
    /**
      * Sets the compress flag.
      * @param compress If `true`, compresses the sending data
      * @return this Socket
      */
    def compress(compress: Boolean): Socket = js.native
    
    /**
      * @see open();
      */
    def connect(): Socket = js.native
    
    /**
      * Are we currently connected?
      * @default false
      */
    var connected: Boolean = js.native
    
    /**
      * @see close()
      */
    def disconnect(): Socket = js.native
    
    /**
      * Are we currently disconnected?
      * @default true
      */
    var disconnected: Boolean = js.native
    
    /**
      * The ID of the socket; matches the server ID and is set when we're connected, and cleared
      * when we're disconnected
      */
    var id: String = js.native
    
    /**
      * The Manager that's controller this socket
      */
    var io: Manager = js.native
    
    /**
      * The namespace that this socket is for
      * @default '/'
      */
    var nsp: String = js.native
    
    /**
      * Opens our socket so that it connects. If the 'autoConnect' option for io is
      * true (default), then this is called automatically when the Socket is created
      */
    def open(): Socket = js.native
    
    /**
      * Sends a 'message' event
      * @param args Any optional arguments that we want to send
      * @see emit
      * @return This Socket
      */
    def send(args: js.Any*): Socket = js.native
  }
  
  /**
    * The Socket static interface
    */
  @js.native
  trait SocketStatic
    extends /**
    * Creates a new Socket, used for communicating with a specific namespace
    * @param io The Manager that's controlling this socket
    * @param nsp The namespace that this socket is for (@default '/')
    * @return A new Socket
    */
  Instantiable2[/* url */ String, /* opts */ js.Any, Manager] {
    
    /**
      * Creates a new Socket, used for communicating with a specific namespace
      * @param io The Manager that's controlling this socket
      * @param nsp The namespace that this socket is for (@default '/')
      * @return A new Socket
      */
    def apply(io: Manager, nsp: String): Socket = js.native
  }
}
