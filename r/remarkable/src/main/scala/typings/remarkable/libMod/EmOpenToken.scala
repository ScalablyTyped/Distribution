package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.em_open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait EmOpenToken extends TagToken {
  
  @JSName("type")
  var type_EmOpenToken: em_open = js.native
}
object EmOpenToken {
  
  @scala.inline
  def apply(level: Double, `type`: em_open): EmOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmOpenToken]
  }
  
  @scala.inline
  implicit class EmOpenTokenMutableBuilder[Self <: EmOpenToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: em_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
