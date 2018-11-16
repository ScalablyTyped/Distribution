package typings
package socketDotIoDashClientLib.SocketIOClientNs

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
  var agent: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
  		 * Should we automically connect?
  		 * @default true
  		 */
  var autoConnect: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * (SSL) An authority certificate or array of authority certificates to
  		 * check the remote host against.. Can be used in Node.js client
  		 * environment to manually specify certificate information.
  		 */
  var ca: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
  		 * (SSL) Public x509 certificate to use. Can be used in Node.js client
  		 * environment to manually specify certificate information.
  		 */
  var cert: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * (SSL) A string describing the ciphers to use or exclude. Consult the
  		 * [cipher format list]
  		 * (http://www.openssl.org/docs/apps/ciphers.html#CIPHER_LIST_FORMAT) for
  		 * details on the format.. Can be used in Node.js client environment to
  		 * manually specify certificate information.
  		 */
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Enables XDomainRequest for IE8 to avoid loading bar flashing with
  		 * click sound. default to `false` because XDomainRequest has a flaw
  		 * of not sending cookie.
  		 * @default false
  		 */
  var enablesXDR: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Forces base 64 encoding for polling transport even when XHR2
  		 * responseType is available and WebSocket even if the used standard
  		 * supports binary.
  		 */
  var forceBase64: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Forces JSONP for polling transport.
  		 */
  var forceJSONP: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Should we force a new Manager for this connection?
  		 * @default false
  		 */
  var forceNew: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * The host that we're connecting to. Set from the URI passed when connecting
  		 */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The hostname for our connection. Set from the URI passed when connecting
  		 */
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Determines whether to use JSONP when necessary for polling. If
  		 * disabled (by settings to false) an error will be emitted (saying
  		 * "No transports available") if no other transports are available.
  		 * If another transport is available for opening a connection (e.g.
  		 * WebSocket) that transport will be used instead.
  		 * @default true
  		 */
  var jsonp: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * (SSL) Private key to use for SSL. Can be used in Node.js client
  		 * environment to manually specify certificate information.
  		 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Should we multiplex our connection (reuse existing Manager) ?
  		 * @default true
  		 */
  var multiplex: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Are we only interested in transports that support binary?
  		 */
  var onlyBinaryUpgrades: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * (SSL) A string or passphrase for the private key or pfx. Can be
  		 * used in Node.js client environment to manually specify certificate
  		 * information.
  		 */
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The path to get our client file from, in the case of the server
  		 * serving it
  		 * @default '/socket.io'
  		 */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * (SSL) Certificate, Private key and CA certificates to use for SSL.
  		 * Can be used in Node.js client environment to manually specify
  		 * certificate information.
  		 */
  var pfx: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The port the policy server listens on
  		 * @default 843
  		 */
  var policyPost: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * The port for our connection. Set from the URI passed when connecting
  		 */
  var port: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Any query parameters in our uri. Set from the URI passed when connecting
  		 */
  var query: js.UndefOr[js.Object] = js.undefined
  /**
  		 * Used in the exponential backoff jitter when reconnecting
  		 * @default 0.5
  		 */
  var randomizationFactor: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Should we allow reconnections?
  		 * @default true
  		 */
  var reconnection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * How many reconnection attempts should we try?
  		 * @default Infinity
  		 */
  var reconnectionAttempts: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * The time delay in milliseconds between reconnection attempts
  		 * @default 1000
  		 */
  var reconnectionDelay: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * The max time delay in milliseconds between reconnection attempts
  		 * @default 5000
  		 */
  var reconnectionDelayMax: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * (SSL) If true, the server certificate is verified against the list of
  		 * supplied CAs. An 'error' event is emitted if verification fails.
  		 * Verification happens at the connection level, before the HTTP request
  		 * is sent. Can be used in Node.js client environment to manually specify
  		 * certificate information.
  		 */
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * If true and if the previous websocket connection to the server succeeded,
  		 * the connection attempt will bypass the normal upgrade process and will
  		 * initially try websocket. A connection attempt following a transport error
  		 * will use the normal upgrade process. It is recommended you turn this on
  		 * only when using SSL/TLS connections, or if you know that your network does
  		 * not block websockets.
  		 * @default false
  		 */
  var rememberUpgrade: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * If this is a secure connection. Set from the URI passed when connecting
  		 */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * The timeout in milliseconds for our connection attempt
  		 * @default 20000
  		 */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * The param name to use as our timestamp key
  		 * @default 't'
  		 */
  var timestampParam: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Whether to add the timestamp with each transport request. Note: this
  		 * is ignored if the browser is IE or Android, in which case requests
  		 * are always stamped
  		 * @default false
  		 */
  var timestampRequests: js.UndefOr[scala.Boolean] = js.undefined
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
  var transports: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
  		 * Whether the client should try to upgrade the transport from
  		 * long-polling to something better.
  		 * @default true
  		 */
  var upgrade: js.UndefOr[scala.Boolean] = js.undefined
}

