package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides depth information of the video feed that the Lens is being applied to when available, such as in Lenses for Spectacles 3. Can be accessed from mainPass.baseTex.control of a Spectacles
  * Depth material.
  */
trait DepthTextureProvider
  extends StObject
     with TextureProvider {
  
  /**
    * Returns the depth at the screen space position “point”. The value returned is between 0 and 6,550, which corresponds to the distance the point is from the camera in centimeters, or world-space
    * units. If depth data is not available, -1 will be returned. Note that depth data isn’t available during the very first Initialize event, before TurnOn event fires.
    */
  def getDepth(point: vec2): Double
}
object DepthTextureProvider {
  
  inline def apply(
    getAspect: () => Double,
    getDepth: vec2 => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    isOfType: String => Boolean
  ): DepthTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = js.Any.fromFunction0(getAspect), getDepth = js.Any.fromFunction1(getDepth), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[DepthTextureProvider]
  }
  
  extension [Self <: DepthTextureProvider](x: Self) {
    
    inline def setGetDepth(value: vec2 => Double): Self = StObject.set(x, "getDepth", js.Any.fromFunction1(value))
  }
}
