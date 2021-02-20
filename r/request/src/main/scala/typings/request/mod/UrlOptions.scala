package typings.request.mod

import typings.node.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlOptions extends RequiredUriUrl {
  
  var url: String | Url = js.native
}
object UrlOptions {
  
  @scala.inline
  def apply(url: String | Url): UrlOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptions]
  }
  
  @scala.inline
  implicit class UrlOptionsMutableBuilder[Self <: UrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String | Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
