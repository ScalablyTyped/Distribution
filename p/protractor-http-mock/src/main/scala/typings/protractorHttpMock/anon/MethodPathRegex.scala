package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.PATCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodPathRegex extends StObject {
  
  var method: PATCH
  
  var path: String
  
  var regex: js.UndefOr[Boolean] = js.undefined
}
object MethodPathRegex {
  
  inline def apply(path: String): MethodPathRegex = {
    val __obj = js.Dynamic.literal(method = "PATCH", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPathRegex]
  }
  
  extension [Self <: MethodPathRegex](x: Self) {
    
    inline def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
