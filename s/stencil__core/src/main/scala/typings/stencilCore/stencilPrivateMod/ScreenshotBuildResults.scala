package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotBuildResults extends StObject {
  
  var appNamespace: String
  
  var compare: ScreenshotCompareResults
  
  var currentBuild: ScreenshotBuild
  
  var masterBuild: ScreenshotBuild
}
object ScreenshotBuildResults {
  
  inline def apply(
    appNamespace: String,
    compare: ScreenshotCompareResults,
    currentBuild: ScreenshotBuild,
    masterBuild: ScreenshotBuild
  ): ScreenshotBuildResults = {
    val __obj = js.Dynamic.literal(appNamespace = appNamespace.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], currentBuild = currentBuild.asInstanceOf[js.Any], masterBuild = masterBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotBuildResults]
  }
  
  extension [Self <: ScreenshotBuildResults](x: Self) {
    
    inline def setAppNamespace(value: String): Self = StObject.set(x, "appNamespace", value.asInstanceOf[js.Any])
    
    inline def setCompare(value: ScreenshotCompareResults): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCurrentBuild(value: ScreenshotBuild): Self = StObject.set(x, "currentBuild", value.asInstanceOf[js.Any])
    
    inline def setMasterBuild(value: ScreenshotBuild): Self = StObject.set(x, "masterBuild", value.asInstanceOf[js.Any])
  }
}
