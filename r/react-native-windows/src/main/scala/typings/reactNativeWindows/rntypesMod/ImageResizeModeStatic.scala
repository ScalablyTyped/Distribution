package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageResizeModeStatic extends StObject {
  
  /**
    * center - The image will be scaled down such that it is completely visible,
    * if bigger than the area of the view.
    * The image will not be scaled up.
    */
  var center: ImageResizeMode
  
  /**
    * contain - The image will be resized such that it will be completely
    * visible, contained within the frame of the View.
    */
  var contain: ImageResizeMode
  
  /**
    * cover - The image will be resized such that the entire area of the view
    * is covered by the image, potentially clipping parts of the image.
    */
  var cover: ImageResizeMode
  
  /**
    * repeat - The image will be repeated to cover the frame of the View. The
    * image will keep it's size and aspect ratio.
    */
  var repeat: ImageResizeMode
  
  /**
    * stretch - The image will be stretched to fill the entire frame of the
    * view without clipping.  This may change the aspect ratio of the image,
    * distoring it.  Only supported on iOS.
    */
  var stretch: ImageResizeMode
}
object ImageResizeModeStatic {
  
  inline def apply(
    center: ImageResizeMode,
    contain: ImageResizeMode,
    cover: ImageResizeMode,
    repeat: ImageResizeMode,
    stretch: ImageResizeMode
  ): ImageResizeModeStatic = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], contain = contain.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageResizeModeStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageResizeModeStatic] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: ImageResizeMode): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setContain(value: ImageResizeMode): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setCover(value: ImageResizeMode): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: ImageResizeMode): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setStretch(value: ImageResizeMode): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
  }
}
