package typings
package socketDotIoLib.socketDotIoMod

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
  var nsps: org.scalablytyped.runtime.StringDictionary[Socket]
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
  var sockets: org.scalablytyped.runtime.StringDictionary[Socket]
}

object Client {
  @scala.inline
  def apply(
    conn: EngineSocket,
    id: java.lang.String,
    nsps: org.scalablytyped.runtime.StringDictionary[Socket],
    request: js.Any,
    server: Server,
    sockets: org.scalablytyped.runtime.StringDictionary[Socket]
  ): Client = {
    val __obj = js.Dynamic.literal(conn = conn, id = id, nsps = nsps, request = request, server = server, sockets = sockets)
  
    __obj.asInstanceOf[Client]
  }
}

