package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderStartOptions extends StObject {
  
  var buildId: js.UndefOr[String] = js.undefined
  
  var componentGraph: BuildResultsComponentGraph
  
  var hydrateAppFilePath: String
  
  var srcIndexHtmlPath: String
}
object PrerenderStartOptions {
  
  inline def apply(componentGraph: BuildResultsComponentGraph, hydrateAppFilePath: String, srcIndexHtmlPath: String): PrerenderStartOptions = {
    val __obj = js.Dynamic.literal(componentGraph = componentGraph.asInstanceOf[js.Any], hydrateAppFilePath = hydrateAppFilePath.asInstanceOf[js.Any], srcIndexHtmlPath = srcIndexHtmlPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderStartOptions]
  }
  
  extension [Self <: PrerenderStartOptions](x: Self) {
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    inline def setComponentGraph(value: BuildResultsComponentGraph): Self = StObject.set(x, "componentGraph", value.asInstanceOf[js.Any])
    
    inline def setHydrateAppFilePath(value: String): Self = StObject.set(x, "hydrateAppFilePath", value.asInstanceOf[js.Any])
    
    inline def setSrcIndexHtmlPath(value: String): Self = StObject.set(x, "srcIndexHtmlPath", value.asInstanceOf[js.Any])
  }
}
