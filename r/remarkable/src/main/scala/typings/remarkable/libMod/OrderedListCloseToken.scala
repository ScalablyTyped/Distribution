package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.ordered_list_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait OrderedListCloseToken extends TagToken {
  
  @JSName("type")
  var type_OrderedListCloseToken: ordered_list_close = js.native
}
object OrderedListCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: ordered_list_close): OrderedListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedListCloseToken]
  }
  
  @scala.inline
  implicit class OrderedListCloseTokenMutableBuilder[Self <: OrderedListCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ordered_list_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
