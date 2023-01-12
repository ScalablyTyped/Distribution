package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TextureProvider for face textures. See the Face Texture Guide for more information. Can be accessed using Texture.control on a face texture asset. */
trait FaceTextureProvider
  extends StObject
     with TextureProvider {
  
  /** The source texture being drawn. This is useful for controlling which effects are visible on the face texture, based on which camera output texture is being used. */
  var inputTexture: Texture
  
  /**
    * The x and y scale used to draw the face within the texture region. A lower scale will be more zoomed in on the face, and a higher scale will be more zoomed out. The default scale is
    * (1, 1).
    */
  var scale: vec2
}
object FaceTextureProvider {
  
  inline def apply(
    getAspect: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    inputTexture: Texture,
    isOfType: String => Boolean,
    scale: vec2
  ): FaceTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), inputTexture = inputTexture.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceTextureProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceTextureProvider] (val x: Self) extends AnyVal {
    
    inline def setInputTexture(value: Texture): Self = StObject.set(x, "inputTexture", value.asInstanceOf[js.Any])
    
    inline def setScale(value: vec2): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
