package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Texture Provider giving a cropped region of the input texture, calculated based on face position. Can be accessed using Texture.control on a FaceCropTexture asset. For more information, see the
  * Crop Textures guide.
  */
trait FaceCropTextureProvider
  extends StObject
     with CropTextureProvider {
  
  /** Ratio of the mouth position on the cropped texture. Value ranges from 0 to 1, with 0 having no effect and 1 centering the image on the mouth. */
  var faceCenterMouthWeight: Double
  
  /** Index of the face being tracked. */
  var faceIndex: Double
  
  /** Scaling of the cropped texture. */
  var textureScale: vec2
}
object FaceCropTextureProvider {
  
  inline def apply(
    faceCenterMouthWeight: Double,
    faceIndex: Double,
    getAspect: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    inputTexture: Texture,
    isOfType: String => Boolean,
    textureScale: vec2
  ): FaceCropTextureProvider = {
    val __obj = js.Dynamic.literal(faceCenterMouthWeight = faceCenterMouthWeight.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), inputTexture = inputTexture.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), textureScale = textureScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceCropTextureProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceCropTextureProvider] (val x: Self) extends AnyVal {
    
    inline def setFaceCenterMouthWeight(value: Double): Self = StObject.set(x, "faceCenterMouthWeight", value.asInstanceOf[js.Any])
    
    inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
    
    inline def setTextureScale(value: vec2): Self = StObject.set(x, "textureScale", value.asInstanceOf[js.Any])
  }
}
