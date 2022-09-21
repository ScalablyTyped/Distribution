package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginTransformResults extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var diagnostics: js.UndefOr[js.Array[Diagnostic]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var map: js.UndefOr[String] = js.undefined
}
object PluginTransformResults {
  
  inline def apply(): PluginTransformResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginTransformResults]
  }
  
  extension [Self <: PluginTransformResults](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
  }
}
