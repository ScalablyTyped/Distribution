package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotBuild extends StObject {
  
  var appNamespace: String
  
  var author: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var message: String
  
  var previewUrl: js.UndefOr[String] = js.undefined
  
  var screenshots: js.Array[Screenshot]
  
  var timestamp: Double
  
  var url: js.UndefOr[String] = js.undefined
}
object ScreenshotBuild {
  
  inline def apply(
    appNamespace: String,
    id: String,
    message: String,
    screenshots: js.Array[Screenshot],
    timestamp: Double
  ): ScreenshotBuild = {
    val __obj = js.Dynamic.literal(appNamespace = appNamespace.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], screenshots = screenshots.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenshotBuild]
  }
  
  extension [Self <: ScreenshotBuild](x: Self) {
    
    inline def setAppNamespace(value: String): Self = StObject.set(x, "appNamespace", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPreviewUrl(value: String): Self = StObject.set(x, "previewUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewUrlUndefined: Self = StObject.set(x, "previewUrl", js.undefined)
    
    inline def setScreenshots(value: js.Array[Screenshot]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
    
    inline def setScreenshotsVarargs(value: Screenshot*): Self = StObject.set(x, "screenshots", js.Array(value*))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
