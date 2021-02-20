package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dl_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait DlCloseToken extends TagToken {
  
  @JSName("type")
  var type_DlCloseToken: dl_close = js.native
}
object DlCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: dl_close): DlCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DlCloseToken]
  }
  
  @scala.inline
  implicit class DlCloseTokenMutableBuilder[Self <: DlCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dl_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
