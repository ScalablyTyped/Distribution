package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dt_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait DtCloseToken extends TagToken {
  
  @JSName("type")
  var type_DtCloseToken: dt_close = js.native
}
object DtCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: dt_close): DtCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtCloseToken]
  }
  
  @scala.inline
  implicit class DtCloseTokenMutableBuilder[Self <: DtCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dt_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
