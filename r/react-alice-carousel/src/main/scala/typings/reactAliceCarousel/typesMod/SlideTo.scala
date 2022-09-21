package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideTo extends StObject {
  
  var activeIndex: Double
  
  var eventType: js.UndefOr[EventType] = js.undefined
  
  var fadeoutAnimationIndex: js.UndefOr[Double | Null] = js.undefined
  
  var fadeoutAnimationPosition: js.UndefOr[Double | Null] = js.undefined
}
object SlideTo {
  
  inline def apply(activeIndex: Double): SlideTo = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideTo]
  }
  
  extension [Self <: SlideTo](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setFadeoutAnimationIndex(value: Double): Self = StObject.set(x, "fadeoutAnimationIndex", value.asInstanceOf[js.Any])
    
    inline def setFadeoutAnimationIndexNull: Self = StObject.set(x, "fadeoutAnimationIndex", null)
    
    inline def setFadeoutAnimationIndexUndefined: Self = StObject.set(x, "fadeoutAnimationIndex", js.undefined)
    
    inline def setFadeoutAnimationPosition(value: Double): Self = StObject.set(x, "fadeoutAnimationPosition", value.asInstanceOf[js.Any])
    
    inline def setFadeoutAnimationPositionNull: Self = StObject.set(x, "fadeoutAnimationPosition", null)
    
    inline def setFadeoutAnimationPositionUndefined: Self = StObject.set(x, "fadeoutAnimationPosition", js.undefined)
  }
}
