package typings.reactNativeShare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// iOS 11 or later
trait LinkMetadata extends StObject {
  
  var icon: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var originalUrl: js.UndefOr[String] = js.undefined
  
  var remoteVideoUrl: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var video: js.UndefOr[String] = js.undefined
}
object LinkMetadata {
  
  inline def apply(): LinkMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkMetadata]
  }
  
  extension [Self <: LinkMetadata](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
    
    inline def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
    
    inline def setRemoteVideoUrl(value: String): Self = StObject.set(x, "remoteVideoUrl", value.asInstanceOf[js.Any])
    
    inline def setRemoteVideoUrlUndefined: Self = StObject.set(x, "remoteVideoUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
