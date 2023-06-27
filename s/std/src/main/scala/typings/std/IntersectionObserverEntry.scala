package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Intersection Observer API interface describes the intersection between the target element and its root container at a specific moment of transition.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry)
  */
trait IntersectionObserverEntry extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/boundingClientRect) */
  /* standard dom */
  val boundingClientRect: DOMRectReadOnly
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRatio) */
  /* standard dom */
  val intersectionRatio: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/intersectionRect) */
  /* standard dom */
  val intersectionRect: DOMRectReadOnly
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/isIntersecting) */
  /* standard dom */
  val isIntersecting: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/rootBounds) */
  /* standard dom */
  val rootBounds: DOMRectReadOnly | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/target) */
  /* standard dom */
  val target: Element
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IntersectionObserverEntry/time) */
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntersectionObserverEntry] (val x: Self) extends AnyVal {
    
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
