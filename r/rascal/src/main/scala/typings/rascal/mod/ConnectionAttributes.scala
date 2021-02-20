package typings.rascal.mod

import typings.rascal.anon.Dictkey
import typings.rascal.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAttributes extends StObject {
  
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
  implicit class ConnectionAttributesMutableBuilder[Self <: ConnectionAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setLoggableUrl(value: String): Self = StObject.set(x, "loggableUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggableUrlUndefined: Self = StObject.set(x, "loggableUrl", js.undefined)
    
    @scala.inline
    def setOptions(value: Dictkey): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    @scala.inline
    def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    
    @scala.inline
    def setSocketOptions(value: Timeout): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    @scala.inline
    def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
  }
}
