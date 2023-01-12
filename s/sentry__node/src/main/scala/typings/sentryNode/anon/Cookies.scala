package typings.sentryNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  var cookies: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[Boolean] = js.undefined
  
  var ip: js.UndefOr[Boolean] = js.undefined
  
  var query_string: js.UndefOr[Boolean] = js.undefined
  
  var url: js.UndefOr[Boolean] = js.undefined
  
  var user: js.UndefOr[
    Boolean | (js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[number] */ js.Any
    ])
  ] = js.undefined
}
object Cookies {
  
  inline def apply(): Cookies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cookies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cookies] (val x: Self) extends AnyVal {
    
    inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeaders(value: Boolean): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setQuery_string(value: Boolean): Self = StObject.set(x, "query_string", value.asInstanceOf[js.Any])
    
    inline def setQuery_stringUndefined: Self = StObject.set(x, "query_string", js.undefined)
    
    inline def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUser(
      value: Boolean | (js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[number] */ js.Any
        ])
    ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setUserVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string>[number] */ js.Any)*
    ): Self = StObject.set(x, "user", js.Array(value*))
  }
}
