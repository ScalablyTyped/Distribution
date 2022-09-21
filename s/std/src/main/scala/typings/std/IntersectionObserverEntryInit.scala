package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntersectionObserverEntryInit extends StObject {
  
  /* standard dom */
  var boundingClientRect: DOMRectInit
  
  /* standard dom */
  var intersectionRatio: Double
  
  /* standard dom */
  var intersectionRect: DOMRectInit
  
  /* standard dom */
  var isIntersecting: scala.Boolean
  
  /* standard dom */
  var rootBounds: DOMRectInit | Null
  
  /* standard dom */
  var target: Element
  
  /* standard dom */
  var time: DOMHighResTimeStamp
}
object IntersectionObserverEntryInit {
  
  inline def apply(
    boundingClientRect: DOMRectInit,
    intersectionRatio: Double,
    intersectionRect: DOMRectInit,
    isIntersecting: scala.Boolean,
    target: Element,
    time: DOMHighResTimeStamp
  ): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], rootBounds = null)
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
  
  extension [Self <: IntersectionObserverEntryInit](x: Self) {
    
    inline def setBoundingClientRect(value: DOMRectInit): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    inline def setIntersectionRatio(value: Double): Self = StObject.set(x, "intersectionRatio", value.asInstanceOf[js.Any])
    
    inline def setIntersectionRect(value: DOMRectInit): Self = StObject.set(x, "intersectionRect", value.asInstanceOf[js.Any])
    
    inline def setIsIntersecting(value: scala.Boolean): Self = StObject.set(x, "isIntersecting", value.asInstanceOf[js.Any])
    
    inline def setRootBounds(value: DOMRectInit): Self = StObject.set(x, "rootBounds", value.asInstanceOf[js.Any])
    
    inline def setRootBoundsNull: Self = StObject.set(x, "rootBounds", null)
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
