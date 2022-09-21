package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrerenderUrlRequest extends StObject {
  
  var appDir: String
  
  var baseUrl: String
  
  var buildId: String
  
  var componentGraphPath: String
  
  var devServerHostUrl: String
  
  var hydrateAppFilePath: String
  
  var isDebug: Boolean
  
  var prerenderConfigPath: String
  
  var staticSite: Boolean
  
  var templateId: String
  
  var url: String
  
  var writeToFilePath: String
}
object PrerenderUrlRequest {
  
  inline def apply(
    appDir: String,
    baseUrl: String,
    buildId: String,
    componentGraphPath: String,
    devServerHostUrl: String,
    hydrateAppFilePath: String,
    isDebug: Boolean,
    prerenderConfigPath: String,
    staticSite: Boolean,
    templateId: String,
    url: String,
    writeToFilePath: String
  ): PrerenderUrlRequest = {
    val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], componentGraphPath = componentGraphPath.asInstanceOf[js.Any], devServerHostUrl = devServerHostUrl.asInstanceOf[js.Any], hydrateAppFilePath = hydrateAppFilePath.asInstanceOf[js.Any], isDebug = isDebug.asInstanceOf[js.Any], prerenderConfigPath = prerenderConfigPath.asInstanceOf[js.Any], staticSite = staticSite.asInstanceOf[js.Any], templateId = templateId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], writeToFilePath = writeToFilePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderUrlRequest]
  }
  
  extension [Self <: PrerenderUrlRequest](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setComponentGraphPath(value: String): Self = StObject.set(x, "componentGraphPath", value.asInstanceOf[js.Any])
    
    inline def setDevServerHostUrl(value: String): Self = StObject.set(x, "devServerHostUrl", value.asInstanceOf[js.Any])
    
    inline def setHydrateAppFilePath(value: String): Self = StObject.set(x, "hydrateAppFilePath", value.asInstanceOf[js.Any])
    
    inline def setIsDebug(value: Boolean): Self = StObject.set(x, "isDebug", value.asInstanceOf[js.Any])
    
    inline def setPrerenderConfigPath(value: String): Self = StObject.set(x, "prerenderConfigPath", value.asInstanceOf[js.Any])
    
    inline def setStaticSite(value: Boolean): Self = StObject.set(x, "staticSite", value.asInstanceOf[js.Any])
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWriteToFilePath(value: String): Self = StObject.set(x, "writeToFilePath", value.asInstanceOf[js.Any])
  }
}
