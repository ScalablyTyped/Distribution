package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilPublicCompilerMod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderUrlResults extends StObject {
  
  var anchorUrls: js.Array[String]
  
  var diagnostics: js.Array[Diagnostic]
  
  var filePath: String
}
object PrerenderUrlResults {
  
  inline def apply(anchorUrls: js.Array[String], diagnostics: js.Array[Diagnostic], filePath: String): PrerenderUrlResults = {
    val __obj = js.Dynamic.literal(anchorUrls = anchorUrls.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderUrlResults]
  }
  
  extension [Self <: PrerenderUrlResults](x: Self) {
    
    inline def setAnchorUrls(value: js.Array[String]): Self = StObject.set(x, "anchorUrls", value.asInstanceOf[js.Any])
    
    inline def setAnchorUrlsVarargs(value: String*): Self = StObject.set(x, "anchorUrls", js.Array(value*))
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
