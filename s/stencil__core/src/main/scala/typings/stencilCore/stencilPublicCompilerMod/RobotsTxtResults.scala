package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RobotsTxtResults extends StObject {
  
  var content: String
  
  var filePath: String
  
  var url: String
}
object RobotsTxtResults {
  
  inline def apply(content: String, filePath: String, url: String): RobotsTxtResults = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RobotsTxtResults]
  }
  
  extension [Self <: RobotsTxtResults](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
