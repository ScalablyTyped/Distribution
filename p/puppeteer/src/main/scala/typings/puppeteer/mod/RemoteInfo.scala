package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteInfo extends StObject {
  
  /** the IP address of the remote server */
  var ip: String = js.native
  
  /** the port used to connect to the remote server */
  var port: Double = js.native
}
object RemoteInfo {
  
  @scala.inline
  def apply(ip: String, port: Double): RemoteInfo = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteInfo]
  }
  
  @scala.inline
  implicit class RemoteInfoMutableBuilder[Self <: RemoteInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
