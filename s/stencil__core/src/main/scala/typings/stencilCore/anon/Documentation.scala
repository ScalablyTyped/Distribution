package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Documentation extends StObject {
  
  var documentation: String
  
  var `type`: String
}
object Documentation {
  
  inline def apply(documentation: String, `type`: String): Documentation = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documentation]
  }
  
  extension [Self <: Documentation](x: Self) {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
