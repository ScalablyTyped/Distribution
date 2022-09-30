package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Texture providing the current Render Target being rendered. Lens Studio v3.0+ */
trait ScreenTextureProvider
  extends StObject
     with TextureProvider
object ScreenTextureProvider {
  
  inline def apply(
    getAspect: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    isOfType: String => Boolean
  ): ScreenTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[ScreenTextureProvider]
  }
}
