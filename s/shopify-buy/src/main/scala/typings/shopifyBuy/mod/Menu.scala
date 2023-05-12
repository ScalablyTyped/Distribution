package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu
  extends StObject
     with Node {
  
  var handle: String
  
  var items: js.Array[MenuItem]
  
  var itemsCount: Double
  
  var title: String
}
object Menu {
  
  inline def apply(handle: String, id: ID, items: js.Array[MenuItem], itemsCount: Double, title: String): Menu = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], itemsCount = itemsCount.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Menu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Menu] (val x: Self) extends AnyVal {
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[MenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsCount(value: Double): Self = StObject.set(x, "itemsCount", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: MenuItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
