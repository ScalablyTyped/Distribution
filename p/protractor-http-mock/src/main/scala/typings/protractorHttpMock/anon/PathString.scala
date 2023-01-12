package typings.protractorHttpMock.anon

import typings.protractorHttpMock.protractorHttpMockStrings.JSONP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathString extends StObject {
  
  var method: JSONP
  
  var path: String
  
  var regex: js.UndefOr[Boolean] = js.undefined
}
object PathString {
  
  inline def apply(path: String): PathString = {
    val __obj = js.Dynamic.literal(method = "JSONP", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathString] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: JSONP): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
