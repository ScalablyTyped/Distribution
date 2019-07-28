package typings.socketDotIoDashClient.SocketIOClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options we can pass to the socket when connecting
	 */
trait ConnectOpts extends js.Object {
  /**
  		 * `http.Agent` to use, defaults to `false` (NodeJS only)
  		 */
  var agent: js.UndefOr[String | Boolean] = js.undefined
  /**
  		 * Should we automically connect?
  		 * @default true
  		 */
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  /**
  		 * (SSL) An authority certificate or array of authority certificates to
  		 * check the remote host against.. Can be used in Node.js client
  		 * environment to manually specify certificate information.
  		 */
  var ca: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
  		 * (SSL) Public x509 certificate to use. Can be used in Node.js client
  		 * environment to manually specify certificate information.
  		 */
  var cert: js.UndefOr[String] = js.undefined
  /**
  		 * (SSL) A string describing the ciphers to use or exclude. Consult the
  		 * [cipher format list]
  		 * (http://www.openssl.org/docs/apps/ciphers.html#CIPHER_LIST_FORMAT) for
  		 * details on the format.. Can be used in Node.js client environment to
  		 * manually specify certificate information.
  		 */
  var ciphers: js.UndefOr[String] = js.undefined
  /**
  		 * Enables XDomainRequest for IE8 to avoid loading bar flashing with
  		 * click sound. default to `false` because XDomainRequest has a flaw
  		 * of not sending cookie.
  		 * @default false
  		 */
  var enablesXDR: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Forces base 64 encoding for polling transport even when XHR2
  		 * responseType is available and WebSocket even if the used standard
  		 * supports binary.
  		 */
  var forceBase64: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Forces JSONP for polling transport.
  		 */
  var forceJSONP: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Should we force a new Manager for this connection?
  		 * @default false
  		 */
  var forceNew: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The host that we're connecting to. Set from the URI passed when connecting
  		 */
  var host: js.UndefOr[String] = js.undefined
  /**
  		 * The hostname for our connection. Set from the URI passed when connecting
  		 */
  var hostname: js.UndefOr[String] = js.undefined
  /**
  		 * Determines whether to use JSONP when necessary for polling. If
  		 * disabled (by settings to false) an error will be emitted (saying
  		 * "No transports available") if no other transports are available.
  		 * If another transport is available for opening a connection (e.g.
  		 * WebSocket) that transport will be used instead.
  		 * @default true
  		 */
  var jsonp: js.UndefOr[Boolean] = js.undefined
  /**
  		 * (SSL) Private key to use for SSL. Can be used in Node.js client
  		 * environment to manually specify certificate information.
  		 */
  var key: js.UndefOr[String] = js.undefined
  /**
  		 * Should we multiplex our connection (reuse existing Manager) ?
  		 * @default true
  		 */
  var multiplex: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Are we only interested in transports that support binary?
  		 */
  var onlyBinaryUpgrades: js.UndefOr[Boolean] = js.undefined
  /**
  		 * (SSL) A string or passphrase for the private key or pfx. Can be
  		 * used in Node.js client environment to manually specify certificate
  		 * information.
  		 */
  var passphrase: js.UndefOr[String] = js.undefined
  /**
  		 * The path to get our client file from, in the case of the server
  		 * serving it
  		 * @default '/socket.io'
  		 */
  var path: js.UndefOr[String] = js.undefined
  /**
  		 * (SSL) Certificate, Private key and CA certificates to use for SSL.
  		 * Can be used in Node.js client environment to manually specify
  		 * certificate information.
  		 */
  var pfx: js.UndefOr[String] = js.undefined
  /**
  		 * The port the policy server listens on
  		 * @default 843
  		 */
  var policyPost: js.UndefOr[Double] = js.undefined
  /**
  		 * The port for our connection. Set from the URI passed when connecting
  		 */
  var port: js.UndefOr[String] = js.undefined
  /**
  		 * Any query parameters in our uri. Set from the URI passed when connecting
  		 */
  var query: js.UndefOr[js.Object] = js.undefined
  /**
  		 * Used in the exponential backoff jitter when reconnecting
  		 * @default 0.5
  		 */
  var randomizationFactor: js.UndefOr[Double] = js.undefined
  /**
  		 * Should we allow reconnections?
  		 * @default true
  		 */
  var reconnection: js.UndefOr[Boolean] = js.undefined
  /**
  		 * How many reconnection attempts should we try?
  		 * @default Infinity
  		 */
  var reconnectionAttempts: js.UndefOr[Double] = js.undefined
  /**
  		 * The time delay in milliseconds between reconnection attempts
  		 * @default 1000
  		 */
  var reconnectionDelay: js.UndefOr[Double] = js.undefined
  /**
  		 * The max time delay in milliseconds between reconnection attempts
  		 * @default 5000
  		 */
  var reconnectionDelayMax: js.UndefOr[Double] = js.undefined
  /**
  		 * (SSL) If true, the server certificate is verified against the list of
  		 * supplied CAs. An 'error' event is emitted if verification fails.
  		 * Verification happens at the connection level, before the HTTP request
  		 * is sent. Can be used in Node.js client environment to manually specify
  		 * certificate information.
  		 */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  /**
  		 * If true and if the previous websocket connection to the server succeeded,
  		 * the connection attempt will bypass the normal upgrade process and will
  		 * initially try websocket. A connection attempt following a transport error
  		 * will use the normal upgrade process. It is recommended you turn this on
  		 * only when using SSL/TLS connections, or if you know that your network does
  		 * not block websockets.
  		 * @default false
  		 */
  var rememberUpgrade: js.UndefOr[Boolean] = js.undefined
  /**
  		 * If this is a secure connection. Set from the URI passed when connecting
  		 */
  var secure: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The timeout in milliseconds for our connection attempt
  		 * @default 20000
  		 */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
  		 * The param name to use as our timestamp key
  		 * @default 't'
  		 */
  var timestampParam: js.UndefOr[String] = js.undefined
  /**
  		 * Whether to add the timestamp with each transport request. Note: this
  		 * is ignored if the browser is IE or Android, in which case requests
  		 * are always stamped
  		 * @default false
  		 */
  var timestampRequests: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Transport options for Node.js client (headers etc)
  		 */
  var transportOptions: js.UndefOr[js.Object] = js.undefined
  /**
  		 * A list of transports to try (in order). Engine.io always attempts to
  		 * connect directly with the first one, provided the feature detection test
  		 * for it passes.
  		 * @default ['polling','websocket']
  		 */
  var transports: js.UndefOr[js.Array[String]] = js.undefined
  /**
  		 * Whether the client should try to upgrade the transport from
  		 * long-polling to something better.
  		 * @default true
  		 */
  var upgrade: js.UndefOr[Boolean] = js.undefined
}

