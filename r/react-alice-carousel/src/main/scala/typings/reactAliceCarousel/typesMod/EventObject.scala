package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventObject extends StObject {
  
  var isNextSlideDisabled: Boolean = js.native
  
  var isPrevSlideDisabled: Boolean = js.native
  
  var item: Double = js.native
  
  var itemsInSlide: Double = js.native
  
  var slide: Double = js.native
}
object EventObject {
  
  @scala.inline
  def apply(
    isNextSlideDisabled: Boolean,
    isPrevSlideDisabled: Boolean,
    item: Double,
    itemsInSlide: Double,
    slide: Double
  ): EventObject = {
    val __obj = js.Dynamic.literal(isNextSlideDisabled = isNextSlideDisabled.asInstanceOf[js.Any], isPrevSlideDisabled = isPrevSlideDisabled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemsInSlide = itemsInSlide.asInstanceOf[js.Any], slide = slide.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  
  @scala.inline
  implicit class EventObjectMutableBuilder[Self <: EventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsNextSlideDisabled(value: Boolean): Self = StObject.set(x, "isNextSlideDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrevSlideDisabled(value: Boolean): Self = StObject.set(x, "isPrevSlideDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsInSlide(value: Double): Self = StObject.set(x, "itemsInSlide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlide(value: Double): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
  }
}
