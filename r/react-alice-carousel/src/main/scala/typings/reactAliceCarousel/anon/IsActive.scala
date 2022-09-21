package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsActive extends StObject {
  
  var activeIndex: Any
  
  var isActive: Any
}
object IsActive {
  
  inline def apply(activeIndex: Any, isActive: Any): IsActive = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsActive]
  }
  
  extension [Self <: IsActive](x: Self) {
    
    inline def setActiveIndex(value: Any): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Any): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
  }
}
