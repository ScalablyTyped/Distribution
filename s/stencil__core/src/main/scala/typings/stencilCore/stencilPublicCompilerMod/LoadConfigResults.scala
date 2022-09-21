package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.anon.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadConfigResults extends StObject {
  
  var config: ValidatedConfig
  
  var diagnostics: js.Array[Diagnostic]
  
  var tsconfig: CompilerOptions
}
object LoadConfigResults {
  
  inline def apply(config: ValidatedConfig, diagnostics: js.Array[Diagnostic], tsconfig: CompilerOptions): LoadConfigResults = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], tsconfig = tsconfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadConfigResults]
  }
  
  extension [Self <: LoadConfigResults](x: Self) {
    
    inline def setConfig(value: ValidatedConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setTsconfig(value: CompilerOptions): Self = StObject.set(x, "tsconfig", value.asInstanceOf[js.Any])
  }
}
