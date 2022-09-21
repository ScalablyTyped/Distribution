package typings.stencilCore.stencilPublicDocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDocsMethodReturn extends StObject {
  
  var docs: String
  
  var `type`: String
}
object JsonDocsMethodReturn {
  
  inline def apply(docs: String, `type`: String): JsonDocsMethodReturn = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDocsMethodReturn]
  }
  
  extension [Self <: JsonDocsMethodReturn](x: Self) {
    
    inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
