package typings.request.mod

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.request.mod.UriOptions
  - typings.request.mod.UrlOptions
*/
trait RequiredUriUrl extends StObject
object RequiredUriUrl {
  
  inline def UriOptions(uri: String | Url): typings.request.mod.UriOptions = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.request.mod.UriOptions]
  }
  
  inline def UrlOptions(url: String | Url): typings.request.mod.UrlOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.request.mod.UrlOptions]
  }
}
