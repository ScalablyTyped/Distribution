package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition. */
trait IntersectionObserverEntry extends StObject {
  
  /* standard dom */
  val boundingClientRect: DOMRectReadOnly
  
  /* standard dom */
  val intersectionRatio: Double
  
  /* standard dom */
  val intersectionRect: DOMRectReadOnly
  
  /* standard dom */
  val isIntersecting: scala.Boolean
  
  /* standard dom */
  val rootBounds: DOMRectReadOnly | Null
  
  /* standard dom */
  val target: Element
  
  /* standard dom */
  val time: DOMHighResTimeStamp
}
object IntersectionObserverEntry {
  
  inline def apply(
    boundingClientRect: DOMRectReadOnly,
    intersectionRatio: Double,
    intersectionRect: DOMRectReadOnly,
    isIntersecting: scala.Boolean,
    target: Element,
    time: DOMHighResTimeStamp
  ): IntersectionObserverEntry = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], rootBounds = null)
    __obj.asInstanceOf[IntersectionObserverEntry]
  }
  
  extension [Self <: IntersectionObserverEntry](x: Self) {
    
    inline def setBoundingClientRect(value: DOMRectReadOnly): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    inline def setIntersectionRatio(value: Double): Self = StObject.set(x, "intersectionRatio", value.asInstanceOf[js.Any])
    
    inline def setIntersectionRect(value: DOMRectReadOnly): Self = StObject.set(x, "intersectionRect", value.asInstanceOf[js.Any])
    
    inline def setIsIntersecting(value: scala.Boolean): Self = StObject.set(x, "isIntersecting", value.asInstanceOf[js.Any])
    
    inline def setRootBounds(value: DOMRectReadOnly): Self = StObject.set(x, "rootBounds", value.asInstanceOf[js.Any])
    
    inline def setRootBoundsNull: Self = StObject.set(x, "rootBounds", null)
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
