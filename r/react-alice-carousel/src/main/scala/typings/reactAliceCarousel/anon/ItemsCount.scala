package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsCount extends StObject {
  
  var activeIndex: Any
  
  var itemsCount: Any
  
  var renderSlideInfo: Any
}
object ItemsCount {
  
  inline def apply(activeIndex: Any, itemsCount: Any, renderSlideInfo: Any): ItemsCount = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any], renderSlideInfo = renderSlideInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsCount] (val x: Self) extends AnyVal {
    
    inline def setActiveIndex(value: Any): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setItemsCount(value: Any): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
    
    inline def setRenderSlideInfo(value: Any): Self = StObject.set(x, "renderSlideInfo", value.asInstanceOf[js.Any])
  }
}
