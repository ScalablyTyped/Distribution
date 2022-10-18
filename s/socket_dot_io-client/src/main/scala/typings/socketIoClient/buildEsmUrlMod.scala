package typings.socketIoClient

import org.scalablytyped.runtime.StringDictionary
import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildEsmUrlMod {
  
  @JSImport("socket.io-client/build/esm/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def url(uri: String): ParsedUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(uri.asInstanceOf[js.Any]).asInstanceOf[ParsedUrl]
  inline def url(uri: String, path: String): ParsedUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(uri.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[ParsedUrl]
  inline def url(uri: String, path: String, loc: Location): ParsedUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(uri.asInstanceOf[js.Any], path.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[ParsedUrl]
  inline def url(uri: String, path: Unit, loc: Location): ParsedUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(uri.asInstanceOf[js.Any], path.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[ParsedUrl]
  inline def url(uri: ParsedUrl): ParsedUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(uri.asInstanceOf[js.Any]).asInstanceOf[ParsedUrl]
  inline def url(uri: ParsedUrl, path: String): ParsedUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(uri.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[ParsedUrl]
  inline def url(uri: ParsedUrl, path: String, loc: Location): ParsedUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(uri.asInstanceOf[js.Any], path.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[ParsedUrl]
  inline def url(uri: ParsedUrl, path: Unit, loc: Location): ParsedUrl = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(uri.asInstanceOf[js.Any], path.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[ParsedUrl]
  
  trait ParsedUrl extends StObject {
    
    var anchor: String
    
    var authority: String
    
    var directory: String
    
    var file: String
    
    var host: String
    
    var href: String
    
    var id: String
    
    var password: String
    
    var path: String
    
    var pathNames: js.Array[String]
    
    var port: String
    
    var protocol: String
    
    var query: String
    
    var queryKey: StringDictionary[String]
    
    var relative: String
    
    var source: String
    
    var user: String
    
    var userInfo: String
  }
  object ParsedUrl {
    
    inline def apply(
      anchor: String,
      authority: String,
      directory: String,
      file: String,
      host: String,
      href: String,
      id: String,
      password: String,
      path: String,
      pathNames: js.Array[String],
      port: String,
      protocol: String,
      query: String,
      queryKey: StringDictionary[String],
      relative: String,
      source: String,
      user: String,
      userInfo: String
    ): ParsedUrl = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], authority = authority.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathNames = pathNames.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], userInfo = userInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedUrl]
    }
    
    extension [Self <: ParsedUrl](x: Self) {
      
      inline def setAnchor(value: String): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNames(value: js.Array[String]): Self = StObject.set(x, "pathNames", value.asInstanceOf[js.Any])
      
      inline def setPathNamesVarargs(value: String*): Self = StObject.set(x, "pathNames", js.Array(value*))
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryKey(value: StringDictionary[String]): Self = StObject.set(x, "queryKey", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: String): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserInfo(value: String): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    }
  }
}
