package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls a segmentation texture and its placement using information provided by Object tracking. */
trait ObjectTrackingTextureProvider
  extends StObject
     with TextureProvider {
  
  /** Index of the tracked object to use for segmentation. */
  var objectIndex: Double
}
object ObjectTrackingTextureProvider {
  
  inline def apply(
    getAspect: () => Double,
    getHeight: () => Double,
    getTypeName: () => String,
    getWidth: () => Double,
    isOfType: String => Boolean,
    objectIndex: Double
  ): ObjectTrackingTextureProvider = {
    val __obj = js.Dynamic.literal(getAspect = js.Any.fromFunction0(getAspect), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), isOfType = js.Any.fromFunction1(isOfType), objectIndex = objectIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTrackingTextureProvider]
  }
  
  extension [Self <: ObjectTrackingTextureProvider](x: Self) {
    
    inline def setObjectIndex(value: Double): Self = StObject.set(x, "objectIndex", value.asInstanceOf[js.Any])
  }
}
