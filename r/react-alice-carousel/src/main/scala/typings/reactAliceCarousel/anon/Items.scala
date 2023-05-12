package typings.reactAliceCarousel.anon

import typings.reactAliceCarousel.reactAliceCarouselStrings.contain
import typings.reactAliceCarousel.reactAliceCarouselStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items extends StObject {
  
  var items: Double
  
  var itemsFit: js.UndefOr[contain | fill | String] = js.undefined
}
object Items {
  
  inline def apply(items: Double): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
    
    inline def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsFit(value: contain | fill | String): Self = StObject.set(x, "itemsFit", value.asInstanceOf[js.Any])
    
    inline def setItemsFitUndefined: Self = StObject.set(x, "itemsFit", js.undefined)
  }
}
