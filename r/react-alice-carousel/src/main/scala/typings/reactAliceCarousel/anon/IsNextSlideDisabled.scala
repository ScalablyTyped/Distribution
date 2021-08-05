package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNextSlideDisabled extends StObject {
  
  var isNextSlideDisabled: Boolean
  
  var isPrevSlideDisabled: Boolean
  
  var item: Double
  
  var itemsInSlide: Double
  
  var slide: Double
}
object IsNextSlideDisabled {
  
  inline def apply(
    isNextSlideDisabled: Boolean,
    isPrevSlideDisabled: Boolean,
    item: Double,
    itemsInSlide: Double,
    slide: Double
  ): IsNextSlideDisabled = {
    val __obj = js.Dynamic.literal(isNextSlideDisabled = isNextSlideDisabled.asInstanceOf[js.Any], isPrevSlideDisabled = isPrevSlideDisabled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNextSlideDisabled]
  }
  
  extension [Self <: IsNextSlideDisabled](x: Self) {
    
    inline def setIsNextSlideDisabled(value: Boolean): Self = StObject.set(x, "isNextSlideDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsPrevSlideDisabled(value: Boolean): Self = StObject.set(x, "isPrevSlideDisabled", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemsInSlide(value: Double): Self = StObject.set(x, "itemsInSlide", value.asInstanceOf[js.Any])
    
    inline def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
  }
}
