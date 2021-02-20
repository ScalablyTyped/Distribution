package typings.reactNativeShare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// iOS 11 or later
@js.native
trait LinkMetadata extends StObject {
  
  var icon: js.UndefOr[String] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var originalUrl: js.UndefOr[String] = js.native
  
  var remoteVideoUrl: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var video: js.UndefOr[String] = js.native
}
object LinkMetadata {
  
  @scala.inline
  def apply(): LinkMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkMetadata]
  }
  
  @scala.inline
  implicit class LinkMetadataMutableBuilder[Self <: LinkMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
    
    @scala.inline
    def setRemoteVideoUrl(value: String): Self = StObject.set(x, "remoteVideoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteVideoUrlUndefined: Self = StObject.set(x, "remoteVideoUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
