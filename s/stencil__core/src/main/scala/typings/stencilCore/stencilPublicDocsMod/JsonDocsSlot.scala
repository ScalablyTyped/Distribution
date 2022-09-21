package typings.stencilCore.stencilPublicDocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDocsSlot extends StObject {
  
  var docs: String
  
  var name: String
}
object JsonDocsSlot {
  
  inline def apply(docs: String, name: String): JsonDocsSlot = {
    val __obj = js.Dynamic.literal(docs = docs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDocsSlot]
  }
  
  extension [Self <: JsonDocsSlot](x: Self) {
    
    inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
