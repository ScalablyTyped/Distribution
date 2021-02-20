package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.td_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait TDOpenToken extends TagToken {
  
  @JSName("type")
  var type_TDOpenToken: td_open = js.native
}
object TDOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: td_open): TDOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDOpenToken]
  }
  
  @scala.inline
  implicit class TDOpenTokenMutableBuilder[Self <: TDOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: td_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
