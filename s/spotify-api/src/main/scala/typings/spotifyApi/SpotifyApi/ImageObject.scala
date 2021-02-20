package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Image Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait ImageObject extends StObject {
  
  /**
    * The image height in pixels. If unknown: `null` or not returned.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The source URL of the image.
    */
  var url: String = js.native
  
  /**
    * The image width in pixels. If unknown: null or not returned.
    */
  var width: js.UndefOr[Double] = js.native
}
object ImageObject {
  
  @scala.inline
  def apply(url: String): ImageObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageObject]
  }
  
  @scala.inline
  implicit class ImageObjectMutableBuilder[Self <: ImageObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
