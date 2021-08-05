package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPrevSlideDisabled extends StObject {
  
  var isNextSlideDisabled: Boolean
  
  var isPrevSlideDisabled: Boolean
}
object IsPrevSlideDisabled {
  
  inline def apply(isNextSlideDisabled: Boolean, isPrevSlideDisabled: Boolean): IsPrevSlideDisabled = {
    val __obj = js.Dynamic.literal(isNextSlideDisabled = isNextSlideDisabled.asInstanceOf[js.Any], isPrevSlideDisabled = isPrevSlideDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrevSlideDisabled]
  }
  
  extension [Self <: IsPrevSlideDisabled](x: Self) {
    
    inline def setIsNextSlideDisabled(value: Boolean): Self = StObject.set(x, "isNextSlideDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsPrevSlideDisabled(value: Boolean): Self = StObject.set(x, "isPrevSlideDisabled", value.asInstanceOf[js.Any])
  }
}
