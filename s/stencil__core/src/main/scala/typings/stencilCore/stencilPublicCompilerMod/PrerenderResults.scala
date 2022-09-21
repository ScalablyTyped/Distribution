package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderResults extends StObject {
  
  var average: Double
  
  var buildId: String
  
  var diagnostics: js.Array[Diagnostic]
  
  var duration: Double
  
  var urls: Double
}
object PrerenderResults {
  
  inline def apply(
    average: Double,
    buildId: String,
    diagnostics: js.Array[Diagnostic],
    duration: Double,
    urls: Double
  ): PrerenderResults = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderResults]
  }
  
  extension [Self <: PrerenderResults](x: Self) {
    
    inline def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: Double): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
  }
}
