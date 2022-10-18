package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var fileName: String
}
object Content {
  
  inline def apply(content: String, fileName: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
