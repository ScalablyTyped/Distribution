package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hostname extends StObject {
  
  var hostname: String
  
  var management: Options
  
  var options: ChannelMax
  
  var password: String
  
  var port: String
  
  var protocol: String
  
  var retry: Factor
  
  var slashes: Boolean
  
  var socketOptions: Timeout
  
  var user: String
}
object Hostname {
  
  inline def apply(
    hostname: String,
    management: Options,
    options: ChannelMax,
    password: String,
    port: String,
    protocol: String,
    retry: Factor,
    slashes: Boolean,
    socketOptions: Timeout,
    user: String
  ): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any], socketOptions = socketOptions.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setManagement(value: Options): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ChannelMax): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: Factor): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
    
    inline def setSocketOptions(value: Timeout): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
