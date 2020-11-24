package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hostname extends js.Object {
  
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
  implicit class HostnameOps[Self <: Hostname] (val x: Self) extends AnyVal {
    
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
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagement(value: Options): Self = this.set("management", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ChannelMax): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry(value: Factor): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlashes(value: Boolean): Self = this.set("slashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketOptions(value: TimeoutNumber): Self = this.set("socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}
