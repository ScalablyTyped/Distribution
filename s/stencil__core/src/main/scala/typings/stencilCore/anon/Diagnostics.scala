package typings.stencilCore.anon

import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostics extends StObject {
  
  var diagnostics: js.Array[Diagnostic]
}
object Diagnostics {
  
  inline def apply(diagnostics: js.Array[Diagnostic]): Diagnostics = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostics]
  }
  
  extension [Self <: Diagnostics](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
  }
}
