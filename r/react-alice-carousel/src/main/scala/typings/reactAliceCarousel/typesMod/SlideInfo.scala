package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideInfo extends StObject {
  
  var item: Double
  
  var itemsCount: Double
}
object SlideInfo {
  
  inline def apply(item: Double, itemsCount: Double): SlideInfo = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideInfo]
  }
  
  extension [Self <: SlideInfo](x: Self) {
    
    inline def setItem(value: Double): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
  }
}
