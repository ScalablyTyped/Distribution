package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderPropsIOS extends ViewProps {
  
  /**
    * Assigns a maximum track image. Only static images are supported.
    * The leftmost pixel of the image will be stretched to fill the track.
    */
  var maximumTrackImage: js.UndefOr[ImageURISource] = js.native
  
  /**
    * Assigns a minimum track image. Only static images are supported.
    * The rightmost pixel of the image will be stretched to fill the track.
    */
  var minimumTrackImage: js.UndefOr[ImageURISource] = js.native
  
  /**
    * Sets an image for the thumb. Only static images are supported.
    */
  var thumbImage: js.UndefOr[ImageURISource] = js.native
  
  /**
    * Assigns a single image for the track. Only static images
    * are supported. The center pixel of the image will be stretched
    * to fill the track.
    */
  var trackImage: js.UndefOr[ImageURISource] = js.native
}
object SliderPropsIOS {
  
  @scala.inline
  def apply(): SliderPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderPropsIOS]
  }
  
  @scala.inline
  implicit class SliderPropsIOSMutableBuilder[Self <: SliderPropsIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximumTrackImage(value: ImageURISource): Self = StObject.set(x, "maximumTrackImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTrackImageUndefined: Self = StObject.set(x, "maximumTrackImage", js.undefined)
    
    @scala.inline
    def setMinimumTrackImage(value: ImageURISource): Self = StObject.set(x, "minimumTrackImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumTrackImageUndefined: Self = StObject.set(x, "minimumTrackImage", js.undefined)
    
    @scala.inline
    def setThumbImage(value: ImageURISource): Self = StObject.set(x, "thumbImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbImageUndefined: Self = StObject.set(x, "thumbImage", js.undefined)
    
    @scala.inline
    def setTrackImage(value: ImageURISource): Self = StObject.set(x, "trackImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackImageUndefined: Self = StObject.set(x, "trackImage", js.undefined)
  }
}
