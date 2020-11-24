package typings.socketIo.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client behind each socket (can have multiple sockets)
  */
@js.native
trait Client extends js.Object {
  
  /**
    * The underlying Engine.io Socket instance
    */
  var conn: EngineSocket = js.native
  
  /**
    * The ID for this client. Regenerated at every connection
    */
  var id: String = js.native
  
  /**
    * A dictionary of all the namespaces for this client, with the Socket that
    * deals with that namespace
    */
  var nsps: StringDictionary[Socket] = js.native
  
  /**
    * The http.IncomingMessage request sent with the connection. Useful
    * for recovering headers etc
    */
  var request: js.Any = js.native
  
  /**
    * The Server that this client belongs to
    */
  var server: Server = js.native
  
  /**
    * The dictionary of sockets currently connect via this client (i.e. to different
    * namespaces) where the Socket ID is the key
    */
  var sockets: StringDictionary[Socket] = js.native
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
  
  @scala.inline
  implicit class ClientOps[Self <: Client] (val x: Self) extends AnyVal {
    
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
    def setConn(value: EngineSocket): Self = this.set("conn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNsps(value: StringDictionary[Socket]): Self = this.set("nsps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: js.Any): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: Server): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSockets(value: StringDictionary[Socket]): Self = this.set("sockets", value.asInstanceOf[js.Any])
  }
}
