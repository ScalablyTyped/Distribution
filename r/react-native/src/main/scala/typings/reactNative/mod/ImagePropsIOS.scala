package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePropsIOS extends StObject {
  
  /**
    * blurRadius: the blur radius of the blur filter added to the image
    * @platform ios
    */
  var blurRadius: js.UndefOr[Double] = js.native
  
  /**
    * When the image is resized, the corners of the size specified by capInsets will stay a fixed size,
    * but the center content and borders of the image will be stretched.
    * This is useful for creating resizable rounded buttons, shadows, and other resizable assets.
    * More info on Apple documentation
    */
  var capInsets: js.UndefOr[Insets] = js.native
  
  /**
    * Invoked when a partial load of the image is complete. The definition of
    * what constitutes a "partial load" is loader specific though this is meant
    * for progressive JPEG loads.
    * @platform ios
    */
  var onPartialLoad: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Invoked on download progress with {nativeEvent: {loaded, total}}
    */
  var onProgress: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[ImageProgressEventDataIOS], Unit]] = js.native
}
object ImagePropsIOS {
  
  @scala.inline
  def apply(): ImagePropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePropsIOS]
  }
  
  @scala.inline
  implicit class ImagePropsIOSMutableBuilder[Self <: ImagePropsIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurRadius(value: Double): Self = StObject.set(x, "blurRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurRadiusUndefined: Self = StObject.set(x, "blurRadius", js.undefined)
    
    @scala.inline
    def setCapInsets(value: Insets): Self = StObject.set(x, "capInsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapInsetsUndefined: Self = StObject.set(x, "capInsets", js.undefined)
    
    @scala.inline
    def setOnPartialLoad(value: () => Unit): Self = StObject.set(x, "onPartialLoad", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPartialLoadUndefined: Self = StObject.set(x, "onPartialLoad", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* event */ NativeSyntheticEvent[ImageProgressEventDataIOS] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
  }
}
