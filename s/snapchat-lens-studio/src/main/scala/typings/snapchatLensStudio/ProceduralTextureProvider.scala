package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a texture that can be written to or read from. Can be accessed using Texture.control on a Procedural Texture. */
trait ProceduralTextureProvider
  extends StObject
     with TextureProvider {
  
  /**
    * Returns a Uint8 array containing the pixel values in a region of the texture. The region starts at the pixel coordinates x, y, and extends rightward by width and upward by height. Values
    * returned are integers ranging from 0 to 255.
    */
  def getPixels(x: Double, y: Double, width: Double, height: Double, data: js.typedarray.Uint8Array): Unit
  
  /**
    * Sets a region of pixels on the texture. The region starts at the pixel coordinates x, y, and extends rightward by width and upward by height. Uses the values of the passed in Uint8Array data,
    * which should be integer values ranging from 0 to 255.
    */
  def setPixels(x: Double, y: Double, width: Double, height: Double, data: js.typedarray.Uint8Array): Unit
}
object ProceduralTextureProvider {
  
  inline def apply(
    getAspect: () => Double,
    getHeight: () => Double,
    getPixels: (Double, Double, Double, Double, js.typedarray.Uint8Array) => Unit,
    getTypeName: () => String,
    getWidth: () => Double,
    isOfType: String => Boolean,
    setPixels: (Double, Double, Double, Double, js.typedarray.Uint8Array) => Unit
  ): ProceduralTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getPixels = js.Any.fromFunction5(getPixels), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), isOfType = js.Any.fromFunction1(isOfType), setPixels = js.Any.fromFunction5(setPixels))
    __obj.asInstanceOf[ProceduralTextureProvider]
  }
  
  extension [Self <: ProceduralTextureProvider](x: Self) {
    
    inline def setGetPixels(value: (Double, Double, Double, Double, js.typedarray.Uint8Array) => Unit): Self = StObject.set(x, "getPixels", js.Any.fromFunction5(value))
    
    inline def setSetPixels(value: (Double, Double, Double, Double, js.typedarray.Uint8Array) => Unit): Self = StObject.set(x, "setPixels", js.Any.fromFunction5(value))
  }
}
