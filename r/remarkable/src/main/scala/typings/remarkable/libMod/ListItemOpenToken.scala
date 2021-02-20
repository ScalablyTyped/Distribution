package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.list_item_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait ListItemOpenToken extends TagToken {
  
  @JSName("type")
  var type_ListItemOpenToken: list_item_open = js.native
}
object ListItemOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: list_item_open): ListItemOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemOpenToken]
  }
  
  @scala.inline
  implicit class ListItemOpenTokenMutableBuilder[Self <: ListItemOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: list_item_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
