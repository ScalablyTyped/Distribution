package typings.spectacle.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentSlide extends StObject {
  
  var currentSlide: Double
  
  var numberOfSlides: Double
}
object CurrentSlide {
  
  inline def apply(currentSlide: Double, numberOfSlides: Double): CurrentSlide = {
    val __obj = js.Dynamic.literal(currentSlide = currentSlide.asInstanceOf[js.Any], numberOfSlides = numberOfSlides.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentSlide]
  }
  
  extension [Self <: CurrentSlide](x: Self) {
    
    inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSlides(value: Double): Self = StObject.set(x, "numberOfSlides", value.asInstanceOf[js.Any])
  }
}
