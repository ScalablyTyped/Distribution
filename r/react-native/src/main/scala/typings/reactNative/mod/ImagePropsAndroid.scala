package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.auto
import typings.reactNative.reactNativeStrings.resize
import typings.reactNative.reactNativeStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePropsAndroid extends StObject {
  
  /**
    * Duration of fade in animation in ms. Defaults to 300
    *
    * @platform android
    */
  var fadeDuration: js.UndefOr[Double] = js.native
  
  /**
    * Required if loading images via 'uri' from drawable folder on Android
    * Explanation: https://medium.com/@adamjacobb/react-native-performance-images-adf5843e120
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The mechanism that should be used to resize the image when the image's dimensions
    * differ from the image view's dimensions. Defaults to auto.
    *
    * 'auto': Use heuristics to pick between resize and scale.
    *
    * 'resize': A software operation which changes the encoded image in memory before it gets decoded.
    * This should be used instead of scale when the image is much larger than the view.
    *
    * 'scale': The image gets drawn downscaled or upscaled. Compared to resize, scale is faster (usually hardware accelerated)
    * and produces higher quality images. This should be used if the image is smaller than the view.
    * It should also be used if the image is slightly bigger than the view.
    */
  var resizeMethod: js.UndefOr[auto | resize | scale] = js.native
  
  /**
    * Required if loading images via 'uri' from drawable folder on Android.
    * Explanation: https://medium.com/@adamjacobb/react-native-performance-images-adf5843e120
    */
  var width: js.UndefOr[Double] = js.native
}
object ImagePropsAndroid {
  
  @scala.inline
  def apply(): ImagePropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePropsAndroid]
  }
  
  @scala.inline
  implicit class ImagePropsAndroidMutableBuilder[Self <: ImagePropsAndroid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeDurationUndefined: Self = StObject.set(x, "fadeDuration", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setResizeMethod(value: auto | resize | scale): Self = StObject.set(x, "resizeMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeMethodUndefined: Self = StObject.set(x, "resizeMethod", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
