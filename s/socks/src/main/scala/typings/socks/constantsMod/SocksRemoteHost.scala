package typings.socks.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a remote host
  */
trait SocksRemoteHost extends StObject {
  
  var host: String
  
  var port: Double
}
object SocksRemoteHost {
  
  @scala.inline
  def apply(host: String, port: Double): SocksRemoteHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksRemoteHost]
  }
  
  @scala.inline
  implicit class SocksRemoteHostMutableBuilder[Self <: SocksRemoteHost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
