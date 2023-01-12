package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.list_item_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ListItemOpenToken
  extends StObject
     with TagToken {
  
  @JSName("type")
  var type_ListItemOpenToken: list_item_open
}
object ListItemOpenToken {
  
  inline def apply(level: Double): ListItemOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list_item_open")
    __obj.asInstanceOf[ListItemOpenToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListItemOpenToken] (val x: Self) extends AnyVal {
    
    inline def setType(value: list_item_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
