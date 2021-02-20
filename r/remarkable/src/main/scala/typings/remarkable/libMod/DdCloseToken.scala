package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dd_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait DdCloseToken extends TagToken {
  
  @JSName("type")
  var type_DdCloseToken: dd_close = js.native
}
object DdCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: dd_close): DdCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DdCloseToken]
  }
  
  @scala.inline
  implicit class DdCloseTokenMutableBuilder[Self <: DdCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dd_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
