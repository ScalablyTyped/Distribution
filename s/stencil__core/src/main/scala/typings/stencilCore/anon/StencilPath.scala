package typings.stencilCore.anon

import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StencilPath extends StObject {
  
  var diagnostics: js.Array[Diagnostic]
  
  var stencilPath: String
}
object StencilPath {
  
  inline def apply(diagnostics: js.Array[Diagnostic], stencilPath: String): StencilPath = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], stencilPath = stencilPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[StencilPath]
  }
  
  extension [Self <: StencilPath](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setStencilPath(value: String): Self = StObject.set(x, "stencilPath", value.asInstanceOf[js.Any])
  }
}
