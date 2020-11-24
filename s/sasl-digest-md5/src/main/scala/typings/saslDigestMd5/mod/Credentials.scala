package typings.saslDigestMd5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credentials extends js.Object {
  
  var authzid: js.UndefOr[String] = js.native
  
  var host: String = js.native
  
  var password: String = js.native
  
  var realm: js.UndefOr[String] = js.native
  
  var serviceName: js.UndefOr[String] = js.native
  
  var serviceType: String = js.native
  
  var username: String = js.native
}
object Credentials {
  
  @scala.inline
  def apply(host: String, password: String, serviceType: String, username: String): Credentials = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: String): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthzid(value: String): Self = this.set("authzid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthzid: Self = this.set("authzid", js.undefined)
    
    @scala.inline
    def setRealm(value: String): Self = this.set("realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealm: Self = this.set("realm", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
  }
}
