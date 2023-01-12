package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderPropsIOS
  extends StObject
     with ViewProps {
  
  /**
    * Assigns a maximum track image. Only static images are supported.
    * The leftmost pixel of the image will be stretched to fill the track.
    */
  var maximumTrackImage: js.UndefOr[ImageURISource] = js.undefined
  
  /**
    * Assigns a minimum track image. Only static images are supported.
    * The rightmost pixel of the image will be stretched to fill the track.
    */
  var minimumTrackImage: js.UndefOr[ImageURISource] = js.undefined
  
  /**
    * Sets an image for the thumb. Only static images are supported.
    */
  var thumbImage: js.UndefOr[ImageURISource] = js.undefined
  
  /**
    * Assigns a single image for the track. Only static images
    * are supported. The center pixel of the image will be stretched
    * to fill the track.
    */
  var trackImage: js.UndefOr[ImageURISource] = js.undefined
}
object SliderPropsIOS {
  
  inline def apply(): SliderPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderPropsIOS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderPropsIOS] (val x: Self) extends AnyVal {
    
    inline def setMaximumTrackImage(value: ImageURISource): Self = StObject.set(x, "maximumTrackImage", value.asInstanceOf[js.Any])
    
    inline def setMaximumTrackImageUndefined: Self = StObject.set(x, "maximumTrackImage", js.undefined)
    
    inline def setMinimumTrackImage(value: ImageURISource): Self = StObject.set(x, "minimumTrackImage", value.asInstanceOf[js.Any])
    
    inline def setMinimumTrackImageUndefined: Self = StObject.set(x, "minimumTrackImage", js.undefined)
    
    inline def setThumbImage(value: ImageURISource): Self = StObject.set(x, "thumbImage", value.asInstanceOf[js.Any])
    
    inline def setThumbImageUndefined: Self = StObject.set(x, "thumbImage", js.undefined)
    
    inline def setTrackImage(value: ImageURISource): Self = StObject.set(x, "trackImage", value.asInstanceOf[js.Any])
    
    inline def setTrackImageUndefined: Self = StObject.set(x, "trackImage", js.undefined)
  }
}
