package typings.socketIo.mod

import org.scalablytyped.runtime.StringDictionary
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
  var id: String
  /**
    * A dictionary of all the namespaces for this client, with the Socket that
    * deals with that namespace
    */
  var nsps: StringDictionary[Socket]
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
  var sockets: StringDictionary[Socket]
}

object Client {
  @scala.inline
  def apply(
    conn: EngineSocket,
    id: String,
    nsps: StringDictionary[Socket],
    request: js.Any,
    server: Server,
    sockets: StringDictionary[Socket]
  ): Client = {
    val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nsps = nsps.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
}

