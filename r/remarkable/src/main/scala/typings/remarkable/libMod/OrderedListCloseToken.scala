package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.ordered_list_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait OrderedListCloseToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_OrderedListCloseToken: ordered_list_close
}
object OrderedListCloseToken {
  
  inline def apply(level: Double): OrderedListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ordered_list_close")
    __obj.asInstanceOf[OrderedListCloseToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderedListCloseToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: ordered_list_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
