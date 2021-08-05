package typings.request.mod

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlOptions
  extends StObject
     with RequiredUriUrl {
  
  var url: String | Url
}
object UrlOptions {
  
  inline def apply(url: String | Url): UrlOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptions]
  }
  
  extension [Self <: UrlOptions](x: Self) {
    
    inline def setUrl(value: String | Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
