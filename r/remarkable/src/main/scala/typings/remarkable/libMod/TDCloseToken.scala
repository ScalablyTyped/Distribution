package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.td_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait TDCloseToken extends TagToken {
  
  @JSName("type")
  var type_TDCloseToken: td_close = js.native
}
object TDCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: td_close): TDCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDCloseToken]
  }
  
  @scala.inline
  implicit class TDCloseTokenMutableBuilder[Self <: TDCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: td_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
