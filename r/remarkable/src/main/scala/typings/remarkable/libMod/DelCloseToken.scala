package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.del_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait DelCloseToken extends TagToken {
  
  @JSName("type")
  var type_DelCloseToken: del_open = js.native
}
object DelCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: del_open): DelCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelCloseToken]
  }
  
  @scala.inline
  implicit class DelCloseTokenMutableBuilder[Self <: DelCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: del_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
