package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.DELETE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodPath extends StObject {
  
  var method: DELETE
  
  var path: String
  
  var regex: js.UndefOr[Boolean] = js.undefined
}
object MethodPath {
  
  inline def apply(path: String): MethodPath = {
    val __obj = js.Dynamic.literal(method = "DELETE", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPath]
  }
  
  extension [Self <: MethodPath](x: Self) {
    
    inline def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
