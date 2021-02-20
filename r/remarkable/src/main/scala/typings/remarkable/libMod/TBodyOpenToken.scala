package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.tbody_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait TBodyOpenToken extends TagToken {
  
  @JSName("type")
  var type_TBodyOpenToken: tbody_open = js.native
}
object TBodyOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: tbody_open): TBodyOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TBodyOpenToken]
  }
  
  @scala.inline
  implicit class TBodyOpenTokenMutableBuilder[Self <: TBodyOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: tbody_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
