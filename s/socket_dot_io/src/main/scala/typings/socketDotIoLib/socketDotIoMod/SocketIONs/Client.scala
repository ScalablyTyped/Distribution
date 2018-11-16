package typings
package socketDotIoLib.socketDotIoMod.SocketIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The client behind each socket (can have multiple sockets)
	 */

trait Client extends js.Object {
  /**
  		 * The underlying Engine.io Socket instance
  		 */
  var conn: EngineSocket
  /**
  		 * The ID for this client. Regenerated at every connection
  		 */
  var id: java.lang.String
  /**
  		 * A dictionary of all the namespaces for this client, with the Socket that
  		 * deals with that namespace
  		 */
  var nsps: ScalablyTyped.runtime.StringDictionary[Socket]
  /**
  		 * The http.IncomingMessage request sent with the connection. Useful
  		 * for recovering headers etc
  		 */
  var request: js.Any
  /**
  		 * The Server that this client belongs to
  		 */
  var server: Server
  /**
  		 * The dictionary of sockets currently connect via this client (i.e. to different
  		 * namespaces) where the Socket ID is the key
  		 */
  var sockets: ScalablyTyped.runtime.StringDictionary[Socket]
}

