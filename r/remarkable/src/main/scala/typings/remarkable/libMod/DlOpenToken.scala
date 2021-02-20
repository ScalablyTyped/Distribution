package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dl_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait DlOpenToken extends TagToken {
  
  @JSName("type")
  var type_DlOpenToken: dl_open = js.native
}
object DlOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: dl_open): DlOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DlOpenToken]
  }
  
  @scala.inline
  implicit class DlOpenTokenMutableBuilder[Self <: DlOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: dl_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
