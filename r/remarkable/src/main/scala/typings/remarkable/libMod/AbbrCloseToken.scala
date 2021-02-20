package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.abbr_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait AbbrCloseToken extends TagToken {
  
  @JSName("type")
  var type_AbbrCloseToken: abbr_close = js.native
}
object AbbrCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: abbr_close): AbbrCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbbrCloseToken]
  }
  
  @scala.inline
  implicit class AbbrCloseTokenMutableBuilder[Self <: AbbrCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: abbr_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
