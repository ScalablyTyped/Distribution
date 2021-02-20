package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.strong_close
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait StrongCloseToken extends TagToken {
  
  @JSName("type")
  var type_StrongCloseToken: strong_close = js.native
}
object StrongCloseToken {
  
  @scala.inline
  def apply(level: Double, `type`: strong_close): StrongCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrongCloseToken]
  }
  
  @scala.inline
  implicit class StrongCloseTokenMutableBuilder[Self <: StrongCloseToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: strong_close): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
