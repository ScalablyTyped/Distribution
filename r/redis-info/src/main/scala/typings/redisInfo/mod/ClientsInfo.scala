package typings.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientsInfo extends StObject {
  
  var blocked_clients: String
  
  var client_biggest_input_buf: String
  
  var client_longest_output_list: String
  
  var connected_clients: String
}
object ClientsInfo {
  
  @scala.inline
  def apply(
    blocked_clients: String,
    client_biggest_input_buf: String,
    client_longest_output_list: String,
    connected_clients: String
  ): ClientsInfo = {
    val __obj = js.Dynamic.literal(blocked_clients = blocked_clients.asInstanceOf[js.Any], client_biggest_input_buf = client_biggest_input_buf.asInstanceOf[js.Any], client_longest_output_list = client_longest_output_list.asInstanceOf[js.Any], connected_clients = connected_clients.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientsInfo]
  }
  
  @scala.inline
  implicit class ClientsInfoMutableBuilder[Self <: ClientsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocked_clients(value: String): Self = StObject.set(x, "blocked_clients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_biggest_input_buf(value: String): Self = StObject.set(x, "client_biggest_input_buf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_longest_output_list(value: String): Self = StObject.set(x, "client_longest_output_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnected_clients(value: String): Self = StObject.set(x, "connected_clients", value.asInstanceOf[js.Any])
  }
}
