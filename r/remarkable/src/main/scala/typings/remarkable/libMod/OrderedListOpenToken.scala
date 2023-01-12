package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.ordered_list_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait OrderedListOpenToken
  extends StObject
     with TagToken {
  
  /**
    * Ordered list marker value.
    */
  var order: Double
  
  @JSName("type")
  var type_OrderedListOpenToken: ordered_list_open
}
object OrderedListOpenToken {
  
  inline def apply(level: Double, order: Double): OrderedListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ordered_list_open")
    __obj.asInstanceOf[OrderedListOpenToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderedListOpenToken] (val x: Self) extends AnyVal {
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setType(value: ordered_list_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
