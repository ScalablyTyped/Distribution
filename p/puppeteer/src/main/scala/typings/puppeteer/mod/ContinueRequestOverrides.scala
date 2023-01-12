package typings.puppeteer.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueRequestOverrides extends StObject {
  
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var postData: js.UndefOr[String] = js.undefined
  
  /**
    * If set, the request URL will change. This is not a redirect.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ContinueRequestOverrides {
  
  inline def apply(): ContinueRequestOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueRequestOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinueRequestOverrides] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPostData(value: String): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
