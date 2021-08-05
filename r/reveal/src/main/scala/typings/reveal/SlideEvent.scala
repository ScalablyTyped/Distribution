package typings.reveal

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#slide-changed-event
trait SlideEvent extends StObject {
  
  var currentSlide: Element
  
  var indexh: Double
  
  var indexv: js.UndefOr[Double] = js.undefined
  
  var previousSlide: js.UndefOr[Element] = js.undefined
}
object SlideEvent {
  
  inline def apply(currentSlide: Element, indexh: Double): SlideEvent = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], indexh = indexh.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideEvent]
  }
  
  extension [Self <: SlideEvent](x: Self) {
    
    inline def setCurrentSlide(value: Element): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
    
    inline def setIndexh(value: Double): Self = StObject.set(x, "indexh", value.asInstanceOf[js.Any])
    
    inline def setIndexv(value: Double): Self = StObject.set(x, "indexv", value.asInstanceOf[js.Any])
    
    inline def setIndexvUndefined: Self = StObject.set(x, "indexv", js.undefined)
    
    inline def setPreviousSlide(value: Element): Self = StObject.set(x, "previousSlide", value.asInstanceOf[js.Any])
    
    inline def setPreviousSlideUndefined: Self = StObject.set(x, "previousSlide", js.undefined)
  }
}
