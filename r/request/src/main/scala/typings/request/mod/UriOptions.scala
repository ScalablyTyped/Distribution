package typings.request.mod

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UriOptions
  extends StObject
     with RequiredUriUrl {
  
  var uri: String | Url
}
object UriOptions {
  
  inline def apply(uri: String | Url): UriOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriOptions]
  }
  
  extension [Self <: UriOptions](x: Self) {
    
    inline def setUri(value: String | Url): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
