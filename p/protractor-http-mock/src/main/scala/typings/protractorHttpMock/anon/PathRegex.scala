package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRegex extends StObject {
  
  var method: PUT
  
  var path: String
  
  var regex: js.UndefOr[Boolean] = js.undefined
}
object PathRegex {
  
  inline def apply(path: String): PathRegex = {
    val __obj = js.Dynamic.literal(method = "PUT", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRegex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRegex] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
