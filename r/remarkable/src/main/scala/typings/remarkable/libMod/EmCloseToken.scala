package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.em_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait EmCloseToken extends TagToken {
  
  @JSName("type")
  var type_EmCloseToken: em_close = js.native
}
object EmCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: em_close): EmCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmCloseToken]
  }
  
  @scala.inline
  implicit class EmCloseTokenMutableBuilder[Self <: EmCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: em_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
