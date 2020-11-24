package typings.socketIoClient.SocketIOClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options we can pass to the socket when connecting
  */
@js.native
trait ConnectOpts extends js.Object {
  
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
  implicit class ConnectOptsOps[Self <: ConnectOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgent(value: String | Boolean): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setAutoConnect(value: Boolean): Self = this.set("autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConnect: Self = this.set("autoConnect", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: String*): Self = this.set("ca", js.Array(value :_*))
    
    @scala.inline
    def setCa(value: String | js.Array[String]): Self = this.set("ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    
    @scala.inline
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    
    @scala.inline
    def setEnablesXDR(value: Boolean): Self = this.set("enablesXDR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablesXDR: Self = this.set("enablesXDR", js.undefined)
    
    @scala.inline
    def setForceBase64(value: Boolean): Self = this.set("forceBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceBase64: Self = this.set("forceBase64", js.undefined)
    
    @scala.inline
    def setForceJSONP(value: Boolean): Self = this.set("forceJSONP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceJSONP: Self = this.set("forceJSONP", js.undefined)
    
    @scala.inline
    def setForceNew(value: Boolean): Self = this.set("forceNew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceNew: Self = this.set("forceNew", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setJsonp(value: Boolean): Self = this.set("jsonp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonp: Self = this.set("jsonp", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMultiplex(value: Boolean): Self = this.set("multiplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiplex: Self = this.set("multiplex", js.undefined)
    
    @scala.inline
    def setOnlyBinaryUpgrades(value: Boolean): Self = this.set("onlyBinaryUpgrades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyBinaryUpgrades: Self = this.set("onlyBinaryUpgrades", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPfx(value: String): Self = this.set("pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    
    @scala.inline
    def setPolicyPost(value: Double): Self = this.set("policyPost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyPost: Self = this.set("policyPost", js.undefined)
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setQuery(value: js.Object): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRandomizationFactor(value: Double): Self = this.set("randomizationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandomizationFactor: Self = this.set("randomizationFactor", js.undefined)
    
    @scala.inline
    def setReconnection(value: Boolean): Self = this.set("reconnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnection: Self = this.set("reconnection", js.undefined)
    
    @scala.inline
    def setReconnectionAttempts(value: Double): Self = this.set("reconnectionAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectionAttempts: Self = this.set("reconnectionAttempts", js.undefined)
    
    @scala.inline
    def setReconnectionDelay(value: Double): Self = this.set("reconnectionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectionDelay: Self = this.set("reconnectionDelay", js.undefined)
    
    @scala.inline
    def setReconnectionDelayMax(value: Double): Self = this.set("reconnectionDelayMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectionDelayMax: Self = this.set("reconnectionDelayMax", js.undefined)
    
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    
    @scala.inline
    def setRememberUpgrade(value: Boolean): Self = this.set("rememberUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRememberUpgrade: Self = this.set("rememberUpgrade", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTimestampParam(value: String): Self = this.set("timestampParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampParam: Self = this.set("timestampParam", js.undefined)
    
    @scala.inline
    def setTimestampRequests(value: Boolean): Self = this.set("timestampRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampRequests: Self = this.set("timestampRequests", js.undefined)
    
    @scala.inline
    def setTransportOptions(value: js.Object): Self = this.set("transportOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportOptions: Self = this.set("transportOptions", js.undefined)
    
    @scala.inline
    def setTransportsVarargs(value: String*): Self = this.set("transports", js.Array(value :_*))
    
    @scala.inline
    def setTransports(value: js.Array[String]): Self = this.set("transports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransports: Self = this.set("transports", js.undefined)
    
    @scala.inline
    def setUpgrade(value: Boolean): Self = this.set("upgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgrade: Self = this.set("upgrade", js.undefined)
  }
}
