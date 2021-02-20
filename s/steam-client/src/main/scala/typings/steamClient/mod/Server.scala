package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server extends StObject {
  
  var host: String = js.native
  
  var port: String | Double = js.native
}
object Server {
  
  @scala.inline
  def apply(host: String, port: String | Double): Server = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Server]
  }
  
  @scala.inline
  implicit class ServerMutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
