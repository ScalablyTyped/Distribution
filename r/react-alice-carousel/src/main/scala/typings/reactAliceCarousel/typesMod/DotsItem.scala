package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DotsItem extends StObject {
  
  var activeIndex: Double
  
  var isActive: Boolean
}
object DotsItem {
  
  inline def apply(activeIndex: Double, isActive: Boolean): DotsItem = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[DotsItem]
  }
  
  extension [Self <: DotsItem](x: Self) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
  }
}
