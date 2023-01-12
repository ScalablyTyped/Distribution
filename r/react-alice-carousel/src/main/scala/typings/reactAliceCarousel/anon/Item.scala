package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: Double
  
  var itemsCount: Double
}
object Item {
  
  inline def apply(item: Double, itemsCount: Double): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Double): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
  }
}
