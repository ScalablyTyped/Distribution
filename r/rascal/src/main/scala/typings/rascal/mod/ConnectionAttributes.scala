package typings.rascal.mod

import typings.rascal.anon.Dictkey
import typings.rascal.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAttributes extends js.Object {
  
  var auth: js.UndefOr[String] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var loggableUrl: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[Dictkey] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var pathname: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[String | Double] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var slashes: js.UndefOr[Boolean] = js.native
  
  var socketOptions: js.UndefOr[Timeout] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var user: js.UndefOr[String] = js.native
  
  var vhost: js.UndefOr[String] = js.native
}
object ConnectionAttributes {
  
  @scala.inline
  def apply(): ConnectionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAttributes]
  }
  
  @scala.inline
  implicit class ConnectionAttributesOps[Self <: ConnectionAttributes] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setLoggableUrl(value: String): Self = this.set("loggableUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggableUrl: Self = this.set("loggableUrl", js.undefined)
    
    @scala.inline
    def setOptions(value: Dictkey): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPathname(value: String): Self = this.set("pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathname: Self = this.set("pathname", js.undefined)
    
    @scala.inline
    def setPort(value: String | Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSlashes(value: Boolean): Self = this.set("slashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlashes: Self = this.set("slashes", js.undefined)
    
    @scala.inline
    def setSocketOptions(value: Timeout): Self = this.set("socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketOptions: Self = this.set("socketOptions", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    
    @scala.inline
    def setVhost(value: String): Self = this.set("vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVhost: Self = this.set("vhost", js.undefined)
  }
}
