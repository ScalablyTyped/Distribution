package typings.reactNative.mod

import typings.reactNative.anon.Width
import typings.reactNative.anon.X
import typings.reactNative.reactNativeStrings.contain
import typings.reactNative.reactNativeStrings.cover
import typings.reactNative.reactNativeStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCropData extends StObject {
  
  /**
    * (Optional) size to scale the cropped image to.
    */
  var displaySize: js.UndefOr[Width] = js.undefined
  
  /**
    * The top-left corner of the cropped image, specified in the original
    * image's coordinate space.
    */
  var offset: X
  
  /**
    * (Optional) the resizing mode to use when scaling the image. If the
    * `displaySize` param is not specified, this has no effect.
    */
  var resizeMode: js.UndefOr[contain | cover | stretch] = js.undefined
  
  /**
    * The size (dimensions) of the cropped image, specified in the original
    * image's coordinate space.
    */
  var size: Width
}
object ImageCropData {
  
  inline def apply(offset: X, size: Width): ImageCropData = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCropData]
  }
  
  extension [Self <: ImageCropData](x: Self) {
    
    inline def setDisplaySize(value: Width): Self = StObject.set(x, "displaySize", value.asInstanceOf[js.Any])
    
    inline def setDisplaySizeUndefined: Self = StObject.set(x, "displaySize", js.undefined)
    
    inline def setOffset(value: X): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setResizeMode(value: contain | cover | stretch): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    inline def setSize(value: Width): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
