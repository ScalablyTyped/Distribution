package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionObserverEntryInit extends StObject {
  
  var boundingClientRect: DOMRectInit = js.native
  
  var intersectionRatio: Double = js.native
  
  var intersectionRect: DOMRectInit = js.native
  
  var isIntersecting: scala.Boolean = js.native
  
  var rootBounds: DOMRectInit | Null = js.native
  
  var target: Element = js.native
  
  var time: Double = js.native
}
object IntersectionObserverEntryInit {
  
  @scala.inline
  def apply(
    boundingClientRect: DOMRectInit,
    intersectionRatio: Double,
    intersectionRect: DOMRectInit,
    isIntersecting: scala.Boolean,
    target: Element,
    time: Double
  ): IntersectionObserverEntryInit = {
    val __obj = js.Dynamic.literal(boundingClientRect = boundingClientRect.asInstanceOf[js.Any], intersectionRatio = intersectionRatio.asInstanceOf[js.Any], intersectionRect = intersectionRect.asInstanceOf[js.Any], isIntersecting = isIntersecting.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntersectionObserverEntryInit]
  }
  
  @scala.inline
  implicit class IntersectionObserverEntryInitMutableBuilder[Self <: IntersectionObserverEntryInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingClientRect(value: DOMRectInit): Self = StObject.set(x, "boundingClientRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRatio(value: Double): Self = StObject.set(x, "intersectionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionRect(value: DOMRectInit): Self = StObject.set(x, "intersectionRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIntersecting(value: scala.Boolean): Self = StObject.set(x, "isIntersecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBounds(value: DOMRectInit): Self = StObject.set(x, "rootBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootBoundsNull: Self = StObject.set(x, "rootBounds", null)
    
    @scala.inline
    def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
