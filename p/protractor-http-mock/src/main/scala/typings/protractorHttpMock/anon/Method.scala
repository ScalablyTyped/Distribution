package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method[TPayload] extends StObject {
  
  var data: TPayload
  
  var method: POST
  
  var path: String
  
  var regex: js.UndefOr[Boolean] = js.undefined
}
object Method {
  
  inline def apply[TPayload](data: TPayload, path: String): Method[TPayload] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = "POST", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method[TPayload]]
  }
  
  extension [Self <: Method[?], TPayload](x: Self & Method[TPayload]) {
    
    inline def setData(value: TPayload): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
