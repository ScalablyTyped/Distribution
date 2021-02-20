package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.mark_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait MarkCloseToken extends TagToken {
  
  @JSName("type")
  var type_MarkCloseToken: mark_close = js.native
}
object MarkCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: mark_close): MarkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkCloseToken]
  }
  
  @scala.inline
  implicit class MarkCloseTokenMutableBuilder[Self <: MarkCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: mark_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
