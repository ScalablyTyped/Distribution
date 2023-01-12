package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls an image picker texture and UI. Can be accessed through Texture.control on an Image Picker texture. For more information, see the Image Picker Texture guide. */
trait ImagePickerTextureProvider
  extends StObject
     with TextureProvider {
  
  /** If enabled, the image picker UI will be shown automatically when the Lens starts. */
  var autoShowImagePicker: Boolean
  
  /** Hides the image picker UI. */
  def hideImagePicker(): Unit
  
  /** Binds a callback function for when the user selects or changes an image from the picker. */
  def setImageChangedCallback(callback: js.Function0[Unit]): Unit
  
  /** Shows the image picker UI. */
  def showImagePicker(): Unit
}
object ImagePickerTextureProvider {
  
  inline def apply(
    autoShowImagePicker: Boolean,
    getAspect: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    hideImagePicker: () => Unit,
    isOfType: String => Boolean,
    setImageChangedCallback: js.Function0[Unit] => Unit,
    showImagePicker: () => Unit
  ): ImagePickerTextureProvider = {
    val __obj = js.Dynamic.literal(autoShowImagePicker = autoShowImagePicker.asInstanceOf[js.Any], getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), hideImagePicker = js.Any.fromFunction0(hideImagePicker), isOfType = js.Any.fromFunction1(isOfType), setImageChangedCallback = js.Any.fromFunction1(setImageChangedCallback), showImagePicker = js.Any.fromFunction0(showImagePicker))
    __obj.asInstanceOf[ImagePickerTextureProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImagePickerTextureProvider] (val x: Self) extends AnyVal {
    
    inline def setAutoShowImagePicker(value: Boolean): Self = StObject.set(x, "autoShowImagePicker", value.asInstanceOf[js.Any])
    
    inline def setHideImagePicker(value: () => Unit): Self = StObject.set(x, "hideImagePicker", js.Any.fromFunction0(value))
    
    inline def setSetImageChangedCallback(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "setImageChangedCallback", js.Any.fromFunction1(value))
    
    inline def setShowImagePicker(value: () => Unit): Self = StObject.set(x, "showImagePicker", js.Any.fromFunction0(value))
  }
}
