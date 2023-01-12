package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base class for Texture Providers that crop an input texture. */
trait CropTextureProvider
  extends StObject
     with TextureProvider {
  
  /** Input texture to crop. */
  var inputTexture: Texture
}
object CropTextureProvider {
  
  inline def apply(
    getAspect: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    inputTexture: Texture,
    isOfType: String => Boolean
  ): CropTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), inputTexture = inputTexture.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[CropTextureProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CropTextureProvider] (val x: Self) extends AnyVal {
    
    inline def setInputTexture(value: Texture): Self = StObject.set(x, "inputTexture", value.asInstanceOf[js.Any])
  }
}
