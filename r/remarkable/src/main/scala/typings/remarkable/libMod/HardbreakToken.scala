package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.hardbreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait HardbreakToken extends TagToken {
  
  @JSName("type")
  var type_HardbreakToken: hardbreak = js.native
}
object HardbreakToken {
  
  @scala.inline
  def apply(level: Double, `type`: hardbreak): HardbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HardbreakToken]
  }
  
  @scala.inline
  implicit class HardbreakTokenMutableBuilder[Self <: HardbreakToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: hardbreak): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
