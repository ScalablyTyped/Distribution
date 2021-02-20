package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.tbody_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait TBodyCloseToken extends TagToken {
  
  @JSName("type")
  var type_TBodyCloseToken: tbody_close = js.native
}
object TBodyCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: tbody_close): TBodyCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TBodyCloseToken]
  }
  
  @scala.inline
  implicit class TBodyCloseTokenMutableBuilder[Self <: TBodyCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: tbody_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
