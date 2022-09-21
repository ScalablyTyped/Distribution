package typings.stencilCore.stencilPublicDocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDocsStyle extends StObject {
  
  var annotation: String
  
  var docs: String
  
  var name: String
}
object JsonDocsStyle {
  
  inline def apply(annotation: String, docs: String, name: String): JsonDocsStyle = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDocsStyle]
  }
  
  extension [Self <: JsonDocsStyle](x: Self) {
    
    inline def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