object ConnectOpts {
  @scala.inline
  def apply(
    agent: String | Boolean = null,
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    ca: String | js.Array[String] = null,
    cert: String = null,
    ciphers: String = null,
    enablesXDR: js.UndefOr[Boolean] = js.undefined,
    forceBase64: js.UndefOr[Boolean] = js.undefined,
    forceJSONP: js.UndefOr[Boolean] = js.undefined,
    forceNew: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    hostname: String = null,
    jsonp: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    multiplex: js.UndefOr[Boolean] = js.undefined,
    onlyBinaryUpgrades: js.UndefOr[Boolean] = js.undefined,
    passphrase: String = null,
    path: String = null,
    pfx: String = null,
    policyPost: Int | Double = null,
    port: String = null,
    query: js.Object = null,
    randomizationFactor: Int | Double = null,
    reconnection: js.UndefOr[Boolean] = js.undefined,
    reconnectionAttempts: Int | Double = null,
    reconnectionDelay: Int | Double = null,
    reconnectionDelayMax: Int | Double = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    rememberUpgrade: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    timestampParam: String = null,
    timestampRequests: js.UndefOr[Boolean] = js.undefined,
    transportOptions: js.Object = null,
    transports: js.Array[String] = null,
    upgrade: js.UndefOr[Boolean] = js.undefined
  ): ConnectOpts = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (!js.isUndefined(enablesXDR)) __obj.updateDynamic("enablesXDR")(enablesXDR)
    if (!js.isUndefined(forceBase64)) __obj.updateDynamic("forceBase64")(forceBase64)
    if (!js.isUndefined(forceJSONP)) __obj.updateDynamic("forceJSONP")(forceJSONP)
    if (!js.isUndefined(forceNew)) __obj.updateDynamic("forceNew")(forceNew)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (!js.isUndefined(jsonp)) __obj.updateDynamic("jsonp")(jsonp)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(multiplex)) __obj.updateDynamic("multiplex")(multiplex)
    if (!js.isUndefined(onlyBinaryUpgrades)) __obj.updateDynamic("onlyBinaryUpgrades")(onlyBinaryUpgrades)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx)
    if (policyPost != null) __obj.updateDynamic("policyPost")(policyPost.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port)
    if (query != null) __obj.updateDynamic("query")(query)
    if (randomizationFactor != null) __obj.updateDynamic("randomizationFactor")(randomizationFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnection)) __obj.updateDynamic("reconnection")(reconnection)
    if (reconnectionAttempts != null) __obj.updateDynamic("reconnectionAttempts")(reconnectionAttempts.asInstanceOf[js.Any])
    if (reconnectionDelay != null) __obj.updateDynamic("reconnectionDelay")(reconnectionDelay.asInstanceOf[js.Any])
    if (reconnectionDelayMax != null) __obj.updateDynamic("reconnectionDelayMax")(reconnectionDelayMax.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(rememberUpgrade)) __obj.updateDynamic("rememberUpgrade")(rememberUpgrade)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timestampParam != null) __obj.updateDynamic("timestampParam")(timestampParam)
    if (!js.isUndefined(timestampRequests)) __obj.updateDynamic("timestampRequests")(timestampRequests)
    if (transportOptions != null) __obj.updateDynamic("transportOptions")(transportOptions)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    if (!js.isUndefined(upgrade)) __obj.updateDynamic("upgrade")(upgrade)
    __obj.asInstanceOf[ConnectOpts]
  }
}

