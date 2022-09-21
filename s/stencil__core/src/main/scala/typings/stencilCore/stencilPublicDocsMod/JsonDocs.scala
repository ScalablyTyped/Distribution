package typings.stencilCore.stencilPublicDocsMod

import typings.stencilCore.anon.NameTypescriptVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonDocs extends StObject {
  
  var compiler: NameTypescriptVersion
  
  var components: js.Array[JsonDocsComponent]
  
  var timestamp: String
}
object JsonDocs {
  
  inline def apply(compiler: NameTypescriptVersion, components: js.Array[JsonDocsComponent], timestamp: String): JsonDocs = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDocs]
  }
  
  extension [Self <: JsonDocs](x: Self) {
    
    inline def setCompiler(value: NameTypescriptVersion): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: js.Array[JsonDocsComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: JsonDocsComponent*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
