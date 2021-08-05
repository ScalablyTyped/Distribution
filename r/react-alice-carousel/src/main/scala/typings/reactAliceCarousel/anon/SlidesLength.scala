package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlidesLength extends StObject {
  
  var activeIndex: js.Any
  
  var slidesLength: js.Any
}
object SlidesLength {
  
  inline def apply(activeIndex: js.Any, slidesLength: js.Any): SlidesLength = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], slidesLength = slidesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidesLength]
  }
  
  extension [Self <: SlidesLength](x: Self) {
    
    inline def setActiveIndex(value: js.Any): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setSlidesLength(value: js.Any): Self = StObject.set(x, "slidesLength", value.asInstanceOf[js.Any])
  }
}
