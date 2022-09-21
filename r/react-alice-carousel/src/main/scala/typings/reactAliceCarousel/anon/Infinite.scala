package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Infinite extends StObject {
  
  var infinite: js.UndefOr[Boolean] = js.undefined
  
  var itemsCount: js.UndefOr[Double] = js.undefined
  
  var startIndex: js.UndefOr[Double] = js.undefined
}
object Infinite {
  
  inline def apply(): Infinite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Infinite]
  }
  
  extension [Self <: Infinite](x: Self) {
    
    inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
    
    inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
    
    inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
    
    inline def setItemsCountUndefined: Self = StObject.set(x, "itemsCount", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
  }
}
