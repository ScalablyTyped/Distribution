package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Texture Provider providing a cropped region of the input texture. The region is specified by the cropRect in local space and rotation. Can be accessed using Texture.control on a RectCropTexture
  * asset, such as a Screen Crop Texture. For more information, see the Crop Textures guide.
  */
trait RectCropTextureProvider
  extends StObject
     with CropTextureProvider {
  
  /** The cropped region to draw. */
  var cropRect: Rect
  
  /**  in: Angle, radians, the cropped region is rotated by. */
  var rotation: Double
}
object RectCropTextureProvider {
  
  inline def apply(
    cropRect: Rect,
    getAspect: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    inputTexture: Texture,
    isOfType: String => Boolean,
    rotation: Double
  ): RectCropTextureProvider = {
    val __obj = js.Dynamic.literal(cropRect = cropRect.asInstanceOf[js.Any], getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), inputTexture = inputTexture.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), rotation = rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectCropTextureProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RectCropTextureProvider] (val x: Self) extends AnyVal {
    
    inline def setCropRect(value: Rect): Self = StObject.set(x, "cropRect", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
  }
}
