package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.list_item_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait ListItemCloseToken extends TagToken {
  
  @JSName("type")
  var type_ListItemCloseToken: list_item_close = js.native
}
object ListItemCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: list_item_close): ListItemCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemCloseToken]
  }
  
  @scala.inline
  implicit class ListItemCloseTokenMutableBuilder[Self <: ListItemCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: list_item_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
