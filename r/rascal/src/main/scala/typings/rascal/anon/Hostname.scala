package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hostname extends StObject {
  
  var hostname: String = js.native
  
  var management: Options = js.native
  
  var options: ChannelMax = js.native
  
  var password: String = js.native
  
  var port: String = js.native
  
  var protocol: String = js.native
  
  var retry: Factor = js.native
  
  var slashes: Boolean = js.native
  
  var socketOptions: TimeoutNumber = js.native
  
  var user: String = js.native
}
object Hostname {
  
  @scala.inline
  def apply(
    hostname: String,
    management: Options,
    options: ChannelMax,
    password: String,
    port: String,
    protocol: String,
    retry: Factor,
    slashes: Boolean,
    socketOptions: TimeoutNumber,
    user: String
  ): Hostname = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any], socketOptions = socketOptions.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hostname]
  }
  
  @scala.inline
  implicit class HostnameMutableBuilder[Self <: Hostname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagement(value: Options): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ChannelMax): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry(value: Factor): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketOptions(value: TimeoutNumber): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
