package typings.smallweiAvue.anon

import typings.smallweiAvue.smallweiAvueStrings.ascending
import typings.smallweiAvue.smallweiAvueStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Order extends StObject {
  
  var order: ascending | descending
  
  var prop: String
}
object Order {
  
  inline def apply(order: ascending | descending, prop: String): Order = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: ascending | descending): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
  }
}
