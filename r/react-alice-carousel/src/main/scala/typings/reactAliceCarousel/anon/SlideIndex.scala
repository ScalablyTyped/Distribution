package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideIndex extends StObject {
  
  var slideIndex: Double
  
  var slidesLength: Double
}
object SlideIndex {
  
  @scala.inline
  def apply(slideIndex: Double, slidesLength: Double): SlideIndex = {
    val __obj = js.Dynamic.literal(slideIndex = slideIndex.asInstanceOf[js.Any], slidesLength = slidesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideIndex]
  }
  
  @scala.inline
  implicit class SlideIndexMutableBuilder[Self <: SlideIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlidesLength(value: Double): Self = StObject.set(x, "slidesLength", value.asInstanceOf[js.Any])
  }
}
