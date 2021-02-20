package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.softbreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ @js.native
trait SoftbreakToken extends TagToken {
  
  @JSName("type")
  var type_SoftbreakToken: softbreak = js.native
}
object SoftbreakToken {
  
  @scala.inline
  def apply(level: Double, `type`: softbreak): SoftbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftbreakToken]
  }
  
  @scala.inline
  implicit class SoftbreakTokenMutableBuilder[Self <: SoftbreakToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: softbreak): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
