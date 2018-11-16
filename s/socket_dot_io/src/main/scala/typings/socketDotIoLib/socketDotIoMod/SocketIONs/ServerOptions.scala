package typings
package socketDotIoLib.socketDotIoMod.SocketIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Options to pass to our server when creating it
	 */

trait ServerOptions extends js.Object {
  /**
  		 * The adapter to use for handling rooms. NOTE: this should be a class,
  		 * not an object
  		 * @default typeof Adapter
  		 */
  var adapter: js.UndefOr[Adapter] = js.undefined
  /**
  		 * A function that receives a given handshake or upgrade request as its first parameter,
  		 * and can decide whether to continue or not. The second argument is a function that needs
  		 * to be called with the decided information: fn( err, success ), where success is a boolean
  		 * value where false means that the request is rejected, and err is an error code (engine.io)
  		 * @default null
  		 */
  var allowRequest: js.UndefOr[
    js.Function2[
      /* request */ js.Any, 
      /* callback */ js.Function2[/* err */ scala.Double, /* success */ scala.Boolean, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * Whether to allow transport upgrades (engine.io)
  		 * @default true
  		 */
  var allowUpgrades: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Name of the HTTP cookie that contains the client sid to send as part of
  		 * handshake response headers. Set to false to not send one (engine.io)
  		 * @default "io"
  		 */
  var cookie: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
  		 * Parameters of the http compression for the polling transports (see zlib).
  		 * Set to false to disable, or set an object with parameter "threshold:number"
  		 * to only compress data if the byte size is above this value (1024) (engine.io)
  		 * @default true|1024
  		 */
  var httpCompression: js.UndefOr[js.Object | scala.Boolean] = js.undefined
  /**
  		 * How many bytes or characters a message can be when polling, before closing the session
  		 * (to avoid Dos) (engine.io)
  		 * @default 10E7
  		 */
  var maxHttpBufferSize: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Accepted origins
  		 * @default '*:*'
  		 */
  var origins: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
  		 * The path to server the client file to
  		 * @default '/socket.io'
  		 */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * parameters of the WebSocket permessage-deflate extension (see ws module).
  		 * Set to false to disable (engine.io)
  		 * @default true
  		 */
  var perMessageDeflate: js.UndefOr[js.Object | scala.Boolean] = js.undefined
  /**
  		 * How many milliseconds before sending a new ping packet (keep-alive) (engine.io)
  		 * @default 25000
  		 */
  var pingInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * How many milliseconds without a pong packed to consider the connection closed (engine.io)
  		 * @default 60000
  		 */
  var pingTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * Should we serve the client file?
  		 * @default true
  		 */
  var serveClient: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * Transports to allow connections to (engine.io)
  		 * @default ['polling','websocket']
  		 */
  var transports: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

