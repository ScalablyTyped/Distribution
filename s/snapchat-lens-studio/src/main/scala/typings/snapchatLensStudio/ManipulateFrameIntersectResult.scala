package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result object returned from ManipulateComponent.intersectManipulateFrame().
  * ```
  * // Returns an intersectManipulateFrame based on user touch position
  * //@input Component.ManipulateComponent manip
  *
  * function onTap(eventData)
  * {
  *     var touchPos = eventData.getTouchPosition();
  *     var intersectManipFrame = script.manip.intersectManipulateFrame(touchPos);
  *     if(intersectManipFrame && intersectManipFrame.isValid())
  *     {
  *         screenPoint = intersectManipFrame.getIntersectionPoint();
  *
  *         print(screenPoint.toString());
  *     }
  * }
  * var tapEvent = script.createEvent("TapEvent");
  * tapEvent.bind(onTap);
  * ```
  */
trait ManipulateFrameIntersectResult extends StObject {
  
  /** If there was a valid intersection, returns the intersection point in world space. */
  def getIntersectionPoint(): vec3
  
  /** Returns whether there was a valid intersection. */
  def isValid(): Boolean
}
object ManipulateFrameIntersectResult {
  
  inline def apply(getIntersectionPoint: () => vec3, isValid: () => Boolean): ManipulateFrameIntersectResult = {
    val __obj = js.Dynamic.literal(getIntersectionPoint = js.Any.fromFunction0(getIntersectionPoint), isValid = js.Any.fromFunction0(isValid))
    __obj.asInstanceOf[ManipulateFrameIntersectResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManipulateFrameIntersectResult] (val x: Self) extends AnyVal {
    
    inline def setGetIntersectionPoint(value: () => vec3): Self = StObject.set(x, "getIntersectionPoint", js.Any.fromFunction0(value))
    
    inline def setIsValid(value: () => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
  }
}
