package typings.rascal.mod

import typings.rascal.anon.Dictkey
import typings.rascal.anon.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionAttributes extends StObject {
  
  var auth: js.UndefOr[String] = js.undefined
  
  var hostname: js.UndefOr[String] = js.undefined
  
  var loggableUrl: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[Dictkey] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var pathname: js.UndefOr[String] = js.undefined
  
  var port: js.UndefOr[String | Double] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var slashes: js.UndefOr[Boolean] = js.undefined
  
  var socketOptions: js.UndefOr[Timeout] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var user: js.UndefOr[String] = js.undefined
  
  var vhost: js.UndefOr[String] = js.undefined
}
object ConnectionAttributes {
  
  inline def apply(): ConnectionAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAttributes]
  }
  
  extension [Self <: ConnectionAttributes](x: Self) {
    
    inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setLoggableUrl(value: String): Self = StObject.set(x, "loggableUrl", value.asInstanceOf[js.Any])
    
    inline def setLoggableUrlUndefined: Self = StObject.set(x, "loggableUrl", js.undefined)
    
    inline def setOptions(value: Dictkey): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
    
    inline def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    
    inline def setSocketOptions(value: Timeout): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    inline def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    inline def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
  }
}
