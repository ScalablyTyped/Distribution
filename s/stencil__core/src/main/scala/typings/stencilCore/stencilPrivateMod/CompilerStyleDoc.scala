package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.prop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerStyleDoc extends StObject {
  
  var annotation: prop
  
  var docs: String
  
  var name: String
}
object CompilerStyleDoc {
  
  inline def apply(docs: String, name: String): CompilerStyleDoc = {
    val __obj = js.Dynamic.literal(annotation = "prop", docs = docs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerStyleDoc]
  }
  
  extension [Self <: CompilerStyleDoc](x: Self) {
    
    inline def setAnnotation(value: prop): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
