package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dt_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait DtOpenToken extends TagToken {
  
  @JSName("type")
  var type_DtOpenToken: dt_open = js.native
}
object DtOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: dt_open): DtOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtOpenToken]
  }
  
  @scala.inline
  implicit class DtOpenTokenMutableBuilder[Self <: DtOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dt_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
