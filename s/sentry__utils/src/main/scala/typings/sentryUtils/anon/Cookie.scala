package typings.sentryUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  var cookie: Parse
  
  var url: `0`
}
object Cookie {
  
  inline def apply(cookie: Parse, url: `0`): Cookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  extension [Self <: Cookie](x: Self) {
    
    inline def setCookie(value: Parse): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: `0`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
