package typings.reactNative.mod

import typings.reactNative.anon.Height
import typings.reactNative.anon.X
import typings.reactNative.reactNativeStrings.contain
import typings.reactNative.reactNativeStrings.cover
import typings.reactNative.reactNativeStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageCropData extends StObject {
  
  /**
    * (Optional) size to scale the cropped image to.
    */
  var displaySize: js.UndefOr[Height] = js.native
  
  /**
    * The top-left corner of the cropped image, specified in the original
    * image's coordinate space.
    */
  var offset: X = js.native
  
  /**
    * (Optional) the resizing mode to use when scaling the image. If the
    * `displaySize` param is not specified, this has no effect.
    */
  var resizeMode: js.UndefOr[contain | cover | stretch] = js.native
  
  /**
    * The size (dimensions) of the cropped image, specified in the original
    * image's coordinate space.
    */
  var size: Height = js.native
}
object ImageCropData {
  
  @scala.inline
  def apply(offset: X, size: Height): ImageCropData = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCropData]
  }
  
  @scala.inline
  implicit class ImageCropDataMutableBuilder[Self <: ImageCropData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplaySize(value: Height): Self = StObject.set(x, "displaySize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaySizeUndefined: Self = StObject.set(x, "displaySize", js.undefined)
    
    @scala.inline
    def setOffset(value: X): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeMode(value: contain | cover | stretch): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    @scala.inline
    def setSize(value: Height): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
