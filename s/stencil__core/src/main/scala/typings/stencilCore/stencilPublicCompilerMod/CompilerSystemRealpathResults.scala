package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerSystemRealpathResults extends StObject {
  
  var error: Any
  
  var path: String
}
object CompilerSystemRealpathResults {
  
  inline def apply(error: Any, path: String): CompilerSystemRealpathResults = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerSystemRealpathResults]
  }
  
  extension [Self <: CompilerSystemRealpathResults](x: Self) {
    
    inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
